/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificarnumeroprimo;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class VerificarNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, cont = 0;

        System.out.print("Digite um número: ");
        n = scanner.nextInt();

        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
        scanner.close();
    }
}
