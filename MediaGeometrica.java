import java.util.*;

public class MediaGeometrica {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double nota1 = 0, nota2 = 0, media, faltas;
        String nome;

        System.out.println("Digite seu nome: ");
        nome = input.nextLine();

        do {
            System.out.println("Digite o número de faltas: ");
            faltas = input.nextInt();

            if (faltas < 0) {
                System.out.println("Valor inválido!");
                System.out.println();
            } else if (faltas > 20) {
                System.out.println("Aluno " + nome + " reprovado por faltas!");
                break;
            }
        } while (faltas < 0);

        do {
            while (faltas < 20) {
                System.out.println("Digite sua nota 1: ");
                nota1 = input.nextDouble();

                System.out.println("Digite sua nota 2: ");
                nota2 = input.nextDouble();

                media = Math.pow(nota1 * nota2, 0.5);

                String saida; 
                saida = (String.format("Média: %.1f", media));
                System.out.println(saida);

                if (nota1 < 0 || nota2 < 0) {
                    System.out.println("Valor inválido!");
                    System.out.println();
                }

                if (media < 3) {
                    System.out.println("Aluno " + nome + " Reprovado por notas!");
                    break;
                }

                else if (media >= 3 && media < 5) {
                    System.out.println("Aluno " + nome + " de Recuperação!");
                    break;
                }

                else if (media > 5 && media < 6) {
                    System.out.println("Aluno " + nome + " está de Exame!");
                    break;
                }

                else if (media > 6) {
                    System.out.println("Aluno " + nome + " aprovado!");
                    break;
                }
            }
        } while (nota1 < 0 || nota2 < 0);

    }

}