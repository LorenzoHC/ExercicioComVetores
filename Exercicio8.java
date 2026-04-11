/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado4;

import java.util.Arrays;

/**
 *
 * @author loren
 */
public class Exercicio8 {
    public static void main(String[] args) {
        
        int[] vetor1 = {5, 8, 2, 9, 1, 6, 3, 7, 4, 10};
        int[] vetor2 = {15, 18, 12, 19, 11, 16, 13, 17, 14, 20};

        int[] vetor3 = new int[20];

       
        for (int i = 0; i < 10; i++) {
            vetor3[i] = vetor1[i];
            vetor3[i + 10] = vetor2[i];
        }

       
        for (int i = 0; i < vetor3.length - 1; i++) {
            for (int j = 0; j < vetor3.length - 1 - i; j++) {

                if (vetor3[j] > vetor3[j + 1]) {
                    int temp = vetor3[j];
                    vetor3[j] = vetor3[j + 1];
                    vetor3[j + 1] = temp;
                }
            }
        }

        System.out.println("Vetor 1: " + Arrays.toString(vetor1));
        System.out.println("Vetor 2: " + Arrays.toString(vetor2));
        System.out.println("Vetor 3 ordenado: " + Arrays.toString(vetor3));
    }
}
    

