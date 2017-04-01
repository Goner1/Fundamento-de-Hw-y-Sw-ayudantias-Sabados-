/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclaseSabadoSabado1Abril;

import javax.swing.JOptionPane;

/**
 *
 * @author dci
 */
public class Arreglos {
    public static void main(String[] args) {
        int tempDias[]=new int[5];//tipo(int) nombre(TempDias) []= instancia(new) tipo(int) cantidad([5]);
        for (int i = 0; i < tempDias.length; i++) {//ciclo
            tempDias[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese numero espacio:"+i));//lectura de datos
            
        }
        for (int i = 0; i < tempDias.length; i++) {//ciclo
            System.out.println("dia"+i+" la temperatura fue de:"+tempDias[i]); //muestra por consola(System.out.println) ("String" + variable(i)+ "String" + espacio del arreglo(tempDias[i]))   
        }
    }
}
