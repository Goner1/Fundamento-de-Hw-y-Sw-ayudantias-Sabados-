/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia.miercoles04;

import java.util.Scanner;

/**
 *
 * @author Eduard QF
 */
public class PotenciasAndCircunferencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);/*tipo:Scanner nombre variable:scanner =instanciamos Scanner(tipo de dato:entrada(System.in))*/
        int x, y, radio;/*inicialisamos variables de tipo Integer*/
        double perimetro, area;/*inicialisamos variables de tipo Double*/
        System.out.println("Ingrese un valor: ");/*mostramos mensaje por consola*/
        x = scanner.nextInt();/*leemos desde teclado un entero(nextInt()) y la almacenamos en variable x*/
        System.out.println("Ingrese otro valor: ");/*mostramos mensaje por consola*/
        y = scanner.nextInt();/*leemos desde teclado un entero(nextInt()) y la almacenamos en variable y*/
        //z=x*Y;
        //Math.pow(x,y);
        System.out.println("El primer valor elevado al segundo es " + Math.pow(x, y));/*mostramos resultado de la operacion pow por consola*/
        System.out.println("Ahora ingrese un radio: ");/*pedimos por consola un valor */
        radio = scanner.nextInt();/*leemos desde teclado un entero(nextInt()) y la almacenamos en variable radio*/
        perimetro = (Math.PI * 2) * radio;/*calculamos perimetro((Math.PI*2)*radio)y lo almacenamos en la variable perimetro*/
        System.out.println("El perimetro es: " + perimetro);/*mostramos por consola el valor de la variable perimetro*/
        area = (Math.PI) * Math.pow(radio, 2);/*calculamos el area de un circulo[(Math.PI)*Math.pow(radio,2)] y lo almacenamos en la variable area*/
        System.out.println("el area es: " + area);/*mostramos por pantalla un mensaje junto al valor de la vareable area*/
        scanner.close();/*cerramos el proceso del lector de consola(Scanner)*/
    }
}
