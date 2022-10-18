import javax.swing.JOptionPane;
import java.util.*;

public class Aula8ExH {
    public static void menu() {
        String menu = "MENU", saida, strItem = "";
        menu += "\n1 Digitar números \n2 Sair";
        char tecla;
        int n1, n2, n3, n4, n5, maior, menor;
        do {
            strItem = JOptionPane.showInputDialog(null, menu);
            tecla = strItem.charAt(0);

            switch (tecla) {
                case '1':
                    n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
                    n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));
                    n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número"));
                    n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o quarto número"));
                    n5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o último número"));


                    if (n1 > n2 || n1 < n2) {
                        saida = n1 + "é maior que" + n2;
                        JOptionPane.showMessageDialog(null, saida);
                    }else {
                        saida = n2 + "é maior";
                        JOptionPane.showMessageDialog(null, saida);
                    }

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
