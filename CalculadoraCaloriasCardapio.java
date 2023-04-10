/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardapio;

import java.util.Scanner;


public class CalculadoraCaloriasCardapio {

    
    public static void main(String[] args) {
            int[][] calorias = {{180, 75, 20}, {230, 110, 70}, {250, 170, 100}, {350, 200, 65}};

    
        String[] opcoesPrato = {"1 - Vegetariano", "2 - Peixe", "3 - Frango", "4 - Carne"};
        String[] opcoesSobremesa = {"1 - Abacaxi", "2 - Sorvete diet", "3 - Mouse diet", "4 - Mouse chocolate"};
        String[] opcoesBebida = {"1 - Cha", "2 - Suco de laranja", "3 - Suco de melao", "4 - Refrigerante diet"};

       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o prato:");
        for (String opcao : opcoesPrato) {
            System.out.println(opcao);
        }
        int prato = scanner.nextInt() - 1;

        System.out.println("Escolha a sobremesa:");
        for (String opcao : opcoesSobremesa) {
            System.out.println(opcao);
        }
        int sobremesa = scanner.nextInt() - 1;

        System.out.println("Escolha a bebida:");
        for (String opcao : opcoesBebida) {
            System.out.println(opcao);
        }
        int bebida = scanner.nextInt() - 1;


        int totalCalorias = calorias[prato][0] + calorias[sobremesa][1] + calorias[bebida][2];

        
        System.out.println("A quantidade total de calorias da refeicao e: " + totalCalorias + " cal.");
    }
    }
    
