import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = input.nextDouble();

        if (numero==0){
            System.out.println("O "  + numero + " é neutro.");
        } else if (numero<=0) {
            System.out.println("O " + numero +" é negativo.");
        }
        else {
            System.out.println("O " + numero + " é positivo.");
        }

    }
}
