package PASTA1.java.util;

import java.util.Scanner;

public class Calcularmassacorporal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULO DO INDICE DE MASSA CORPORAL");
        System.out.print("Digite o seu peso (em Kg): ");
        Double peso = scanner.nextDouble();
        System.out.print("Digite sua altura (em metros): ");
        Double altura = scanner.nextDouble();
        Double alturaoaQuadrado = altura * altura;
        Double indiceMassaCorporal = peso / alturaoaQuadrado;

    }
}
