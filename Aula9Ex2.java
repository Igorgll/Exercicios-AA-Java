import java.util.Arrays;
import javax.swing.JOptionPane;

public class Aula9Ex2 {

    public static void menu() {
        String menu = "MENU", strItem = "", saida = "";
        menu += "\n1- Calcular  \n2- Resultados \n3- Sair";
        char itemMenu;
        double valor = 0, multa = 0, taxaMulta = 0.02, juros, taxaJuros = 0.1;
        double valores[] = new double[2];
        double valorMulta[] = new double[2];
        double valorJuros[] = new double[2];
        double valorPagar[] = new double[2];
        int dias[] = new int[2];

        do {
            strItem = JOptionPane.showInputDialog(null, menu);
            itemMenu = strItem.charAt(0);

            switch (itemMenu) {
                case '1':

                    for (int i = 0; i < valores.length; i++) {
                        valores[i] = Double
                                .parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da prestação"));
                        valor = valores[i];

                        multa = taxaMulta * valor;
                        valorMulta[i] = multa;

                        dias[i] = Integer
                                .parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de dias em atraso"));
                        juros = taxaJuros * 1 / 30 * dias[i] * valor;
                        valorJuros[i] = juros;

                        valorPagar[i] = valor + multa + juros;

                    }

                    saida = "Valores digitados: " + Arrays.toString(valores)
                            + "\nDias: " + Arrays.toString(dias)
                            + "\nValor Multa: " + Arrays.toString(valorMulta)
                            + "\nValor Juros: " + Arrays.toString(valorJuros)
                            + "\nValor a Pagar: " + Arrays.toString(valorPagar);

                    break;

                case '2':
                    JOptionPane.showMessageDialog(null, saida);
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
