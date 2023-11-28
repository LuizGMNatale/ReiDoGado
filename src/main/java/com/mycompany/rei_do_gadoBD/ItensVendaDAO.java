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
    static String Login = "root"; // Alterar para o login do bd salvo no seu pc
    static String Senha = "root"; // Alterar para a senha do bd salvo no seu pc
    
    public static ArrayList<Produto> buscarProduto(JTextField txtProdID){
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<Produto> lista = new ArrayList<Produto>();
        
        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - Abrir a conexÃ£o
            conexao = DriverManager.getConnection(URL, Login, Senha);
            
            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM Produto WHERE nome = ?");
            comandoSQL.setString(1, txtProdID.getText());

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();
            
            if(rs !=null){
                while(rs.next()){
                    int id = rs.getInt("cod_Prod");
                    String nome = rs.getString("nome");
                    int quantidade = rs.getInt("quantidade");
                    double valorVenda = rs.getDouble("valorVenda");
                    String faturacao = rs.getString("faturacao");
                    Produto item = new Produto(id, nome, quantidade, valorVenda, faturacao);
                    
                    lista.add(item);
                    
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItensVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItensVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
            if(conexao != null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ItensVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
        
        return lista;
    }//fim do buscar produto
    

}
