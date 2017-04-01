package ejemploclasesabado;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        boolean repetir = true;
        String opciones = "Calculadora OP!\n\n";
        opciones += "1.- Sumar\n";
        opciones += "2.- Restar\n";
        opciones += "3.- Multiplicar\n";
        opciones += "4.- Dividir\n\n";
        opciones += "0.- Salir\n";
        do {

            int opc = Integer.parseInt(JOptionPane.showInputDialog(opciones));
            if (opc == 0) {
                repetir = false;
                break;
            }
            Double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1: \n"));
            Double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2: \n"));

            switch (opc) {
                case 1:

                    JOptionPane.showMessageDialog(null, "La suma es: " + suma(numero1, numero2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "La resta es: " + resta(numero1, numero2));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multiplicacion(numero1, numero2));
                    break;
                case 4:
                    if (numero2 == 0) {
                        mensajeError();
                    } else {
                        JOptionPane.showMessageDialog(null, "La division es: " + division(numero1, numero2));
                    }
                    break;

                case 0:
                    repetir = false;
                    break;

            }

        } while (repetir == true);
    }

    public static Double suma(Double num1, Double num2) {
        return num1 + num2;
    }

    public static Double resta(Double num1, Double num2) {
        return num1 - num2;
    }

    public static Double multiplicacion(Double num1, Double num2) {
        return num1 * num2;
    }

    public static double division(Double num1, Double num2) {
        return num1 / num2;
    }

    public static void mensajeError() {
        JOptionPane.showMessageDialog(null, "division por 0 no existe");
    }
}
