/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado4;

/**
 *
 * @author loren
 */
public class Exercicio12 {
        Scanner sc = new Scanner(System.in);

        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] Resultado = new int[10];

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite 5 numeros para o vetor 1: ");
            v1[i] = sc.nextInt();
            Resultado[i] = v1[i];

        }

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite 5 numeros para o vetor 2: ");
            v2[i] = sc.nextInt();
            Resultado[i + 5] = v2[i];

        }

        System.out.println("Vetor unido:");

        for (int i = 0; i < 10; i++) {

            System.out.println(Resultado[i]);
        }
    }
}

