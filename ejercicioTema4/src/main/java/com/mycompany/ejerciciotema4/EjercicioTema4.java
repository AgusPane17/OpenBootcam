/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciotema4;

/**
 *
 * @author apane
 */
public class EjercicioTema4 {

    public static void main(String[] args) {
        //if
        int numero = -3;
        
        if(numero == 0){
            System.out.println("El número es 0");
        }
        else{
            if(numero > 0){
                System.out.println("Su número es positivo");
            }
            else{
                System.out.println("Su número es negativo");
            }
        }
        //While
        int numeroWhile = 0;
        while(numeroWhile <= 3){
            System.out.println("Se ejecuta while y el número es "+numeroWhile);
            ++numeroWhile;
        }
        //do-while
        do{
            System.out.println("Se ejecuta el Do-While "+numeroWhile);
        }while(numeroWhile == 3);
        //for
        for(int numeroFor = 0; numeroFor<=3; numeroFor++){
            System.out.println("Se ejecuta el for con el numero "+numeroFor);
            
        }
        //switch
        String estacion = "invierno";
        
        switch(estacion){

        case "invierno":
            System.out.println("La estacion segun el switch " + estacion);
            break;
        case "otoño":
            System.out.println("La estacion segun el switch " + estacion);
            break;
        case "primavera":
            System.out.println("La estacion segun el switch " + estacion);
            break;
        case "verano":
            System.out.println("La estacion segun el switch " + estacion);
            break;
        default:
            System.out.println("No ingreso una estacion");
            break;
        }
    }
}
