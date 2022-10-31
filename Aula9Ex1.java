import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aula9Ex1 {

    static Scanner input = new Scanner(System.in);

    public static void menu() {
        String menu = "MENU", strItem = "";
        menu += "\n1- Ler Processar \n2- Resultados \n3- Sair";
        char itemMenu;
        String nome = "";
        int tamanhoVetor = 0, cont = 0;
        double media = 0, saldo = 0;

        do {
            strItem = JOptionPane.showInputDialog(null, menu);
            itemMenu = strItem.charAt(0);

            switch (itemMenu) {
                case '1':
                    tamanhoVetor = Integer
                            .parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de valores"));
                    double valores[] = new double[tamanhoVetor];

                    for (int i = 0; i < tamanhoVetor; i++) {
                        valores[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor"));
                        saldo += valores[i];
                    }

                    cont += tamanhoVetor;   
                    media = saldo / cont;

                    nome = JOptionPane.showInputDialog(null, "Digite o seu nome");

                    JOptionPane.showMessageDialog(null, "Valores Digitados: " + "\n" + Arrays.toString(valores));

                    break;

                case '2':
                    JOptionPane.showMessageDialog(null, "Quantidade de valores digitados: "
                            + cont
                            + "\n Saldo: " + saldo
                            + "\n Média: " + media
                            + "\n Nome: " + nome);

                    break;

                case '3':
                    JOptionPane.showMessageDialog(null, "Programa finalizado!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operação inválida!");
            }
        } while (true);
    }

    public static void main(String[] args) {
        menu();
    }
}
