import javax.swing.JOptionPane;

public class Exercicio7_1 {
    public static void main(String[] args) {
        //Faça um programa que leia  5 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

        double[] valores = new double[5];

        for (int i = 0; i < 5; i++) {
            valores[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":"));
        }

        double maior = valores[0];
        double segundoMaior = valores[1];

        for (int i = 2; i < 5; i++) {
            if (valores[i] > maior) {
                segundoMaior = maior;
                maior = valores[i];
            } else if (valores[i] > segundoMaior) {
                segundoMaior = valores[i];
            }
        }

        double somaDosDoisMaiores = maior + segundoMaior;

        JOptionPane.showMessageDialog(null, "A soma dos dois maiores números é: " + somaDosDoisMaiores);
    }
}
