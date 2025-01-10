import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totaldeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua nota para o filme ou digite -1 para cancelar");
            nota = leitura.nextDouble();

            if (nota != -1) {
                media += nota;
                totaldeNotas++;
            }
        }

        System.out.println("Média de avaliações: " + media / totaldeNotas);

    }
}
