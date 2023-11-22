/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rei_do_gado;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Pelus
 */
public class ValidadorNumeros extends PlainDocument {
    
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
        
        
        super.insertString(offs, str.replaceAll("^[0-9].-(),", ""), a);
    }
    
    
}
