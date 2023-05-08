package questao_01.builders;

import questao_01.model.Contato;
import questao_01.model.ContatoCompleto;

public class ContatoCompletoBuilder implements Builder {
    private ContatoCompleto contatoCompleto;

    public void novoContato() {
        contatoCompleto = new ContatoCompleto();
    }

    public void addNome(String nome) {
        contatoCompleto.setNome(nome);
    }

    public void addEndereco(String endereco) {
        contatoCompleto.setEndereco(endereco);
    }

    public void addTelefone(String telefone) {
        contatoCompleto.setTelefone(telefone);
    }

    public void addEmail(String email) {
        contatoCompleto.setEmail(email);
    }

    public Contato getContato() {
        return contatoCompleto;
    }
}
