import java.util.Arrays;

import javax.swing.JOptionPane;

public class Aula12Ex2 {

    public static void main(String[] args) {
        menu();
    }

    public static int[] lern() {
        int qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de números a ser digitado:"));
        int[] numeros = new int[qtd];
        int par = 0;
        int impar = 0;

        for (int i = 0; i < numeros.length; i++) {
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
            numeros[i] = n;
            if (numeros[i] % 2 == 0) {
                par++;
                calpar(par);
            } else {
                impar++;
                calimpar(impar);
            }
        }
        exibir(numeros, par, impar);
        return numeros;
    }

    public static int calpar(int par) {
        return par;
    }

    public static int calimpar(int impar) {
        return impar;
    }

    public static void exibir(int numeros[], int par, int impar) {
        String saida = "Números digitados: " + Arrays.toString(numeros);
        saida += "\nQuantidade de números pares: " + par;
        saida += "\nQuantidade de números ímpares: " + impar;
        JOptionPane.showMessageDialog(null, saida);
    }

    public static void menu() {
        String linhasMenu = "";
        int tecla = 0;
        linhasMenu = "MENU \n1- Ler números.";
        linhasMenu += "\n2- Sair.";
        while (true) {
            tecla = Integer.parseInt(JOptionPane.showInputDialog(null, linhasMenu));
            switch (tecla) {
                case 1:
                    lern();
                    break;

                case 2:
                    System.exit(0);
                    break;
            }
        }
    }
}