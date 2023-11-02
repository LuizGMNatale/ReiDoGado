package com.mycompany.reidogadoclasses;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luiz.gmnatale
 */
public class relatorio {
    private int idItem;
    private int idProd;
    private String nome;
    private int quantidade;
    private double valorKg;
    private double valorUnit;
    private double valorTotal;
    
    
    
    public relatorio(int idItem, int idProd, String nome, int quantidade, double valorUnit, double valorTotal) {
        this.idItem = idItem;
        this.idProd = idProd;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorKg = valorKg;
        this.valorUnit = valorUnit;
        this.valorTotal = valorTotal;
    }

    public relatorio() {
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    
    
}
