import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme preferido: ");
        String filme = leitura.nextLine();
        System.out.println("Qual é o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Qual é sua nota para esse filme ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

    }
}