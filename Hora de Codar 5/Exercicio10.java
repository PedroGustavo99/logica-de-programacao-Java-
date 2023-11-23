import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        //Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem:
        // PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota da avaliação " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / 4;

        if (media >= 6.0) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        }

        System.out.println("Média do semestre: " + media);
    }
}
