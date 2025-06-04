/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.medianotas;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar as notas
        double nota1, nota2, nota3, nota4, media;
       
        // Entrada das notas
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = scanner.nextDouble();        
        // Cálculo da média
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        // Exibindo o resultado
        System.out.println("A média das notas é: " + media);
        scanner.close();
    }
}
