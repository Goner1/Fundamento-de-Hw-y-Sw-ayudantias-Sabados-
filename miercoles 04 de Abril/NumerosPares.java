/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia.miercoles04;

/**
 *
 * @author Eduard QF
 */
public class NumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("+++++++++++++++FORMA 1++++++++++++++++++++++++");
        for (int i = 0; i <= 100; i++) {/*iniciamos ciclo for en 0, repite mientras i sea menor o igual a 100, i aumenta de a 1*/
            if (i%2==0) {/*iniciamos comparador si el resto de i dividido en 2 es igual a cero entra*/
                System.out.print(i+", "); /*mostramos por pantalla el valor de i y concatenamos un String*/
            }/*cerramos condicion*/
            if (i==10 || i==20 || i==30 || i==40 || i==50 || i==60 || i==70 || i==80 || i==90  ) {/*iniciamos comparador, si i es igual a 10,20,30,40,50,60,70,80 u 90 entra*/
                System.out.println("\n");/*genera un salto de linea en consola*/
            }/*cerramos condicion*/
        }/*cerramos ciclo*/
        
        System.out.println("\n+++++++++++++++FORMA 2++++++++++++++++++++++++");
        for (int i = 0; i <= 100; i+=2) {/*iniciamos ciclo fon con i =0, repite mientras i sea menor o igual a 100, i aumenta de a 2; */
            System.out.print(i +", ");/*mostramos por consola el valor de i y concatenamos un String*/
            if (i%10==0 && i!=0) {/*iniciamos comparador, si el resto de i dividido en 10 es igual a cero y ademas si i es distinto de 0 entra*/
                System.out.println("\n");/*genera un salto de linea por pantalla*/
            }/*cerramos condicion*/
        }/*cerramos ciclo*/
        
    }
    
}
