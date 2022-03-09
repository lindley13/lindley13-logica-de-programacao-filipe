package Filipe_logic.java.util;

public class Scanner {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("informe um numero: ");
        Integer numero = scanner.nextInt();
        Integer quadrado = numero * numero;
        System.out.print("O quadrado de " + numero + " e " + quadrado + ".");
        scanner.close();
        }
    }

