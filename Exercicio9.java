/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado4;

/**
 *
 * @author loren
 */
public class Exercicio9 {
    public static void main(String[] args) {
        
       int[] vetorA = {5, -2, 0, 8, 3, -1, 0, 7, 9, -4};
       int[] vetorB = new int[100];

       int contB = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 0) {
                vetorB[contB] = vetorA[i];
                contB++;
            }
        }

        System.out.print("Vetor B: [");
        for (int i = 0; i < contB; i++) {
            System.out.print(vetorB[i]);

            if (i < contB - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}