/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rei_do_gadoBD;

import com.mycompany.reidogadoclasses.Vendas;
import com.mycompany.reidogadoclasses.ItemVenda;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julio.gslira
 */
public class VendasDAO {

    //jdbc:mysql://localhost:3307/basenotafiscal
    static String URL = "jdbc:mysql://localhost:3306/basenotafiscal";
    static String Login = "root"; // Alterar para o login do bd salvo no seu pc
    static String Senha = "P@$$w0rd"; // Alterar para a senha do bd salvo no seu pc
    
 public static boolean salvar(Vendas obj) {
    boolean retorno = false;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexao = DriverManager.getConnection(URL, Login, Senha);

        // Insert into Vendas table
        PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Vendas (vlrTotal, id_Cli, dataVenda) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
        comandoSQL.setDouble(1, obj.getVlrTotal());
        comandoSQL.setInt(2, obj.getIdCliente());
        comandoSQL.setDate(3, new java.sql.Date(obj.getDataVenda().getTime()));

        int linhasAfetadas = comandoSQL.executeUpdate();

        if (linhasAfetadas > 0) {
            ResultSet rs = comandoSQL.getGeneratedKeys();
            
            if (rs.next()) {
                int idVenda = rs.getInt(1);
                
                for (ItemVenda itemVenda : obj.getItensVenda()) {
                    PreparedStatement comandoSQLItem = conexao.prepareStatement("INSERT INTO itemVenda (idVenda, idProduto, vlrUnitario, qtd) VALUES (?, ?, ?, ?)");
                    comandoSQLItem.setInt(1, idVenda);
                    comandoSQLItem.setInt(2, itemVenda.getIdProduto());
                    comandoSQLItem.setDouble(3, itemVenda.getVlrUnitario());
                    comandoSQLItem.setInt(4, itemVenda.getQtd());

                    int linhasAfetadasItem = comandoSQLItem.executeUpdate();

                    if (linhasAfetadasItem > 0) {
                        retorno = true;
                    }
                }
            }
        }
        conexao.close();
    } catch (ClassNotFoundException | SQLException e) {
        System.out.println(e.getMessage());
    }

    return retorno;
}//fim do salvar
 
  public static int inserirVenda(Vendas venda) {
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        int idVenda = -1;

        try {
            // Passo 1 - Obter a conexão
            conexao = obterConexao();

            // Passo 2 - Inserir a venda na tabela Vendas
            String sqlInserirVenda = "INSERT INTO Vendas (vlrTotal, id_Cli, dataVenda) VALUES (?, ?, ?)";
            comandoSQL = conexao.prepareStatement(sqlInserirVenda, PreparedStatement.RETURN_GENERATED_KEYS);

            comandoSQL.setDouble(1, venda.getVlrTotal());
            comandoSQL.setInt(2, venda.getIdCliente());
            comandoSQL.setDate(3, new java.sql.Date(venda.getDataVenda().getTime()));

            int linhasAfetadas = comandoSQL.executeUpdate();

            // Verificar se a inserção foi bem-sucedida
            if (linhasAfetadas > 0) {
                // Obter o ID gerado para a venda
                rs = comandoSQL.getGeneratedKeys();
                if (rs.next()) {
                    idVenda = rs.getInt(1);
                }
            }
        } catch (SQLException e) {
            // Lida com exceções de SQL
            e.printStackTrace();
        } finally {
            // Passo 3 - Fechar recursos
            fecharRecursos(conexao, comandoSQL, rs);
        }

        return idVenda;
    }

    // Métodos para obter a conexão e fechar recursos, que você pode implementar de acordo com a sua lógica
    private static Connection obterConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Connection conexao = DriverManager.getConnection(URL, Login, Senha);
            } catch (SQLException ex) {
                Logger.getLogger(VendasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private static void fecharRecursos(Connection conexao, PreparedStatement comandoSQL, ResultSet rs) {
        // Implemente a lógica para fechar a conexão e outros recursos
    }
    
    
     // Método para realizar a venda e atualizar o estoque
    public static void realizarVenda(ArrayList<ItemVenda> itensVenda, String cpfCliente) {
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {
            // Passo 1 - Abrir a conexão
            conexao = DriverManager.getConnection(URL, Login, Senha);
            conexao.setAutoCommit(false); // Desabilita o modo de confirmação automática para transações

            // Passo 2 - Inserir a venda no banco de dados
            int idVenda = inserirVenda(conexao, cpfCliente);

            if (idVenda != -1) {
                // Passo 3 - Para cada item de venda, inserir no banco e atualizar estoque
                for (ItemVenda itemVenda : itensVenda) {
                    inserirItemVenda(conexao, idVenda, itemVenda);
                    atualizarEstoque(conexao, itemVenda.getIdProduto(), itemVenda.getQuantidade());
                }

                // Se chegou até aqui sem exceções, realiza o commit da transação
                conexao.commit();
            } else {
                // Se a inserção da venda falhar, realiza o rollback para desfazer as alterações
                conexao.rollback();
            }

        } catch (SQLException ex) {
            // Trata exceções SQL
            ex.printStackTrace();
            try {
                if (conexao != null) {
                    // Se ocorrer uma exceção, realiza o rollback para desfazer as alterações
                    conexao.rollback();
                }
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
        } finally {
            // Passo 4 - Fechar a conexão
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException closeEx) {
                    closeEx.printStackTrace();
                }
            }
        }
    }//fim

    // Método para inserir a venda no banco de dados
    private static int inserirVenda(Connection conexao, String cpfCliente) throws SQLException {
        PreparedStatement comandoSQL = null;
        ResultSet generatedKeys = null;

        try {
            comandoSQL = conexao.prepareStatement("INSERT INTO Vendas (vlrTotal, id_Cli, dataVenda) VALUES (?, (SELECT id_Cli FROM Cliente WHERE cpf = ?), ?)", PreparedStatement.RETURN_GENERATED_KEYS);
            comandoSQL.setDouble(1, calcularValorTotal(ItemVenda)); // Substitua esta chamada pelo seu método de cálculo de valor total
            comandoSQL.setString(2, cpfCliente);
            comandoSQL.setDate(3, new java.sql.Date(new Date().getTime())); // Data atual

            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                // Obtém o ID gerado para a venda
                generatedKeys = comandoSQL.getGeneratedKeys();
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1);
                }
            }

        } finally {
            if (comandoSQL != null) {
                comandoSQL.close();
            }
            if (generatedKeys != null) {
                generatedKeys.close();
            }
        }

        return -1; // Retorna -1 se a inserção falhar
    }

    // Método para inserir um item de venda no banco de dados
    private static void inserirItemVenda(Connection conexao, int idVenda, ItemVenda itemVenda) throws SQLException {
        PreparedStatement comandoSQL = null;

        try {
            comandoSQL = conexao.prepareStatement("INSERT INTO itemVenda (idVenda, idProduto, vlrUnitario, qtd) VALUES (?, ?, ?, ?)");
            comandoSQL.setInt(1, idVenda);
            comandoSQL.setInt(2, itemVenda.getIdProduto());
            comandoSQL.setDouble(3, itemVenda.getValorUnitario());
            comandoSQL.setInt(4, itemVenda.getQuantidade());

            comandoSQL.executeUpdate();

        } finally {
            if (comandoSQL != null) {
                comandoSQL.close();
            }
        }
    }//fim

    // Método para atualizar a quantidade do produto no estoque
    private static void atualizarEstoque(Connection conexao, int idProduto, int quantidade) throws SQLException {
        PreparedStatement comandoSQL = null;

        try {
            comandoSQL = conexao.prepareStatement("UPDATE Produto SET quantidade = quantidade - ? WHERE cod_Prod = ?");
            comandoSQL.setInt(1, quantidade);
            comandoSQL.setInt(2, idProduto);

            comandoSQL.executeUpdate();

        } finally {
            if (comandoSQL != null) {
                comandoSQL.close();
            }
        }
    }

    // Outros métodos auxiliares, se necessário
    // ...

    // Método para calcular o valor total da venda
    private static double calcularValorTotal(ArrayList<ItemVenda> itensVenda) {
        double valorTotal = 0.0;

        for (ItemVenda itemVenda : itensVenda) {
            valorTotal += itemVenda.getVlrUnitario() * itemVenda.getQuantidade();
        }

        return valorTotal;
    }

} 


