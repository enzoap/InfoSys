/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;


import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author aluno
 */
public class Configura {
//    public static void LookAndFeel(String laf){
//    try {
//        for (UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()){
//            if (laf.equals(info.getClassName()));
//            break;
//        }
//        }catch(UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e){
//            System.out.println("Erro: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
    public static void LookAndFeel(String laf){
    try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (laf.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            //java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.println("Erro: " + ex.getMessage());
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            //java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.println("Erro: " + ex.getMessage());
            ex.printStackTrace();

        } catch (IllegalAccessException ex) {
            //java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.println("Erro: " + ex.getMessage());
            ex.printStackTrace();

        } catch (UnsupportedLookAndFeelException ex) {
            //java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.println("Erro: " + ex.getMessage());
            ex.printStackTrace();

        }
    }
}
