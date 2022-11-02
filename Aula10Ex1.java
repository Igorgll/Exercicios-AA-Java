import javax.swing.JOptionPane;

public class Aula10Ex1 {
    public static double getComprimento() {
        double comprimento;
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento:"));
        return comprimento;
    }

    public static double calcDiam(double comprimento) {
        double diametro = comprimento / 3.14;
        return diametro;
    }

    public static double calcRaio(double diametro) {
        double raio = diametro / 2;
        return raio;
    }

    public static double calcArea(double raio) {
        double area = Math.pow(raio, raio) * 3.14;
        return area;
    }

    public static void exibir(double diametro, double raio, double area) {
        String saida;
        saida = String.format("Diâmetro: %.2f", diametro);
        saida += String.format("\n Raio: %.2f", raio);
        saida += String.format("\n Área: %.2f", area);

        JOptionPane.showMessageDialog(null, saida);
    }

    public static void controle() {
        double comprimento = 0, diametro = 0, raio = 0, area = 0;
        String linhasMenu = "";
        int itemMenu = 0;
        linhasMenu = "MENU \n1- Ler comprimento";
        linhasMenu += "\n2- Calcular \n3- Mostrar resultados";
        linhasMenu += "\n4- Finalizar programa";
        while (true) {
            itemMenu = Integer.parseInt(JOptionPane.showInputDialog(null, linhasMenu));
            switch (itemMenu) {
                case 1: {
                    comprimento = getComprimento();
                    break;
                }
                case 2: {
                    diametro = calcDiam(comprimento);
                    raio = calcRaio(diametro);
                    area = calcArea(raio);
                    JOptionPane.showMessageDialog(null, "Área calculada com sucesso!");
                    break;
                }
                case 3:
                    exibir(comprimento, diametro, raio);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        controle();
    }
}
