/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciotema9;

/**
 *
 * @author apane
 */
public class EjercicioTema9 {

    public static void main(String[] args) {
    
        Cliente cliente01 = new Cliente();
        cliente01.setEdad(34);
        cliente01.setTelefono(434343);
        cliente01.setNombre("Martin");
        cliente01.setCredito(450);
        
        Trabajador trabajador01 = new Trabajador();
        trabajador01.setEdad(25);
        trabajador01.setTelefono(564577);
        trabajador01.setNombre("Jose");
        trabajador01.setSalario(6650);
    }    
}

class Persona{
        
        int edad;
        int telefono;
        String nombre;
        
        
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
    
class Cliente extends Persona{
        
        int credito;
        
        public int getCredito(){
            return this.credito;   
        }
        public void setCredito (int credito){
            this.credito = credito;
            System.out.println("Su credito es de: "+this.credito+" pesos");
        }
}

class Trabajador extends Persona{
        
        int salario;
        
        public int getSalario(){
            return this.salario;   
        }
        public void setSalario (int salario){
            this.salario = salario;
            System.out.println("Su salarios es de: "+this.salario + " pesos");
        }
    }