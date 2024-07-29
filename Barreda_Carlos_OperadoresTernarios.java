/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author enigm
 */
public class Barreda_Carlos_OperadoresTernarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        El operador ternario considero que es una manera mas concisa de usar if
        porque en una sola linea de codigo podemos aplicar una condicion ya sea 
        True o False siendo una forma abreviada de usar if
        */

        
        // Uso de valor constante
        
        double nota;
        String condicionFinal;
       
        
        Scanner lea = new Scanner(System.in);
        nota = lea.nextDouble();
        
        condicionFinal = nota>=60 ? "Aprobado" : "Desaprobado";
        
        System.out.println("estado del estudiante: " + condicionFinal);
        
        
        // Uso de variables
                
        int persona1,persona2;
        int condicion;
        
        System.out.println("Ingrese la primera edad: ");
        persona1 = lea.nextInt();
        System.out.println("Ingrese la segunda edad: ");
        persona2 = lea.nextInt();
        
        condicion = persona1>persona2 ? persona1 : persona2;
        System.out.println("La edad mayor es: " + condicion);
        
        
        // Uso de formulas
        //Calcular el area de un triangulo 
       
        String mensaje;
        double base,altura;
        
        System.out.print("Ingrese la base del triangulo: ");
        base = lea.nextDouble();
        
        System.out.print("Ingrese la altura del triangulo: ");
        altura = lea.nextDouble();
        
        mensaje = (base > 0 && altura > 0) ? 
                "El area del triangulo es: " + (0.5 * base * altura) :
                "La base y la altura deben ser mayores a cero.";
        
        System.out.println(mensaje);
        
        
    }
    
}
