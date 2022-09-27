import java.util.*;

public class TipoTriangulo {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int ladoA, ladoB, ladoC;

        do {
            System.out.println("Digite o lado A do Triângulo: ");
            ladoA = input.nextInt();

            System.out.println("Digite o lado B do Triângulo: ");
            ladoB = input.nextInt();

            System.out.println("Digite o lado C do Triângulo: ");
            ladoC = input.nextInt();

            if(ladoA < 0 || ladoB < 0 || ladoC < 0) {
                System.out.println("Valores inálidos");
                System.out.println();
            }
        }while(ladoA < 0 || ladoB < 0 || ladoC < 0);
    }
}
