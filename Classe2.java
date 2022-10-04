import javax.swing.JOptionPane;

public class Classe2 {
    public static void main(String args[]) {
        double n1, n2, faltas;
        double media;
        String status;
        JOptionPane.showMessageDialog(null, "*** Média entre dois valores***");

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota1:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota2:"));
        faltas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de faltas:"));

        media = (n1 + n2) / 2;

        if (media > 6 && faltas < 20) {
            status = "Aluno Aprovado!";
        } else if (media > 6 && faltas > 20) {
            status = "Aluno reprovado por faltas";
        } else {
            status = "Aluno reprovado por notas";
        }
        JOptionPane.showMessageDialog(null, "Sua média é " + media + "\n" + status);
        System.exit(0);
    }
}
