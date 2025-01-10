public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2024;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.3;
        String tipoDoPlano = "plus";

        if (anoDeLancamento >= 2024) {
            System.out.println("Lançamento do momento!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true && tipoDoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Alugue agora mesmo");
        }
    }
}
