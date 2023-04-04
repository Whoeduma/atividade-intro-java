/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revendedoracarros;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class RevendedoraCarros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       System.out.println("Infome o número de carros vendidos: ");
       int numCarrosVendidos = scanner.nextInt();
       
       System.out.println("Informe o total de vendas: ");
       double valorTotalVendas = scanner.nextDouble();
       
       System.out.print("Informe o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Informe o valor recebido por carro vendido: ");
        double valorPorCarro = scanner.nextDouble();
        
        double comissaoPorCarro = valorPorCarro * numCarrosVendidos;
        double comissaoPorVenda = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoPorCarro + comissaoPorVenda;

        System.out.println("O salário final do vendedor é: " + salarioFinal);
    }
    
}
