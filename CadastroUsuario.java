/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadrastrousuario;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Dados do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Digite o curso: ");
        String curso = scanner.nextLine();

        System.out.print("Digite a série: ");
        String serie = scanner.nextLine();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        // Exibição dos dados
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Curso: " + curso);
        System.out.println("Série: " + serie);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
        scanner.close();
    }
}
