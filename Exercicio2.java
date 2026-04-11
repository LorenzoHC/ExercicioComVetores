/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado4;

import java.util.Scanner;

/**
 *
 * @author loren
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrayNumero1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayNumero2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] guardarNumero = new int[10];

        for (int i = 0; i < arrayNumero1.length; i++) {        
            guardarNumero[i] = arrayNumero1[i] * arrayNumero2[i];
        }     
        for (int i = 0; i < guardarNumero.length; i++) {
            System.out.println("o resultado do vetor posicao " + (i+1) + " é " + guardarNumero[i]);
        }
    }
}
