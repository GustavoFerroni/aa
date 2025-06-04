/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversaotemperatura;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class ConversaoTemperatura {

    public static void main(String[] args) {
        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo para o usuário inserir a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Calculando a conversão para Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        
        // Calculando a conversão para Kelvin
        double kelvin = celsius + 273.15;

        // Exibindo os resultados
        System.out.println(celsius + "°C é igual a " + fahrenheit + "°F.");
        System.out.println(celsius + "°C é igual a " + kelvin + "K.");
        // Fechando o scanner
        scanner.close();
    }
}
