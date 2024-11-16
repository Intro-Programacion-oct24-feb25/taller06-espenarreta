/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author chocl
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner pagofinal = new Scanner(System.in);
        pagofinal.useLocale(Locale.US);
        
        String nombre;
        String tipoE;
        double sueldo;
        double adicional;
        double sueldoFinal = 0;
        int incremento = 0;
        
        System.out.println("Ingrese nombre del empleado:");
        nombre = pagofinal.nextLine();
        
        System.out.println("Ingrese tipo de empleado:");
        tipoE = pagofinal.nextLine();
        
        System.out.println("Ingrese sueldo del empleado:");
        sueldo = pagofinal.nextDouble();
        
        switch (tipoE){
            case "1":
                incremento = 5;
                adicional = (sueldo*incremento)/100;
                break;
                
            case "2":
                incremento = 7;
                adicional = (sueldo*incremento)/100;
                break;
                
            case "3":
                incremento = 9;
                adicional = (sueldo*incremento)/100;
                break;
                
            case "4":
                incremento = 12;
                adicional = (sueldo*incremento)/100;
                break;
                
            default:
                incremento = 15;
                adicional = (sueldo*incremento)/100;
                break;
        }
        
        sueldoFinal = sueldo + adicional;
        System.out.printf("Informe\nNombre: %s\nTipo de Empleado: %s\n"
                        + "Sueldo Inicial: $%.2f\nIncremento: %d%%\n"
                        + "Sueldo Final: $%.2f\n", 
                        nombre, tipoE, sueldo, incremento, sueldoFinal);
        
        
        
    }
    
}
