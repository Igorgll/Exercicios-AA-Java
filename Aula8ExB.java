import java.util.Arrays;
import javax.swing.JOptionPane;

public class Aula8ExB {
    public static void menu() {
        String menu = "MENU", strItem = "";
        menu += "\n1 Digitar números \n2 Sair";
        int n1, n2, n3, n4;
        char tecla;
        int vetor[] = new int[4];

        do {
            strItem = JOptionPane.showInputDialog(null, menu);
            tecla = strItem.charAt(0);

            switch (tecla) {
                case '1':
                    n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número."));
                    vetor[0] = n1;
                    n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número."));
                    vetor[1] = n2;
                    n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número."));
                    vetor[2] = n3;
                    n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o quarto número."));
                    vetor[3] = n4;

                    Arrays.sort(vetor);
                    JOptionPane.showMessageDialog(null, "Ordem crescente " + "\n" + Arrays.toString(vetor));
                    break;
                case '2':
                    JOptionPane.showMessageDialog(null, "Programa finalizado!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (true);
    }

    public static void main(String[] args) {
        menu();
    }
}
