import javax.swing.JOptionPane;

class Aula11Ex1 {

    public static double getMontante() {
        double montante;
        montante = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o montante:"));
        return montante;
    }

    public static int getPeriodo() {
        int periodo;
        periodo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o período em meses:"));
        return periodo;
    }

    public static double calcCapital(int periodo, double montante) {
        double valorCapital = 0;
        double taxaJuros = 0.05 * montante;
        valorCapital = montante / (taxaJuros * periodo);

        return valorCapital;
    }

    public static void exibir(double montante, int periodo, double valorCapital) {
        String saida;
        saida = "Montante: " + montante;
        saida += "\n Período: " + periodo + " meses";
        saida += String.format("\n Capital aplicado: %.3f", valorCapital);

        JOptionPane.showMessageDialog(null, saida);
    }

    public static void controle() {
        double montante = 0, valorCapital = 0;
        int periodo = 0;
        String linhasMenu = "";
        int itemMenu = 0;
        linhasMenu = "MENU \n1- Digitar montante/período e calcular valores";
        linhasMenu += "\n2- Mostrar resultados ";
        linhasMenu += "\n3- Finalizar Programa";
        while (true) {
            itemMenu = Integer.parseInt(JOptionPane.showInputDialog(null, linhasMenu));
            switch (itemMenu) {
                case 1: {
                    montante = getMontante();
                    periodo = getPeriodo();
                    valorCapital = calcCapital(periodo, montante);
                    JOptionPane.showMessageDialog(null, "Capital calculado com sucesso!");
                    break;
                }
                case 2:
                    exibir(montante, periodo, valorCapital);
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        }
    }

    public static void main(String[] args) {
        controle();
    }

}
