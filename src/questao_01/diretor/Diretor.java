package questao_01.diretor;

import questao_01.builders.Builder;
import questao_01.builders.ContatoCompletoBuilder;
import questao_01.builders.ContatoInternetBuilder;
import questao_01.model.Contato;
import questao_01.model.Pessoa;

public class Diretor {
    private Builder builder;
    private Contato contato;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void construirContato(Pessoa pessoa) {
        builder.novoContato();
        builder.addNome(pessoa.getNome());

        if (builder instanceof ContatoCompletoBuilder) {
            builder.addEndereco(pessoa.getEndereco());
        }

        builder.addTelefone(pessoa.getTelefone());

        if (builder instanceof ContatoInternetBuilder || builder instanceof ContatoCompletoBuilder) {
            builder.addEmail(pessoa.getEmail());
        }

        contato = builder.getContato();
    }

    public Contato getContato() {
        return contato;
    }
}
