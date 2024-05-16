/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rei_do_gadoBD;

import com.mycompany.reidogadoclasses.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pichau
 */
public class ProdutoDao {

    static String url = "jdbc:mysql://localhost:3306/baseReiDoGado";
    static String login = "root";
    static String senha = "admin";

    public static boolean salvar(Produto novoProduto) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);
            comandoSQL = conexao.prepareStatement("INSERT INTO Produto (nome, quantidade, valorEntrada, valorVenda, faturacao) "
                    + "Values (?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            comandoSQL.setString(1, novoProduto.getNomeProd());
            comandoSQL.setInt(2, novoProduto.getQuantidade());
            comandoSQL.setDouble(3, novoProduto.getValorEntrada());
            comandoSQL.setDouble(4, novoProduto.getValorVenda());
            comandoSQL.setString(5, novoProduto.getFaturacao());

            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;

                rs = comandoSQL.getGeneratedKeys();

                if (rs != null) {
                    while (rs.next()) {
                        int idGerado = rs.getInt(1);
                    }
                }

            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return retorno;

    }// fim do salvar

    public static ArrayList<Produto> listar() {

        ArrayList<Produto> lista = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);

            comandoSQL = conexao.prepareStatement("SELECT * FROM Produto");

            rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Produto item = new Produto();
                    item.setId(rs.getInt("cod_Prod"));
                    item.setNomeProd(rs.getString("nome"));
                    item.setQuantidade(rs.getInt("quantidade"));
                    item.setValorEntrada(rs.getDouble("valorEntrada"));
                    item.setValorVenda(rs.getDouble("valorVenda"));
                    item.setFaturacao(rs.getString("faturacao"));
                    lista.add(item);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

        return lista;
    }//fim do listar

    public static ArrayList<Produto> buscarProdutoPorNome(String nomeProduto) {
        ArrayList<Produto> lista = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);
            comandoSQL = conexao.prepareStatement("SELECT * FROM Produto WHERE LOWER(nome) LIKE ?");
            comandoSQL.setString(1, "%" + nomeProduto.toLowerCase() + "%");

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("cod_Prod");
                String nome = rs.getString("nome");
                int quantidade = rs.getInt("quantidade");
                double valorEntrada = rs.getDouble("valorEntrada");
                double valorVenda = rs.getDouble("valorVenda");
                String faturacao = rs.getString("faturacao");

                Produto produto = new Produto(id, nome, quantidade, valorEntrada, valorVenda, faturacao);
                lista.add(produto);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return lista;
    }

    public static boolean alterar(Produto novoProduto) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);
            comandoSQL = conexao.prepareStatement("UPDATE Produto SET nome =?, quantidade =?, valorEntrada =?, valorVenda=? , faturacao =? WHERE cod_Prod =? ");
            comandoSQL.setString(1, novoProduto.getNomeProd());
            comandoSQL.setInt(2, novoProduto.getQuantidade());
            comandoSQL.setDouble(3, novoProduto.getValorEntrada());
            comandoSQL.setDouble(4, novoProduto.getValorVenda());
            comandoSQL.setString(5, novoProduto.getFaturacao());
            comandoSQL.setInt(6, novoProduto.getId());

            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return retorno;

    }// fim do alterar

    public static boolean excluir(int idEcluir) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);
            comandoSQL = conexao.prepareStatement("DELETE FROM Produto WHERE cod_Prod =? ");
            comandoSQL.setInt(1, idEcluir);

            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return retorno;

    }

    public static boolean temVendasAssociadas(int idProduto) {
        boolean temVendas = false;
        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection(url, login, senha);

            String sql = "SELECT COUNT(*) AS totalVendas FROM itemVenda iv "
                    + "JOIN Vendas v ON iv.idVenda = v.idVenda "
                    + "WHERE iv.idProduto = ?";

            try (PreparedStatement comandoSQL = conexao.prepareStatement(sql)) {
                comandoSQL.setInt(1, idProduto);

                try (ResultSet resultado = comandoSQL.executeQuery()) {
                    if (resultado.next()) {
                        int totalVendas = resultado.getInt("totalVendas");
                        temVendas = (totalVendas > 0);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return temVendas;
    }

}
