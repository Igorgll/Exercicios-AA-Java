import javax.swing.JOptionPane;

public class Aula6Ex2 {
    public static void controle() {
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        String idade = JOptionPane.showInputDialog(null, "Digite sua idade: ");

        double x = Double.parseDouble(idade);
        int xc = (int) x;
        String msg;

        if (xc < 10) {
            msg = "O plano de saúde para " + nome + " custa R$30,00";
        } else if (xc > 10 && xc <= 29) {
            msg = "O plano de saúde para " + nome + " custa R$60,00";
        } else if (xc > 29 && xc <= 49) {
            msg = "O plano de saúde para " + nome + " custa R$120,00";
        } else if (xc > 45 && xc <= 59) {
            msg = "O plano de saúde para " + nome + " custa R$150,00";
        } else if (xc > 59 && xc <= 65) {
            msg = "O plano de saúde para " + nome + " custa R$250,00";
        } else {
            msg = "O plano de saúde para " + nome + " custa R$400,00";
        }

        JOptionPane.showMessageDialog(null, msg);
    }

    public static void main(String[] args) {
        controle();
    }
}
