/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ado4;

import java.util.Scanner;

/**
 *
 * @author loren
 */
public class ADO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int contadorPar = 0;
        int[] arrayNumero = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 24, 22, 22};

        for (int i = 0; i < arrayNumero.length; i++) {
            System.out.println(arrayNumero[i]);
            if (arrayNumero[i] % 2 == 0) {
                contadorPar++;
            }
        }
        System.out.println("existem " + contadorPar + " numeros pares");

    }

}
