/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reidogadoclasses;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author julio.gslira
 */
public class Vendas {
    
    int idVenda;
    double vlrTotal;
    int idCliente;
    Date dataVenda;
    
    private ArrayList<ItemVenda> listaItens = null;

    public Vendas() {
    }

    public Vendas(int idVenda, double vlrTotal, Date dataVenda) {
        this.idVenda = idVenda;
        this.vlrTotal = vlrTotal;
        this.dataVenda = dataVenda;
    }

    
    
    public Vendas(int idVenda, double vlrTotal, int idCliente, Date dataVenda) {
        this.idVenda = idVenda;
        this.vlrTotal = vlrTotal;
        this.idCliente = idCliente;
        this.dataVenda = dataVenda;
        
       
        
    }
    
    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public double getVlrTotal() {
        return vlrTotal;
    }

    public void setVlrTotal(double vlrTotal) {
        this.vlrTotal = vlrTotal;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    public void setDataVenda(String dataString) {
        // Aqui você precisará converter a string para um objeto Date
        // Você pode usar SimpleDateFormat novamente para isso
        try {
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            this.dataVenda = formatoData.parse(dataString);
        } catch (java.text.ParseException e) {
            // Lide com a exceção de parsing, se necessário
            e.printStackTrace();
        }
    }
      
     public ArrayList<ItemVenda> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemVenda> listaItens) {
        this.listaItens = listaItens;
    }
}
