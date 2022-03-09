package Filipe_logic.java.util;

import java.util.Scanner;


public class Frete {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();
        System.out.println("Calculando o Produto com o Valor do Frete... ");
        Double Frete = 2.0;
        Double ValorTotal = valorProduto + Frete;
        System.out.print("A soma do Produto com o Frete é: " + ValorTotal);
        scanner.close();

    }
}