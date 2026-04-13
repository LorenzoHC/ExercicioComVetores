/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado4;

/**
 *
 * @author loren
 */
public class Exercicio11 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] Soma = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite 10 numeros para o vetor 1: ");
            v1[i] = sc.nextInt();

        }

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite 10 numeros para o vetor 2: ");
            v2[i] = sc.nextInt();

        }

        for (int i = 0; i < 10; i++) {

            Soma[i] = v1[i] + v2[i];

        }

        System.out.println("Resultado:");

        for (int i = 0; i < 10; i++) {

            System.out.println(Soma[i]);

        }
    }
}
    

