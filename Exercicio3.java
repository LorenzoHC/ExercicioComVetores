/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author loren
 */
public class Exercicio3 {

    public static void main(String[] args) {
        int[] arrayTotal = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30
        };

        int[] arrayPar = new int[5];
        int[] arrayImpar = new int[5];

        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < arrayTotal.length; i++) {

            
            if (arrayTotal[i] % 2 == 0) {
                arrayPar[contPar] = arrayTotal[i];
                contPar++;

                if (contPar == 5) {
                    System.out.println("Vetor par cheio: " + Arrays.toString(arrayPar));
                    contPar = 0;
                }

            } else { 
                arrayImpar[contImpar] = arrayTotal[i];
                contImpar++;

                if (contImpar == 5) {
                    System.out.println("Vetor impar cheio: " + Arrays.toString(arrayImpar));
                    contImpar = 0;
                }
            }
        }

        
        System.out.print("Restante Par: ");
        for (int i = 0; i < contPar; i++) {
            System.out.print(arrayPar[i] + " ");
        }

        System.out.print("\nRestante Impar:\n ");
        for (int i = 0; i < contImpar; i++) {
            System.out.print(arrayImpar[i] + "\n ");
        }
    }
}