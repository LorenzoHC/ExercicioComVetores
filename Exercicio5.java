/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author loren
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       
       int[] vetorPar = new int[5];
       int[] vetorImpar = new int[5];
       
       int contaPar = 0;
       int contaImpar = 0;
       
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetorPar[contaPar] = vetor[i];
                contaPar++;                
            }else{
                vetorImpar[contaImpar] = vetor[i];
                contaImpar++;            
            }
        }
        System.out.println("Impar: " + Arrays.toString(vetorPar));
        System.out.println("par: " + Arrays.toString(vetorImpar));
    }
}
