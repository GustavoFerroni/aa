/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;

/**
 *
 * @author FATEC ZONA LESTE
*/
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lê o número do usuário
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();
        // Exibe a tabuada de 1 a 10
        System.out.println("\nTabuada do " + numero + ":\n");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}

