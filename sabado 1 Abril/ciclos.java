    package ejemploclasesabado;

import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ciclos {

    public static void main(String[] args) {
        System.out.println("+++++++++++++for++++++++++++++++");
        for (int i = 0; i <= 10; i++) {
            System.out.println("hola mundo: "+i);
        }
        
        
        System.out.println("+++++++++++++do-while++++++++++++++++");
        int cont=0;
        
        do {
            System.out.println("hola mundo:"+cont);
            cont++;
        } while (cont < 10);
        
        
        System.out.println("+++++++++++++while++++++++++++++++");
        int contador=0;
        while (contador <10) {
            System.out.println("hello World: "+contador);
            contador++;
        }
        
    }
    
    
}
