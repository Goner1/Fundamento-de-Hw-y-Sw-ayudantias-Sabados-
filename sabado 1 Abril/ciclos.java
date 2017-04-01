package ejemploclaseSabadoSabado1Abril;

import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ciclos {

    public static void main(String[] args) {
        System.out.println("+++++++++++++for++++++++++++++++");
        for (int i = 0; i <= 10; i++) {//tipo de ciclo(for)(iniciar variable(int i=0); hasta cuanto se repite(i<=10); incremento(i++)) inicia ciclo({)
            System.out.println("hola mundo: "+i);//muestra por pantalla
        }//cerrar ciclo
        
        
        System.out.println("+++++++++++++do-while++++++++++++++++");
        int cont=0;//inicica variable(int cont=0;)
        
        do {//ciclo(do) inicia ciclo({)
            System.out.println("hola mundo:"+cont);//muestra por pantalla
            cont++;
            //aumento contador(cont++)
        } while (cont < 10);//cierro ciclo(}) condicion(mientras cont sea menor que 10(cont< 10))
        
        
        System.out.println("+++++++++++++while++++++++++++++++");
        int contador=0;//inicio variable(int contador=0;)
        while (contador <10) {//inicio ciclo(while) condicion(contador menor a 10(contador<10)) inicio ciclo({)
            System.out.println("hello World: "+contador);//muestra por pantalla
            contador++;//aumento del contador (contador++)
        }//cierro ciclo(})
        
    }
    
    
}
