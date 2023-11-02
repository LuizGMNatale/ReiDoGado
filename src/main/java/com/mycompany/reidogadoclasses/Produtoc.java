/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reidogadoclasses;

/**
 *
 * @author Pelus
 */
public class Produtoc {
    
    private int id;
    private String nomeProd;
    private int quantidade;
    private int Peso;
    private double valorCompra;
    private double valorVenda;
    private String tipo;

    public Produtoc(int id, String nomeProd, int quantidade, int Peso, double valorCompra, double valorVenda, String tipo) {
        this.nomeProd = nomeProd;
        this.quantidade = quantidade;
        this.Peso = Peso;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    
    
}
