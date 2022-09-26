import java.util.*;

public class MaiorNumero {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numero1 = 0, numero2 = 0, numero3 = 0, maior;

        do {
            System.out.println("Digite um número: ");
            numero1 = input.nextInt();

            System.out.println("Digite outro número: ");
            numero2 = input.nextInt();

            System.out.println("Digite o último número");
            numero3 = input.nextInt();

            if (numero2 == numero1 || numero1 < 0 || numero2 < 0 || numero3 == numero2 || numero3 < 0) {
                System.out.println("Números inválidos!");
                System.out.println();
            }
        } while (numero2 == numero1 || numero1 < 0 || numero2 < 0 || numero3 == numero2 || numero3 < 0);

        maior = Math.max(numero1, numero2);
        if (maior > numero3) {
            System.out.println("O maior número foi: " + maior);
        } else {
            System.out.println("O maior número foi: " + numero3);
        }

    }
}
