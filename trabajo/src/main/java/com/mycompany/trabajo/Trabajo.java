/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Trabajo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        
        //Ingreso de los numeros
        for(int i=0; i < 5; i++){
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
    }
}
