import javax.swing.JOptionPane;

public class Classe1 {

    public static void controle() {
        String a = JOptionPane.showInputDialog(null, "Digite uma palavra:");
        String b = JOptionPane.showInputDialog(null, "Digite outra palavra:");

        if (a.equals(b)) { // COMPARAÇÃO
            String msg = "As duas palavras digitadas são iguais:" + a;
            JOptionPane.showMessageDialog(null, msg);
        } else {
            String msg = "As duas palavras digitadas são diferentes:" + a + " e " + b;
            JOptionPane.showMessageDialog(null, msg);
        }
    }

    public static void main(String args[]) {
        controle();
        int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirma Operação",
                JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.NO_OPTION)
            System.exit(0);
        else
            controle();
    }
}