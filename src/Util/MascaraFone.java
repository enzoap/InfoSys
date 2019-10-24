/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitario;

import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author aluno
 */
public class MascaraFone {
        
    public static DefaultFormatterFactory fone(){
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("(##)-####-####");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException e){
            e.printStackTrace();
        }
        DefaultFormatterFactory dff = new DefaultFormatterFactory(mask);
        return(dff);
    }
}

