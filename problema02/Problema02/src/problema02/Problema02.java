/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String propietario;
        int tipo;
        double valorVehiculo;
        double peaje = 0.0;
        String tipoVehiculo = "";
                
        System.out.println("Ingrese el nombre del propietario:");
        propietario = entrada.nextLine();

        System.out.println("Ingrese el numero según su tipo de vehículo:\n"
                + "(1: Vehículo liviano particular\n"
                + " 2: Vehículo grande particular\n"
                + " 3: taxi\n"
                + " 4: bus urbano)");
        tipo = entrada.nextInt();   

        System.out.println("Ingrese el valor del vehículo");
        valorVehiculo = entrada.nextDouble();
        
        switch (tipo) {
            case 1: // Vehículo liviano particular
                tipoVehiculo = "vehículo liviano particular";
                peaje = (valorVehiculo * 0.0001) + 2;
                break;
            case 2: // Vehículo grande particular
                tipoVehiculo = "vehículo grande particular";
                peaje = (valorVehiculo * 0.0002) + 2.5;
                break;
            case 3: // Taxi
                tipoVehiculo = "taxi";
                peaje = (valorVehiculo * 0.0004) + 1.5;
                break;
            case 4: // Bus urbano
                tipoVehiculo = "bus urbano";
                peaje = (valorVehiculo * 0.0005) + 2.2;
                break;
            default:
                System.out.println("Tipo de vehículo no reconocido.");
        }
        System.out.println("\nPeaje 'Buena vía'\n\t" + "Propietario: " 
                + propietario + "\nTipo: " + tipoVehiculo + "\n\tValor: $" 
                + valorVehiculo + "\n\tPeaje: $" + peaje);
    }
    
}