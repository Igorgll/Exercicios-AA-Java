import javax.swing.JOptionPane;

public class Aula6Ex1 {

    public static void controle() {
        String valorProduto = JOptionPane.showInputDialog(null, "Digite o valor do produto:");

        double xc = Double.parseDouble(valorProduto);
        double lucro;
        String msg;

        if (xc > 20) {
            lucro = (xc * 30) / 100;
            xc = xc + lucro;
            msg = ("O valor da venda é de: " + xc);
        } else {
            lucro = (xc * 45) / 100;
            xc = xc + lucro;
            msg = ("O valor da venda é de: " + xc);
        }

        JOptionPane.showMessageDialog(null, msg);
    }
    

    public static void main(String[] args) {
        controle();
    }
}