import java.util.Scanner;

public class ExercicioB {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("Digite seu nome:");
        String nome = input.nextLine();

        System.out.println("Digite seu peso:");
        double peso = input.nextDouble();

        System.out.println("Digite seu altura:");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("IMC = " + imc);

        if (imc < 18.5) {
            System.out.println(nome + " está abaixo do peso!");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println(nome + " está com peso normal");
        } else {
            System.out.println(nome + " está com sobrepeso!");
        }

    }
}