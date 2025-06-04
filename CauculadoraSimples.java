/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cauculadorasimples;

import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class CauculadoraSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dois números
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
                                                                                                                                                                                                                                                                                                       
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Soma e exibição do resultado
        double soma = numero1 + numero2;
        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}
