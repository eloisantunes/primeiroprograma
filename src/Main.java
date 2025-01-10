public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Ainda estou aqui");

        int anoDeLancamento = 2024;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        // Calculo média de notas do filme
        double media = (9.5 + 8.1 + 7.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme com Fernanda Torres\s
                (Atriz vencedora do Globo de Ouro 2025)
                Ano de lançamento:""" + ' ' + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) media;
        System.out.println(classificacao);



    }
}