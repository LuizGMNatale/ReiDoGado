/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rei_do_gadoBD;

import com.mycompany.reidogadoclasses.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pichau
 */
public class ClienteDao {
    
    static String url = "jdbc:mysql://localhost:3306/baseReiDoGado";
    static String login = "root";
    static String senha = "P@$$w0rd";
    
    public static boolean salvar(Cliente novoCliente){
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login, senha);
            comandoSQL = conexao.prepareStatement("INSERT INTO CLIENTE (nome, sexo, telefone, email, cpf, endereco, cep, estadoCivil) "
                    + "Values (?,?,?,?,?,?,?,?)");
            comandoSQL.setString(1, novoCliente.getNome());
            comandoSQL.setString(2, novoCliente.getSexo());
            comandoSQL.setString(3, novoCliente.getTelefone());
            comandoSQL.setString(4, novoCliente.getEmail());
            comandoSQL.setString(5, novoCliente.getCpf());
            comandoSQL.setString(6, novoCliente.getEndereco());
            comandoSQL.setString(7, novoCliente.getCep());
            comandoSQL.setString(8, novoCliente.getEstadoCivil());
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }
            
        } catch (ClassNotFoundException ex) {
           retorno = false;
        } catch (SQLException ex) {
           retorno = false;
        }finally{
            if(conexao != null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        }
        
        return retorno;
        
    }
    
    
}
