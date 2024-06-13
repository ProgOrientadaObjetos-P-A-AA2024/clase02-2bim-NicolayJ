/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial,
        // con datos por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String respuesta;
        String cadena = "";
        
        do {
            System.out.println("Ingrese nombre");
            String n = entrada.nextLine();
            System.out.println("Ingrese apellido");
            String ap = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String ced = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese número de créditos");
            int creditos = entrada.nextInt();
            System.out.println("Ingrese costo de créditos");
            double costo = entrada.nextDouble();
            entrada.nextLine(); 
            
            EstudiantePresencial presencial = new EstudiantePresencial(n, ap, ced, edad, creditos, costo);
            presencial.calcularMatriculaPresencial();
            
            cadena = String.format("%s%s\n", cadena, presencial);

            System.out.println("Desea ingresar nueva informacion?(Si/No): ");
            respuesta = entrada.nextLine();

        } while (respuesta.equalsIgnoreCase("Si"));
        
        System.out.printf("%s\n", cadena);
    }
}
