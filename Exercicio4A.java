import java.util.Scanner;

public class Exercicio4A {
    static Scanner input = new Scanner(System.in);
    public static void main(String []args) {
    
        System.out.println("Digite um número: ");
        int numero1 = input.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = input.nextInt();

        if (numero1 > numero2) {
            System.out.println("A diferencia é: " + (numero1 - numero2));
        }else {
            System.out.println("A diferencia é: " + (numero2 - numero1));
        }
    }
}
