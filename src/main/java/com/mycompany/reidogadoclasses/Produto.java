/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reidogadoclasses;

/**
 *
 * @author Pelus
 */
public class Produto {
    
    private int id;
    private String nomeProd;
    private int quantidade;
    private double valorEntrada;
    private double valorVenda;
    private String faturacao;

    public Produto(String nomeProd, double valorVenda) {
        this.nomeProd = nomeProd;
        this.valorVenda = valorVenda;
    }
    
    public Produto(String nomeProd, int quantidade, double valorEntrada, double valorVenda, String faturacao) {
        this.nomeProd = nomeProd;
        this.quantidade = quantidade;
        this.valorEntrada = valorEntrada;
        this.valorVenda = valorVenda;
        this.faturacao = faturacao;
    }

    public Produto(int id, String nomeProd, int quantidade, double valorVenda, String faturacao) {
        this.id = id;
        this.nomeProd = nomeProd;
        this.quantidade = quantidade;
        this.valorVenda = valorVenda;
        this.faturacao = faturacao;
    }

    public Produto(int id, String nomeProd, int quantidade, double valorEntrada, double valorVenda, String faturacao) {
        this.id = id;
        this.nomeProd = nomeProd;
        this.quantidade = quantidade;
        this.valorEntrada = valorEntrada;
        this.valorVenda = valorVenda;
        this.faturacao = faturacao;
    }

    public Produto() {
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFaturacao() {
        return faturacao;
    }

    public void setFaturacao(String faturacao) {
        this.faturacao = faturacao;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    
    
}
