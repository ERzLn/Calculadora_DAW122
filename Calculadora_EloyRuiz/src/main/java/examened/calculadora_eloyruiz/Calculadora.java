package examened.calculadora_eloyruiz;

import java.util.Scanner;

/**
 *
 * @author cic
 */
public class Calculadora {
    //Método para recoger las variables de entrada
    public static void pideNumeros() {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0, numero2 = 0; //Variables de entrada
        System.out.println("Introduce el primer número:");
        numero1 = scanner.nextInt();

        System.out.println("Introduce el segundo número:");
        numero2 = scanner.nextInt();

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1; //opción del menú
        int numero1 = 0, numero2 = 0; //Variables de entrada
        System.out.println("¡¡HOLA SOY ELOY RUIZ!!");
        

        while (opcion != 0) {
                System.out.println("Elige opción:\n" + ""
                        + "1.- Sumar\n"
                        + "2.- Restar\n"
                        + "3.- Multiplicar\n"
                        + "4.- Dividir\n"
                        + "0.- Salir");

                System.out.println("Selecciona una opción de 0 a 4");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1 -> {
                        pideNumeros();
                        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                    }
                    case 2 -> {
                        pideNumeros();
                        System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                    }
                    case 3 -> {
                        pideNumeros();
                        System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
                    }
                    case 4 -> {
                        pideNumeros();
                        System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                    }
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no disponible");
                }

                System.out.println("\n");
        }

    }

    
}
