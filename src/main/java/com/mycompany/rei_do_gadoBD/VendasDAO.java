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
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julio.gslira
 */
public class VendasDAO {

    //jdbc:mysql://localhost:3307/basenotafiscal
    static String URL = "jdbc:mysql://localhost:3306/baseReiDoGado";
    static String Login = "root"; // Alterar para o login do bd salvo no seu pc
    static String Senha = "admin"; // Alterar para a senha do bd salvo no seu pc

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
                        PreparedStatement comandoSQLItem = conexao.prepareStatement("INSERT INTO itemVenda (idVenda, idProduto, nomeProduto,vlrUnitario, qtd) VALUES (?, ?, ?, ?, ?)");
                        comandoSQLItem.setInt(1, idVenda);
                        comandoSQLItem.setInt(2, itemVenda.getIdProduto());
                        comandoSQLItem.setString(3, itemVenda.getNomeProduto());
                        comandoSQLItem.setDouble(4, itemVenda.getVlrUnitario());
                        comandoSQLItem.setInt(5, itemVenda.getQtd());

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

    private static Connection obterConexao() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, Login, Senha);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private static void fecharRecursos(Connection conexao, PreparedStatement comandoSQL, ResultSet rs) {
        // Implemente a lógica para fechar a conexão e outros recursos
    }

    // Método para inserir a venda no banco de dados
    private static int inserirVenda(Connection conexao, String cpfCliente, ArrayList<ItemVenda> itensVenda) throws SQLException {
        PreparedStatement comandoSQL = null;
        ResultSet generatedKeys = null;

        try {
            double valorTotal = calcularValorTotal(itensVenda);

            String sqlInserirVenda;
            if (cpfCliente != null) {
                // Se o CPF do cliente estiver presente, insere o CPF na venda
                sqlInserirVenda = "INSERT INTO Vendas (vlrTotal, id_Cli, dataVenda) VALUES (?, (SELECT id_Cli FROM Cliente WHERE cpf = ?), ?)";
            } else {
                // Se o CPF do cliente não estiver presente, insere a venda sem CPF
                sqlInserirVenda = "INSERT INTO Vendas (vlrTotal, dataVenda) VALUES (?, ?)";
            }

            comandoSQL = conexao.prepareStatement(sqlInserirVenda, PreparedStatement.RETURN_GENERATED_KEYS);
            comandoSQL.setDouble(1, valorTotal);

            if (cpfCliente != null) {
                comandoSQL.setString(2, cpfCliente);
                comandoSQL.setDate(3, java.sql.Date.valueOf(LocalDate.now())); // Data atual
            } else {
                comandoSQL.setDate(2, java.sql.Date.valueOf(LocalDate.now())); // Data atual
            }

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

// Método para realizar a venda e atualizar o estoque
    public static boolean realizarVenda(ArrayList<ItemVenda> itensVenda, String cpfCliente) {
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {
            // Passo 1 - Abrir a conexão
            conexao = DriverManager.getConnection(URL, Login, Senha);
            conexao.setAutoCommit(false); // Desabilita o modo de confirmação automática para transações

            // Passo 2 - Inserir a venda no banco de dados
            int idVenda = VendasDAO.inserirVenda(conexao, cpfCliente, itensVenda);

            if (idVenda != -1) {
                // Passo 3 - Inserir os itens da venda no banco de dados
                for (ItemVenda itemVenda : itensVenda) {
                    // Implemente o método inserirItemVenda conforme necessário
                    VendasDAO.inserirItemVenda(conexao, idVenda, itemVenda); // Supondo que existe a função inserirItemVenda em VendasDAO
                }

                // Se tudo ocorrer sem erros, confirma a transação
                conexao.commit();
                System.out.println("Venda realizada com sucesso!");
                return true; // Retorna true indicando que a venda foi realizada com sucesso
            } else {
                // Se houver erro na venda, faz rollback e exibe mensagem
                conexao.rollback();
                System.out.println("Erro ao realizar a venda. Tente novamente.");
                return false; // Retorna false indicando que houve um erro na venda
            }
        } catch (SQLException e) {
            // Em caso de exceção, faz rollback e exibe mensagem
            try {
                if (conexao != null) {
                    conexao.rollback();
                }
            } catch (SQLException rollbackException) {
                rollbackException.printStackTrace();
            }

            e.printStackTrace();
            return false; // Retorna false indicando que houve um erro na venda
        } finally {
            // Fecha a conexão
            try {
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException closeException) {
                closeException.printStackTrace();
            }
        }
    }

    // Método para inserir um item de venda no banco de dados
    private static void inserirItemVenda(Connection conexao, int idVenda, ItemVenda itemVenda) throws SQLException {
        PreparedStatement comandoSQL = null;

        try {
            comandoSQL = conexao.prepareStatement("INSERT INTO itemVenda (idVenda, idProduto, vlrUnitario, qtd) VALUES (?, ?, ?, ?)");
            comandoSQL.setInt(1, idVenda);
            comandoSQL.setInt(2, itemVenda.getIdProduto());
            comandoSQL.setDouble(3, itemVenda.getVlrUnitario());
            comandoSQL.setInt(4, itemVenda.getQtd());

            comandoSQL.executeUpdate();

        } finally {
            if (comandoSQL != null) {
                comandoSQL.close();
            }
        }
    }//fim

    // Método para atualizar a quantidade do produto no estoque
    public static void atualizarEstoque(int idProduto, int quantidade) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, Login, Senha);

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

            conexao.close(); // Fecha a conexão aqui para evitar vazamento de recursos
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Lida com a exceção conforme necessário
        }
    }

    public static void adicionarEstoque(int idProduto, int quantidade) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, Login, Senha);

            PreparedStatement comandoSQL = null;

            try {
                comandoSQL = conexao.prepareStatement("UPDATE Produto SET quantidade = quantidade + ? WHERE cod_Prod = ?");
                comandoSQL.setInt(1, quantidade);
                comandoSQL.setInt(2, idProduto);

                comandoSQL.executeUpdate();
            } finally {
                if (comandoSQL != null) {
                    comandoSQL.close();
                }
            }

            conexao.close(); // Fecha a conexão aqui para evitar vazamento de recursos
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Lida com a exceção conforme necessário
        }
    }

    private static double calcularValorTotal(ArrayList<ItemVenda> itensVenda) {
        double valorTotal = 0.0;

        for (ItemVenda itemVenda : itensVenda) {
            valorTotal += itemVenda.getVlrUnitario();
        }

        return valorTotal;
    }

    public static ArrayList<Vendas> buscarVendasPorPeriodo(java.util.Date dataInicio, java.util.Date dataFim) {
        ArrayList<Vendas> listaVendas = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, Login, Senha);

            String sql = "SELECT V.idVenda, V.vlrTotal, C.nome, V.dataVenda "
                    + "FROM Vendas V "
                    + "INNER JOIN Cliente C ON V.id_Cli = C.id_Cli "
                    + "WHERE V.dataVenda BETWEEN ? AND ?";
            try (PreparedStatement comandoSQL = conexao.prepareStatement(sql)) {
                comandoSQL.setDate(1, new java.sql.Date(dataInicio.getTime()));
                comandoSQL.setDate(2, new java.sql.Date(dataFim.getTime()));

                try (ResultSet resultado = comandoSQL.executeQuery()) {
                    while (resultado.next()) {
                        int idVenda = resultado.getInt("idVenda");
                        double vlrTotal = resultado.getDouble("vlrTotal");
                        String nomeCliente = resultado.getString("nome");
                        Date dataVenda = resultado.getDate("dataVenda");

                        // Verifique se os campos estão sendo lidos corretamente
                        System.out.println("ID Venda: " + idVenda);
                        System.out.println("Valor Total: " + vlrTotal);
                        System.out.println("Nome Cliente: " + nomeCliente);
                        System.out.println("Data Venda: " + dataVenda);

                        Vendas venda = new Vendas(idVenda, vlrTotal, nomeCliente, dataVenda);
                        listaVendas.add(venda);
                    }
                }
            }
            conexao.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return listaVendas;
    }

    public static ArrayList<ItemVenda> buscarItensPorVenda(int idVenda) {
        ArrayList<ItemVenda> listaItens = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, Login, Senha);

            // Modificado para selecionar da visão vw_itemVenda
            String sql = "SELECT idProduto, nomeProduto, vlrUnitario, qtd "
                    + "FROM vw_itemVenda "
                    + "WHERE idVenda = ?";

            try (PreparedStatement comandoSQL = conexao.prepareStatement(sql)) {
                comandoSQL.setInt(1, idVenda);

                try (ResultSet resultado = comandoSQL.executeQuery()) {
                    while (resultado.next()) {
                        ItemVenda item = new ItemVenda();
                        item.setIdProduto(resultado.getInt("idProduto"));
                        item.setNomeProduto(resultado.getString("nomeProduto"));
                        item.setVlrUnitario(resultado.getDouble("vlrUnitario"));
                        item.setQtd(resultado.getInt("qtd"));

                        listaItens.add(item);
                    }
                }
            }
            conexao.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return listaItens;
    }

}
