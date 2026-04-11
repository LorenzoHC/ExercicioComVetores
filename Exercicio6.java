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
public class Exercicio6 {
    public static void main(String[] args) {
        int[] vetor = {14, 7, 21, 28, 35, 42, 49};

        int menor = vetor[0];
        int posicao = 0;

        
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicao = i;
            }
        }

        System.out.println("Menor elemento: " + menor);
        System.out.println("Posição: " + posicao);

       
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor[i] / menor;
        }

        System.out.println("Vetor após divisão: " + Arrays.toString(vetor));
    }
}