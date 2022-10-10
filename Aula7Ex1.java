import javax.swing.JOptionPane;

public class Aula7Ex1 {
    public static void menu() {
        double A, B, C;
        boolean triangulo = false;
        char tecla;
        String strItem, saida;
        String menu = "MENU";
        menu += "\n1 Ler e Exibir \n2 Sair";
        do {
            strItem = JOptionPane.showInputDialog(null, menu);
            tecla = strItem.charAt(0);
            switch (tecla) {
                case '1':
                    A = Double.parseDouble(JOptionPane.showInputDialog(null, "Lado A:"));
                    B = Double.parseDouble(JOptionPane.showInputDialog(null, "Lado B:"));
                    C = Double.parseDouble(JOptionPane.showInputDialog(null, "LAdo C:"));
                    if (A < B + C && B < A + C && C < A + B) {
                        triangulo = true;
                        saida = "Trata-se de um triângulo.";
                    } else {
                        triangulo = false;
                        saida = "Uma figura qualquer de três lados.";
                    }
                    JOptionPane.showMessageDialog(null, saida);
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