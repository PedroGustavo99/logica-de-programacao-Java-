import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        //Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.

        Scanner scanner = new Scanner(System.in);

        double soma = 0;

        // Leitura dos 10 valores e cálculo da soma
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            soma += scanner.nextDouble();
        }

        // Cálculo e exibição da média aritmética
        double media = soma / 10;
        System.out.println("Média Aritmética: " + media);
    }
}
