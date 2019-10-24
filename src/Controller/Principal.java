/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Util.Configura;
import View.TelaCadastro;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args) {
        Configura.LookAndFeel("Nimbus");
        new TelaCadastro().setVisible(true);
        DAO.ConnectionFactory.getConnection();
    }
}
