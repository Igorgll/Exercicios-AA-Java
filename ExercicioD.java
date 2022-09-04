import java.util.Scanner;

// Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um
// automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto
// (TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a
// distância percorrida com a fórmula DISTANCIA ← TEMPO * VELOCIDADE. Possuindo o valor da
// distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula
// LITROS_USADOS ← DISTANCIA / 12. Ao final, o programa deve apresentar os valores da velocidade
// média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a
// quantidade de litros (LITROS_USADOS) utilizada na viagem.

public class ExercicioD {
    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o tempo gasto durante a viagem: ");
        int tempo = read.nextInt();

        System.out.println("Digite a velocidade média durante a viagem: ");
        int velocidade = read.nextInt();
        
        double distancia = (tempo * velocidade);
        double litros_usados = distancia / 12;

        System.out.println("Velocidade média: " + velocidade);
        System.out.println("Tempo gasto: " + tempo + " horas");
        System.out.println("Distancia: " + distancia + " Km");
        System.out.println("Quantidade de litros usados: " + litros_usados);
    }
}
