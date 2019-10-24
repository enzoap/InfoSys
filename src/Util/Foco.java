/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitario;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 *
 * @author aluno
 */
public class Foco extends FocusAdapter{
    
    @Override
    public void focusGained(FocusEvent e){
        e.getComponent().setBackground(Color.yellow);
    }
     @Override
    public void focusLost(FocusEvent e){
        e.getComponent().setBackground(Color.white);
    }

}