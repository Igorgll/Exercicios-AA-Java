import javax.swing.JOptionPane;

public class Aula8ExC {
    public static void menu() {
        String menu = "MENU", strItem = "", bissexto = "Bissexto", naoBissexto = "Não Bissexto";
        menu += "\n1 Digitar anos \n2 Sair";
        int ANO, MR;
        char tecla;

        do {
            strItem = JOptionPane.showInputDialog(null, menu);
            tecla = strItem.charAt(0);

            switch (tecla) {
                case '1':
                    ANO = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um ano."));

                    MR = ANO % 4;

                    if (MR == 0) {
                        JOptionPane.showMessageDialog(null, bissexto);
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, naoBissexto);
                        break;
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
