/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        double num1;
        double num2;
        String operacion;
        
        System.out.println("ingrese el primer numero");
        num1 = entrada.nextDouble();        
        System.out.println("ingrese el segundo numero");        
        num2 = entrada.nextDouble();
        System.out.println("Ingrese el signo de la operacion aritmética");
        entrada.nextLine();
        operacion = entrada.nextLine();
             
        if(num1 >= num2) {
            switch (operacion){
                case "+":
                    System.out.print(num1 + num2);
                    break;
                    
                case "-":
                    System.out.print(num1 - num2);
                    break;
                    
                case "*":
                    System.out.print(num1 * num2);
                    break;
                    
                case "/":
                    System.out.print(num1 / num2);
                    break;
                    
                case "%":
                    System.out.print(num1 % num2);
                    break;
                    
                case "^":
                    System.out.print(Math.pow(num1, num2));
                    break;
                    
                default:
                    System.out.println("Error, el primer numero debe ser mayor"
                            + " al segundo numero");
                    break;
            }
        }
            
        }
    }
