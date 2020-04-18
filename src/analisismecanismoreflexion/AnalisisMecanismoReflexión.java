/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisismecanismoreflexion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class AnalisisMecanismoReflexión {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application ogic here
        Scanner scn = new Scanner(System.in);
        System.out.println("Escriba la ruta de la clase:");
        String nombreClase = scn.nextLine();//java.lang.Thread por ejemplo
        Class cl1;
        try {
            //clases
            cl1=Class.forName(nombreClase);
            System.out.println("Nombre de la Clase: "+cl1.getName());
            System.out.println("-------------------------------------");
            
            //constructor
            Constructor[] constructores = cl1.getDeclaredConstructors();
            for(int i = 0; i<constructores.length;i++){
                System.out.println("Nombre del Constructor: "+constructores[i]);
            }
            System.out.println("-------------------------------------");
            
            //Modifier
            Method[] metodo = cl1.getDeclaredMethods();
            for(int i = 0; i<metodo.length;i++){
                System.out.println("Método: "+metodo[i]);
            }
            System.out.println("-------------------------------------");
            
            //field
            Field[] field = cl1.getDeclaredFields();
            for(int i = 0; i<field.length;i++){
                System.out.println("Field: "+field[i]);
            }
            System.out.println("-------------------------------------");
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(AnalisisMecanismoReflexión.class.getName()).log(Level.SEVERE,
        null, ex);
        }
    }
}

    

