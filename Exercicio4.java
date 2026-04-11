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
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[20];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Contador inverso: ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i] + "");
        }

        int[] vetorInv = vetor.clone();
        for (int i = 0; i < vetorInv.length / 2; i++) {
            int temp = vetorInv[i];
            vetorInv[i] = vetorInv[vetorInv.length - 1 - i];
            vetorInv[vetorInv.length - 1 - i] = temp;
        }
        System.out.println("\n\n - Vetor invertido na memória:");
        System.out.println(Arrays.toString(vetorInv));
    }

}
