import java.util.*;

public class Poligono {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numLados;

        System.out.println("Digite o número de lados do polígono:");
        numLados = input.nextInt();

        if (numLados < 3) {
            System.out.println("Não é um polígono");
        }

        else if (numLados == 3) {
            System.out.println("TRIÂNGULO");

            System.out.println("Digite o primeiro lado: ");
            int ladoA = input.nextInt();

            System.out.println("Digite o segundo lado: ");
            int ladoB = input.nextInt();

            System.out.println("Digite o terceiro lado: ");
            int ladoC = input.nextInt();

            int p = (ladoA + ladoB + ladoC) / 2;
            double a = Math.sqrt(p*(p-ladoA) * (p - ladoB) * (p - ladoC));

            String saida;
            saida = (String.format ("A área do triângulo é de: %.1f", a));

            System.out.println(saida);
        }

        else if (numLados == 4) {
            System.out.println("QUADRADO");

            System.out.println("Digite a base do quadrado: ");
            int base = input.nextInt();

            System.out.println("Digite a altura do quadrado: ");
            int altura = input.nextInt();

            int areaQuadrado = (base * altura);

            System.out.println("A área do quadrado é: " + areaQuadrado);
        }

        else if (numLados == 5) {
            System.out.println("PENTÁGONO");

            System.out.println("Digite o lado do pentágono: ");
            int lado = input.nextInt();

            float area = (float) (Math.sqrt(5 * (5 + 2 * (Math.sqrt(5)))) * lado * lado) / 4;

            String saida;
            saida = (String.format("A área do pentágono é de: %.1f", area));
            System.out.println(saida);

        } else {
            System.out.println("Polígono não identificado");
        }
    }
}
