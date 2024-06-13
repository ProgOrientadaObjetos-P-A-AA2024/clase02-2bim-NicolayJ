/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Creación de un objeto de tipo EstudianteDistancia
        
        String nombre = "Diego";
        String apellido = "Jimenez";
        String identificacion = "1150019568";
        int edad = 19;
        
        
        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre, 
                apellido, identificacion, edad);
        estDistancia.establecerCostoAsignatura(100);
        estDistancia.establecerNumeroAsginaturas(5);
        estDistancia.calcularMatriculaDistancia();
        
        System.out.println(estDistancia);
                
        
    }
}
