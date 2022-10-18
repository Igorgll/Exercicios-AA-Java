import javax.swing.JOptionPane;

public class Aula8ExG {
    public static void menu() {

        String menu = "MENU", saida, strItem = "";
        menu += "\n1 Digitar números \n2 Sair";
        char tecla;
        int n1, n2, n3, n4;

        do {
            strItem = JOptionPane.showInputDialog(null, menu);
            tecla = strItem.charAt(0);

            switch (tecla) {
                case '1':
                    n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
                    n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));
                    n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número"));
                    n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o último número"));

                    if (n1 % 2 == 0 && n1 % 3 == 0) {
                        saida = n1 + " é divisível por 2 e por 3";
                        saida += "\nPortanto, 2 e 3 são divisores de " + n1;
                        JOptionPane.showMessageDialog(null, saida);

                    } else {
                        saida = n1 + " não é divisível por 2 e por 3";
                        saida += "\nPortanto, 2 e 3 não são divisores de " + n1;
                        break;
                    }

                    if (n2 % 2 == 0 && n2 % 3 == 0) {
                        saida = n2 + " é divisível por 2 e por 3";
                        saida += "\nPortanto, 2 e 3 são divisores de " + n2;
                        JOptionPane.showMessageDialog(null, saida);

                    } else {
                        saida = n2 + " não é divisível por 2 e por 3";
                        saida += "\nPortanto, 2 e 3 não são divisores de " + n2;
                        break;
                    }

                    if (n3 % 2 == 0 && n3 % 3 == 0) {
                        saida = n3 + " é divisível por 2 e por 3";
                        saida += "\nPortanto, 2 e 3 são divisores de " + n3;
                        JOptionPane.showMessageDialog(null, saida);

                    } else {
                        saida = n3 + " não é divisível por 2 e por 3";
                        saida += "\nPortanto, 2 e 3 não são divisores de " + n3;
                        break;
                    }

                    if (n4 % 2 == 0 && n4 % 3 == 0) {
                        saida = n4 + " é divisível por 2 e por 3";
                        saida += "\nPortanto, 2 e 3 são divisores de " + n4;
                        JOptionPane.showMessageDialog(null, saida);
                    } else {
                        saida = n4 + " não é divisível por 2 e por 3";
                        saida += "\nPortanto, 2 e 3 não são divisores de " + n4;
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
