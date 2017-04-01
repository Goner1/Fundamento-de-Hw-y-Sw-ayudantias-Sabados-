/**
 * @param 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesabado;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JoptionPaner {


    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
        double suma = num1+num2;
        double resta = num1-num2;
        double mult = num1*num2;
        double div = num1/num2;
        
        String resultadoFinal = "Los resultados son: \n";
        resultadoFinal += "La suma es: " + suma + "\n";
        resultadoFinal += "La resta es: " + resta + "\n";
        resultadoFinal += "la multiplicacion es: "+mult + "\n"; 
        resultadoFinal += "La division es: " + div + "\n";
        
        JOptionPane.showMessageDialog(null, resultadoFinal);
        
        
    }
    
}
