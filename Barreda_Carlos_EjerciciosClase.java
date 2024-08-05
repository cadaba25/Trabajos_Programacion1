/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareas;

import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Barreda_Carlos_EjerciciosClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner lea = new Scanner(System.in);
         
        int menu = 0; 
         
        while (menu != 4) {
            System.out.println("---MENU---");
            System.out.println("(1) Secuencia diagonal");
            System.out.println("(2) Piramide de numeros");
            System.out.println("(3) Lista de palindromos");
            System.out.println("(4) Salir");
                
            System.out.print("Ingrese una opcion: ");
            int opcion = lea.nextInt();
            lea.nextLine(); 
                
            if (opcion == 1) {
                System.out.print("Ingrese una palabra: ");
                String palabra = lea.nextLine();
                int i, j;
                for (i = 0; i < palabra.length(); i++) {
                    for (j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    System.out.println(palabra.charAt(i));
                }
                for (i = palabra.length() - 2; i >= 0; i--) {
                    for (j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    System.out.println(palabra.charAt(i));
                }
            } else if (opcion == 2) {
                System.out.print("Ingrese el numero de filas: ");
                int altura = lea.nextInt();
                
                for (int fila = 1; fila <= altura; fila++) {
                    
                    for (int columna = 1; columna < fila; columna++) {
                        System.out.print(" ");
                    }

                    
                    for (int columna = 1; columna <= altura - fila + 1; columna++) {
                        System.out.print(columna + " ");
                    }

                    
                    for (int columna = altura - fila; columna >= 1; columna--) {
                        System.out.print(columna + " ");
                    }

                    System.out.println();
                }
            } else if (opcion == 3) {
                System.out.print("Ingrese la cantidad de palabras: ");
                int cantidadPalabras = lea.nextInt();
                lea.nextLine(); 

                String palabrasPalindromas = "Palindromos:\n";
                String palabrasNoPalindromas = "No palindromos:\n";

                for (int i = 1; i <= cantidadPalabras; i++) {
                    System.out.print("Palabra #" + i + ": ");
                    String palabra = lea.next().toLowerCase();

                    String palabraInvertida = "";
                    int longitudPalabra = palabra.length();
                    int contador = longitudPalabra - 1;

                    while (contador >= 0) {
                        char letra = palabra.charAt(contador);
                        palabraInvertida += letra;
                        contador--;
                    }

                    boolean esPalindromo = true;
                    int indice = 0;
                    while (indice < longitudPalabra) {
                        char letraOriginal = palabra.charAt(indice);
                        char letraInvertida = palabraInvertida.charAt(indice);
                        if (letraOriginal != letraInvertida) {
                            esPalindromo = false;
                            break;
                        }
                        indice++;
                    }

                    if (esPalindromo) {
                        palabrasPalindromas += i + "- " + palabra + "\n";
                    } else {
                        palabrasNoPalindromas += i + "- " + palabra + "\n";
                    }
                }

                System.out.print(palabrasPalindromas);
                System.out.print(palabrasNoPalindromas);
            } else if (opcion == 4) {
                System.out.println("Saliendo del programa...");
                menu = 4; 
            } else {
                System.out.println("Opcion invalida, por favor intente de nuevo.");
            }
        }
        
        lea.close();
    }
}
