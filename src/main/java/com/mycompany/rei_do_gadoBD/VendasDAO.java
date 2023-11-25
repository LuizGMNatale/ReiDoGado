/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rei_do_gadoBD;

import static com.mycompany.rei_do_gadoBD.ProdutoDao.login;
import static com.mycompany.rei_do_gadoBD.ProdutoDao.senha;
import static com.mycompany.rei_do_gadoBD.ProdutoDao.url;
import com.mycompany.reidogadoclasses.Cliente;
import com.mycompany.reidogadoclasses.Produto;
import com.mycompany.reidogadoclasses.Vendas;
import com.mycompany.reidogadoclasses.itemVenda;
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
    static String Senha = "root"; // Alterar para a senha do bd salvo no seu pc
    
    public static boolean salvar(Vendas obj) {
        boolean retorno = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, Login, Senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Vendas (idVenda,vlrTotal,idCliente,dataVenda) VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setInt(1, obj.getIdVenda());
            comandoSQL.setDouble(2, obj.getVlrTotal());
            comandoSQL.setInt(3, obj.getIdCliente());
            comandoSQL.setDate(4, (Date) obj.getDataVenda());
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs .next()) {
                    int idNota = rs.getInt(1);
                    for (itemVenda itemVenda : obj.getListaItens()){
                        PreparedStatement comandoSQLItem = conexao.prepareStatement("INSERT INTO itemVenda (idItemVenda, idVenda, idProduto, vlrUnitario, qtd) VALUES (?,?,?)");
                        comandoSQLItem.setInt(1, itemVenda.getIdItemVenda());   
                        comandoSQLItem.setInt(2, itemVenda.getIdVenda());
                        comandoSQLItem.setDouble(3, itemVenda.getVlrUnitario());
                        comandoSQLItem.setInt(4, itemVenda.getQtd());

                        int linhasAfetadasItem = comandoSQLItem.executeUpdate();
                        if(linhasAfetadasItem>0){
                            retorno = true;
                        }
                    }
                }
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return retorno;
        
    }
}
    


