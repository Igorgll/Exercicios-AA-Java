// Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de
// conversão é F ← (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
import java.util.Scanner;

public class ExercicioA {
    public static void main (String [] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        int celsius = read.nextInt();

        int fahrenheit = (9 * celsius + 160) / 5;

        System.out.println(celsius + "ºC em fahrenheit é: " + fahrenheit + "ºF");
    }
}