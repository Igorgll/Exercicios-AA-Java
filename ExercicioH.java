import java.util.Scanner;

// Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula
// VOLUME ← COMPRIMENTO * LARGURA * ALTURA.

public class ExercicioH {
    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o comprimento da caixa: ");
        Double comprimento = read.nextDouble();

        System.out.println("Digite a largura da caixa: ");
        Double largura = read.nextDouble();

        System.out.println("Digite a altura da caixa: ");
        Double altura = read.nextDouble();

        Double volume = comprimento * largura * altura;

        System.out.println("O volume da caixa é de: " + volume);
    }
}
