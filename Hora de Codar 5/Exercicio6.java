import javax.swing.*;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

        int i;
        double compara = 0;
        double numero = 0;

        Scanner input = new Scanner(System.in);


        for (i = 0; i < 3; i++) {
            numero = Double.parseDouble(JOptionPane.showInputDialog("Digite os números: "));

        }
        compara += numero;

        if (numero < compara) {
            compara = numero;

        }
        JOptionPane.showMessageDialog(null, "O número maior é " + numero);

    }
}

