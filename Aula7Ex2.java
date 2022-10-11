import javax.swing.JOptionPane;

public class Aula7Ex2 {
    public static void menu() {
        double a, b, c, sp;
        int itemMenu;
        String tipo = "";
        String menu = "MENU";
        menu += "\n1 Executar \n2 Finalizar";
        do {
            String strItem = JOptionPane.showInputDialog(null, menu);
            itemMenu = strItem.charAt(0);
            switch (itemMenu) {
                case '1':
                    a = Double.parseDouble(JOptionPane.showInputDialog(null, "Lado A:"));
                    b = Double.parseDouble(JOptionPane.showInputDialog(null, "Lado B:"));
                    c = Double.parseDouble(JOptionPane.showInputDialog(null, "LAdo C:"));
                    if (a >= b + c || b >= a + c || c >= a + b || a <= 0 || b <= 0 || c <= 0) {
                        String saida = "Erro! Lados inválidos!";
                        JOptionPane.showMessageDialog(null, saida);
                        break;
                    } else {
                        sp = (a + b + c) / 2;

                        if (a == b && b == c) {
                            tipo = "Equilátero";
                        } else if (a != b && a != c && b != c) {
                            tipo = "Escaleno";
                        } else if (a == b && a != c || a == c && a != b || b == c && b != a) {
                            tipo = "Isósceles";
                        }
                    }
                    JOptionPane.showMessageDialog(null, tipo + " " + sp);
                    break;
                case '2':
                    JOptionPane.showMessageDialog(null, "Programa Finalizado!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
            }
        } while (true);
    }

    public static void main(String[] args) {
        menu();
    }
}