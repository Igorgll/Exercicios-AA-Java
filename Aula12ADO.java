import java.util.stream.IntStream;

import javax.swing.JOptionPane;

public class Aula12ADO {
    public static void main(String[] args) {
        menu();
    }

    public static void getNums() {
        int A = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o menor valor para A"));
        int B = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o maior valor para B"));
        int soma = 0;

        int[] vetor = IntStream.rangeClosed(A, B).toArray();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                soma += vetor[i];
            }
        }
        JOptionPane.showMessageDialog(null, "A soma dos números ímpares: " + soma);
    }

    public static void getFatorial() {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número para saber o fatorial dele"));
        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        JOptionPane.showMessageDialog(null, "O fatorial de " + num + " é: " + fatorial);
    }

    public static void menu() {
        String linhasMenu = "";
        int itemMenu = 0;
        linhasMenu = "MENU \n1- Digitar os números.";
        linhasMenu += "\n2- Descubra o fatorial de um número.";
        linhasMenu += "\n3- Finalizar Programa.";
        while (true) {
            itemMenu = Integer.parseInt(JOptionPane.showInputDialog(null, linhasMenu));
            switch (itemMenu) {
                case 1: {
                    getNums();
                    break;
                }
                case 2:
                    getFatorial();
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        }
    }
}