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
                
                for (ItemVenda itemVenda : obj.getListaItens()) {
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
 
} 


