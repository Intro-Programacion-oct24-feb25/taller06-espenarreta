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
        double operacion;
        double num2;
        double suma;
        double resta;
        double multiplicacion;
        double division;
        double modulo;
        double potenciacion;
                
        System.out.println("ingrese el primer numero");
        num1 = entrada.nextDouble();        
        System.out.println("ingrese el segundo numero");        
        num2 = entrada.nextDouble();
        System.out.println("Ingrese la operacion aritmética");
        operacion = entrada.nextDouble();
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        modulo = num1 % num2;
        potenciacion = Math.pow(num1, num2);
            
        if (num1 >= num2) {
            System.out.printf("La operación es una suma: %f", suma);
            
            
        }
    }
    
}
