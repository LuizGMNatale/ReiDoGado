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
import javax.swing.JTextField;

/**
 *
 * @author Pichau
 */
public class ItensVendaDAO {

    //jdbc:mysql://localhost:3307/basenotafiscal
    static String URL = "jdbc:mysql://localhost:3306/baseReiDoGado";
    static String Login = "root";
    static String Senha = "admin";

    public static ArrayList<Produto> buscarProduto(String textoPesquisa) {
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<Produto> lista = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, Login, Senha);
            comandoSQL = conexao.prepareStatement("SELECT * FROM Produto WHERE LOWER(nome) LIKE ?");
            comandoSQL.setString(1, "%" + textoPesquisa.toLowerCase() + "%"); // Utiliza o texto da pesquisa em minúsculas

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("cod_Prod");
                String nome = rs.getString("nome");
                int quantidade = rs.getInt("quantidade");
                double valorVenda = rs.getDouble("valorVenda");
                String faturacao = rs.getString("faturacao");
                Produto item = new Produto(id, nome, quantidade, valorVenda, faturacao);

                lista.add(item);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ItensVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ItensVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return lista;
    }
//fim do buscar produto

}
