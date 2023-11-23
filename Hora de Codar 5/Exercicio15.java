public class Exercicio15 {
    public static void main(String[] args) {
        //Anacleto tem 1,50 metro e cresce 2 centímetros por ano, enquanto Felisberto tem 1,1O metro e cresce 3 centímetros por ano.
        // Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Felisberto seja maior que Anacleto.

        float altura_a = 1.50f;
        float altura_f = 1.10f;
        int anos = 0;

        while (altura_f < altura_a ) {
            altura_a += 0.02f;
            altura_f += 0.03f;
            anos++;
        }
        System.out.println("Serão necessários " + anos + " anos para que Felisberto seja maior que Anacleto.");

    }
}