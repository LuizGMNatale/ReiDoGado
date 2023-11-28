/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rei_do_gado;

import java.awt.Color;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author fernando.tfernandes
 */
public class Validador {
     public ArrayList<String> mensagensErro = new ArrayList<>();
    
    /**
     * Valida somente campos inteiros
     * @param txt Recebe um objeto do tipo JTextField
     */
    public void ValidarNumero(JTextField txt){
    
        try{
            
            //Verifico se o campo está vazio
            if(txt.getText().trim().equals("")){
                throw new IllegalArgumentException();
            }
            
            int valorConvertido = Integer.parseInt(txt.getText());
            txt.setBackground(Color.red);
            
        }catch(NumberFormatException e){
        
            this.mensagensErro.add("Falha ao converter o valor do campo " + txt.getName() + " em inteiro");
            txt.setBackground(Color.red);
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Digite um valor para o campo " + txt.getName());
            txt.setBackground(Color.red);
        }
    
    }
    
    
    public void validarCampoFormatado(JTextField txt) {
        try {
            // Verifica se o campo está vazio
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException("Digite um valor para o campo " + txt.getName());
            }

            // Remove caracteres não numéricos para facilitar a conversão
            String valorSemFormato = txt.getText().replaceAll("[^0-9]", "");

            // Realiza a validação com base no tipo de campo
            if (txt.getName().equals("CPF")) {
                validarCPF(valorSemFormato);
            } else if (txt.getName().equals("CEP")) {
                validarCEP(valorSemFormato);
            } else if (txt.getName().equals("Telefone")) {
                validarTelefone(valorSemFormato);
            }

            // Se chegou até aqui sem lançar exceção, o valor é válido
            txt.setBackground(Color.white);
        } catch (IllegalArgumentException e) {
            this.mensagensErro.add(e.getMessage());
            txt.setBackground(Color.red);
        }
    }

    private void validarCPF(String cpf) throws IllegalArgumentException {
        // Lógica de validação do CPF
        // ...

        // Exemplo simples para demonstração
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("CPF inválido");
        }
    }

    private void validarCEP(String cep) throws IllegalArgumentException {
        // Lógica de validação do CEP
        // ...

        // Exemplo simples para demonstração
        if (cep.length() != 8) {
            throw new IllegalArgumentException("CEP inválido");
        }
    }

    private void validarTelefone(String telefone) throws IllegalArgumentException {
        // Lógica de validação do telefone
        // ...

        // Exemplo simples para demonstração
        if (telefone.length() < 10) {
            throw new IllegalArgumentException("Telefone inválido");
        }
    }
    /**
     * Valida somente campos float
     * @param txt Recebe um objeto do tipo JTextField
     */
     public void ValidarFloat(JTextField txt){
     
         try{
            
            //Verifico se o campo está vazio
            if(txt.getText().trim().equals("")){
                throw new IllegalArgumentException();
            }
            
            float valorConvertido = Float.parseFloat(txt.getText());
            txt.setBackground(Color.WHITE);
            
        }catch(NumberFormatException e){
        
            this.mensagensErro.add("Falha ao converter o valor do campo " + txt.getName() + " em float");
            txt.setBackground(Color.red);
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Digite um valor para o campo " + txt.getName());
            txt.setBackground(Color.red);
        }
     
     }
     
     public void ValidarTexto(JTextField txt){
     
         try{
             //Verifico se o campo está vazio
             if(txt.getText().trim().equals("")){
                throw new IllegalArgumentException();
            }
            
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Digite um valor para o campo " + txt.getName());
            txt.setBackground(Color.red);
        }
     
     }
     
     public void ValidarCPF(JTextField txt){
     
         try{
            
            //Verifico se o campo está vazio
            if(txt.getText().replace(".", "").replace("-", "").trim().equals("")){
                throw new IllegalArgumentException();
            }
            
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Digite um valor para o campo " + txt.getName());
            txt.setBackground(Color.red);
        }
     
     }
     
     public void limparMensagens(){
     
         this.mensagensErro.clear();
     }
     
     
     

     /**
      * Resgata todos os erros gerados em uma única String
      * @return 
      */
     public String getMensagensErro(){
         
        String errosFormulario = "";
        
        //Percorro o arrayList e concateno na variável errosFormulario
        for (String msg : this.mensagensErro) {
            errosFormulario += msg + "\n";
        }
        
        if(!errosFormulario.equals("")){
            this.limparMensagens();
        }     
        
        return errosFormulario;
        
     }
     
     public boolean hasErro(){
     
         if(!this.mensagensErro.isEmpty()){
            return true;    
         }else{
             return false;
         }
     }

    String ClienteCamposVazios(String text, String replaceAll, String replaceAll0, String replaceAll1, String text0, String text1, String text2, String text7) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String ClienteCamposTamanho(String text, String text0, String text1, Object selectedItem, String text2, String text3, String text4, String text5) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void ValidarComboBox(JComboBox<String> jbox) {
    try {
        if (jbox.getSelectedItem().toString().trim().equals("")) {
            throw new IllegalArgumentException();
        }
    } catch (IllegalArgumentException e) {
        this.mensagensErro.add("Digite um valor para o campo " + jbox.getSelectedItem().toString());
        jbox.setBackground(Color.red); // Certifique-se de que txt está corretamente declarado
    }
}
}
