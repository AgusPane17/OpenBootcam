/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author apane
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        coche miCoche = new coche();
        miCoche.quitarPuerta(1);
        
      
        
    }
}
class coche{
    int puertas = 4;
    
    public void quitarPuerta(int p){
            puertas= puertas + p;
            System.out.println(puertas);
        }
}