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
public class Exercicio10 {
    public static void main(String[] args) {
        
        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            vetor2[i] = vetor1[i];
        }

        System.out.println("Vetor 1: " + Arrays.toString(vetor1));
        System.out.println("Vetor 2: " + Arrays.toString(vetor2));
    }
}
    

