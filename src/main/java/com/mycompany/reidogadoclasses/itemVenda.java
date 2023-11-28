/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reidogadoclasses;

/**
 *
 * @author julio.gslira
 */
public class ItemVenda extends Produto{

    int idItemVenda;
    int idVenda;
    int idProduto;
    double vlrUnitario;
    int qtd;
    String nomeProduto;

    public ItemVenda(int idProduto, double vlrUnitario, int qtd, String nomeProduto) {
        this.idProduto = idProduto;
        this.vlrUnitario = vlrUnitario;
        this.qtd = qtd;
        this.nomeProduto = nomeProduto;
    }
    
    
        
    
    public ItemVenda() {
    }

    
    
    public ItemVenda(int idItemVenda, int idVenda, int idProduto, double vlrUnitario, int qtd) {
        this.idItemVenda = idItemVenda;
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.vlrUnitario = vlrUnitario;
        this.qtd = qtd;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    
    
    public int getIdItemVenda() {
        return idItemVenda;
    }

    public void setIdItemVenda(int idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public double getVlrUnitario() {
        return vlrUnitario;
    }

    public void setVlrUnitario(double vlrUnitario) {
        this.vlrUnitario = vlrUnitario;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

}
