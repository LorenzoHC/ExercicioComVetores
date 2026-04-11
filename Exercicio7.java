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
public class Exercicio7 {
    public static void main(String[] args) {
        int[] vetor = {6, 7, 3, 8, 5, 2, 7, 1, 9, 10};

        
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {

                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("Vetor em ordem crescente:");
        System.out.println(Arrays.toString(vetor));
    }
}
