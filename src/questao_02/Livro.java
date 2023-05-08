package questao_02;

import java.util.List;

public class Livro {
    private String nomeNacional;
    private int ano;
    private List<String> autores;
    private int edicao;
    private String cidade;
    private String editora;
    private String nomeOriginal;
    private List<String> tradutores;
    private int paginas;
    private long isbn;

    private Livro(LivroBuilder builder) {
        this.nomeNacional = builder.nomeNacional;
        this.ano = builder.ano;
        this.autores = builder.autores;
        this.edicao = builder.edicao;
        this.cidade = builder.cidade;
        this.editora = builder.editora;
        this.nomeOriginal = builder.nomeOriginal;
        this.tradutores = builder.tradutores;
        this.paginas = builder.paginas;
        this.isbn = builder.isbn;
    }

    public static class LivroBuilder {
        private String nomeNacional;
        private int ano;
        private List<String> autores;
        private int edicao;
        private String cidade;
        private String editora;
        private String nomeOriginal;
        private List<String> tradutores;
        private int paginas;
        private long isbn;

        public LivroBuilder(String nomeNacional) {
            this.nomeNacional = nomeNacional;
        }

        public LivroBuilder publicadoEm(int ano) {
            this.ano = ano;
            return this;
        }

        public LivroBuilder dosAutores(String... autores) {
            this.autores = List.of(autores);
            return this;
        }

        public LivroBuilder edicao(int edicao) {
            this.edicao = edicao;
            return this;
        }

        public LivroBuilder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public LivroBuilder editora(String editora) {
            this.editora = editora;
            return this;
        }

        public LivroBuilder nomeOriginal(String nomeOriginal) {
            this.nomeOriginal = nomeOriginal;
            return this;
        }

        public LivroBuilder tradutores(String... tradutores) {
            this.tradutores = List.of(tradutores);
            return this;
        }

        public LivroBuilder paginas(int paginas) {
            this.paginas = paginas;
            return this;
        }

        public LivroBuilder isbn(long isbn) {
            this.isbn = isbn;
            return this;
        }

        public Livro build() {
            return new Livro(this);
        }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nomeNacional='" + nomeNacional + '\'' +
                ", ano=" + ano +
                ", autores=" + autores +
                ", edicao=" + edicao +
                ", cidade='" + cidade + '\'' +
                ", editora='" + editora + '\'' +
                ", nomeOriginal='" + nomeOriginal + '\'' +
                ", tradutores=" + tradutores +
                ", paginas=" + paginas +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
