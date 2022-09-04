import java.util.Scanner;

// Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula
// PRESTACAO ← VALOR + (VALOR * TAXA/100) * TEMPO).

public class ExercicioE {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        double valor = read.nextDouble();

        System.out.println("Digite a taxa: ");
        double taxa = read.nextDouble();

        System.out.println("Digite o tempo: ");
        int tempo = read.nextInt();

        double prestacao = valor + (valor * taxa / 100) * tempo;

        System.out.println("O valor da prestação em atraso é de: " + prestacao + " reais");
    }
}
