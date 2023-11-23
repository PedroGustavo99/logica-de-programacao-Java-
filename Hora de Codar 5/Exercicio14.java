import java.util.Scanner;

public class Exercicio14{
    public static void main(String[] args) {
        //Escreva um programa para ler 6 notas de um aluno, calcular e imprimir a média final. Considere que a nota de aprovação é 6,5.
        // Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta.
        // Se a resposta for "S", o programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.

        Scanner scanner = new Scanner(System.in);
        int alunosAprovados = 0;

        do {
            double somaNotas = 0;

            for (int i = 1; i <= 6; i++) {
                System.out.print("Digite a nota " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            double media = somaNotas / 6;

            if (media >= 6.5) {
                System.out.println("Aluno Aprovado! Média Final: " + media);
                alunosAprovados++;
            } else {
                System.out.println("Aluno Reprovado! Média Final: " + media);
            }

            System.out.print("Calcular a média de outro aluno? (Sim/Não): ");
            String resposta = scanner.next().toUpperCase();

            if (!resposta.equals("S")) {
                break;
            }

        } while (true);

        System.out.println("Quantidade de alunos aprovados: " + alunosAprovados);
    }
}

