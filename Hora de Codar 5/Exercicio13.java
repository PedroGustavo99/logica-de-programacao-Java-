import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        //Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os números inteiros entre eles.
        // Considere que o primeiro sempre será menor que o segundo.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro (maior que o primeiro): ");
        int segundoNumero = scanner.nextInt();

        double media = (double) (primeiroNumero + segundoNumero) / 2;

        System.out.println("Média Aritmética: " + media);

        System.out.println("Números inteiros entre " + primeiroNumero + " e " + segundoNumero + ":");
        for (int i = primeiroNumero + 1; i < segundoNumero; i++) {
            System.out.print(i + " ");
        }
    }
}
