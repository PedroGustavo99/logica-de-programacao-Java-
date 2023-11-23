public class Exercicio11 {
    public static void main(String[] args) {
        //Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0.
        // Utilize "document.write" para escrever em tela e no final da repetição escreva "EXPLOSÃO".

        int bomba = 0;
        int relogio = 30;

        while (bomba < relogio) {
            System.out.println("Contagem " + relogio);
            relogio--;
        }

        System.out.println("EXPLOSÃO");
    }
}
