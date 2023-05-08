package questao_02;

public class Main {
    public static void main(String[] args) {

        //Utilizando o padrão de projeto Step Builder e fluent interface.
        Livro livro = new Livro.LivroBuilder("Dom Casmurro")
                .publicadoEm(1899)
                .dosAutores("Machado de Assis, Tadeu Viegas")
                .edicao(1)
                .cidade("Rio de Janeiro")
                .editora("Garnier")
                .nomeOriginal("Dom Casmurro - Escritor")
                .tradutores("Juliana Correa, Joao Pinheiro")
                .paginas(256)
                .isbn(823482348)
                .build();

        System.out.println(livro.toString());
    }
}
