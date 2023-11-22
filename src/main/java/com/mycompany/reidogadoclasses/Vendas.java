/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reidogadoclasses;

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
    
    private ArrayList<itemVenda> listaItens = null;

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
      
     public ArrayList<itemVenda> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<itemVenda> listaItens) {
        this.listaItens = listaItens;
    }
}
