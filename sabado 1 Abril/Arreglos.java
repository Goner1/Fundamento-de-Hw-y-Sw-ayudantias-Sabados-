/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesabado;

import javax.swing.JOptionPane;

/**
 *
 * @author dci
 */
public class Arreglos {
    public static void main(String[] args) {
        int tempDias[]=new int[10];
        int num;
        for (int i = 0; i < tempDias.length; i++) {
            tempDias[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese numero espacio:"+i));
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("dia"+i+" la temperatura fue de:"+tempDias[i]);     
        }
    }
}
