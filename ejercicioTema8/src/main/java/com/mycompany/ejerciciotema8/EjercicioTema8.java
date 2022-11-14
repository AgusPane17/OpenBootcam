/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciotema8;

/**
 *
 * @author apane
 */
public class EjercicioTema8 {
    
    public static void main(String[] args) {        
        Persona personita = new Persona(15, 232332, "Martin");
        System.out.println(personita.getEdad());
        System.out.println(personita.getTelefono());
        System.out.println(personita.getNombre());
        personita.setEdad(18);
        personita.setTelefono(4574256);
        personita.setNombre("Marcelo");
    
    
    }
    
} 
    class Persona{
        private int edad;
        private int telefono;
        private String nombre;
        
        public Persona(int edad,int telefono, String nombre){
            this.edad = edad;
            this.telefono = telefono;
            this.nombre = nombre;
        
        }
        public int getEdad(){
            return this.edad;
            
        }
        public int getTelefono(){
            return this.telefono;
        }
        public String getNombre(){
            return this.nombre;
        }
        public void setEdad (int edad){
            this.edad = edad;
            System.out.println(this.edad);
        }
        public void setTelefono (int telefono){
            this.telefono = telefono;
            System.out.println(this.telefono);
        }
        public void setNombre (String nombre){
            this.nombre = nombre;
            System.out.println(this.nombre);
        }
    }

