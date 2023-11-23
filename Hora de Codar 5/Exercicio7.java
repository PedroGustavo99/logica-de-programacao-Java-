
import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        //Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

                double[] valores = new double[3];

                for (int i = 0; i < 3; i++) {
                    valores[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":"));
                }

                double maior = Math.max(valores[0], Math.max(valores[1], valores[2]));
                double segundoMaior = Math.min(Math.max(valores[0], valores[1]), Math.max(valores[1], valores[2]));

                double somaDosDoisMaiores = maior + segundoMaior;

                JOptionPane.showMessageDialog(null, "A soma dos dois maiores números é: " + somaDosDoisMaiores);

    }
}