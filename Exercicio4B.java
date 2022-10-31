import java.util.Scanner;

public class Exercicio4B {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        if (numero < 0) {
            numero = numero * -1;
            System.out.println("O número digitado positivo é " + numero);
        } else {
            System.out.println("O número positivo é " + numero);
        }
    }

}
