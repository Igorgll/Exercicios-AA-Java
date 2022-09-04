import java.util.Scanner;

// Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
// Volume Raio ** Altura 2 ←π

public class ExercicioC {
    public static void main (String [] args){
        final double PI = 3.14;

        Scanner read = new Scanner(System.in);

        System.out.println("Digite a altura da lata: ");
        double altura = read.nextDouble();

        System.out.println("Digite o raio da lata: ");
        double raio = read.nextDouble();

        double volume = PI * Math.pow(raio, 2) * altura;
        
        System.out.println("O volume da lata de óleo é: " + volume);
    }
}
