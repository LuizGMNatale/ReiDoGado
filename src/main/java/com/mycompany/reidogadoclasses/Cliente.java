/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reidogadoclasses;

import java.util.Date;

/**
 *
 * @author Pelus
 */
public class Cliente {
    
    private int id;
    private String nome;
    private String sexo;
    private String telefone;
    private String email;
    private String Cpf;
    private String endereco;
    private String cep;
    private String estadoCivil;

   

    public Cliente(String nome, String sexo, String telefone, String email, String Cpf, String endereco, String cep, String estadoCivil) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.Cpf = Cpf;
        this.endereco = endereco;
        this.cep = cep;
        this.estadoCivil = estadoCivil;
    }

    public Cliente(int id, String nome, String cep,String endereco, String Cpf, String email, String telefone, String sexo, String estadoCivil) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.Cpf = Cpf;
        this.cep = cep;
        this.estadoCivil = estadoCivil;
    }

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    
    
    public Cliente() {
    }

   
     public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setcpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    
    
}
