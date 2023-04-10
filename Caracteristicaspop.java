/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caracteristicaspop;

import java.util.Scanner;


public class Caracteristicaspop {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdFemininoCastanhoCastanho18a35 = 0;
        int qtdTotalHabitantes = 0;
        int qtdTotalFeminino = 0;
        int idade, idadeFemininoCastanhoCastanho18a35;
        double salario;
        char sexo, corOlhos, corCabelos;
        
        System.out.println("Entre com os dados dos habitantes:");
        
        while (true) {
            System.out.print("Sexo (m/f): ");
            sexo = sc.next().charAt(0);
            if (sexo != 'm' && sexo != 'f') {
                System.out.println("Opcao invalida. Tente novamente.");
                continue;
            }
            
            System.out.print("Cor dos olhos (a/v/c/p): ");
            corOlhos = sc.next().charAt(0);
            if (corOlhos != 'a' && corOlhos != 'v' && corOlhos != 'c' && corOlhos != 'p') {
                System.out.println("Opcao invalida. Tente novamente.");
                continue;
            }
            
            System.out.print("Cor dos cabelos (l/c/p/r): ");
            corCabelos = sc.next().charAt(0);
            if (corCabelos != 'l' && corCabelos != 'c' && corCabelos != 'p' && corCabelos != 'r') {
                System.out.println("Opcao inválida. Tente novamente.");
                continue;
            }
            
            System.out.print("Idade (entre 10 e 100): ");
            idade = sc.nextInt();
            if (idade < 10 || idade > 100) {
                System.out.println("Opcao invalida. Tente novamente.");
                continue;
            }
            
            System.out.print("Salario: ");
            salario = sc.nextDouble();
            if (salario < 0) {
                System.out.println("Valor invalido. Tente novamente.");
                continue;
            }
            
            qtdTotalHabitantes++;
            
            if (sexo == 'f') {
                qtdTotalFeminino++;
                
                if (corOlhos == 'c' && corCabelos == 'c' && idade >= 18 && idade <= 35) {
                    qtdFemininoCastanhoCastanho18a35++;
                    idadeFemininoCastanhoCastanho18a35 = idade;
                }
            }
            
            if (idade == -1) {
                break;
            }
        }
        
        double percFemininoCastanhoCastanho18a35 = (double) qtdFemininoCastanhoCastanho18a35 / qtdTotalFeminino * 10;
        System.out.println("Porcentagem de mulheres com olhos e cabelos castanhos, entre 18 e 35 anos: " + percFemininoCastanhoCastanho18a35 + "%");
    }
}
