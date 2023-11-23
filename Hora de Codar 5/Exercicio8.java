import java.util.Scanner;

public class Exercicio8 {
    //Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve ser lido um novo valor - ou seja,
    // para o segundo valor não pode ser aceito o valor zero nem um valor negativo.
    // O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double primeiroValor = scanner.nextDouble();

        double segundoValor;
        do {
            System.out.print("Digite o segundo valor (não pode ser zero ou negativo): ");
            segundoValor = scanner.nextDouble();

            if (segundoValor <= 0) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        } while (segundoValor <= 0);

        double resultado = primeiroValor / segundoValor;
        System.out.println("Resultado da divisão: " + resultado);
    }
}
