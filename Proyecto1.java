/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author enigm
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lea = new Scanner(System.in);
        
        
        
        //Variables menu
        int menu= 0;
        
        //Variables Abrir Caja
        int cajacerrada = 1;
        int abrircaja = 0;
        int dinerocaja = 0;
        
        
        
        while(menu != 6){
            
            System.out.println("----------MENU----------");
            System.out.println("(1)Abrir caja           |");
            System.out.println("(2)Ventas               |");
            System.out.println("(3)Compras              |");
            System.out.println("(4)Reportes             |");
            System.out.println("(5)Cierre de caja       |");
            System.out.println("(6)Salir del sistema    |");
            System.out.println("------------------------");
            System.out.print("=");
            menu = lea.nextInt();
            
            switch(menu){
                case 1:
                    if( cajacerrada == 1){
                        System.out.println("--------Caja abierta-----");
                        System.out.println("Ingrese una cantidad de efectivo");
                        System.out.print("=");
                        double dinero = lea.nextInt();
                        dinerocaja += dinero;
                        System.out.println("Dinero en caja:" + dinerocaja);   
                    }
                    abrircaja =1;
                    
                case 2:
                    if(abrircaja==0){
                        System.out.println("Abrir caja para acceder a ventas");
                    }else{
                        
                        System.out.println("---------Ventas---------");
                        
                        
                        
                    }
                   
                    
                
            }
            
            
            
            
        }
            
            
        
       
        
    }
}
