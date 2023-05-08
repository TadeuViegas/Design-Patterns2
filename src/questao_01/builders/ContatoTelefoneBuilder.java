package questao_01.builders;

import questao_01.model.Contato;
import questao_01.model.ContatoTelefone;

public class ContatoTelefoneBuilder implements Builder {
    private ContatoTelefone contatoTelefone;

    public void novoContato() {
        contatoTelefone = new ContatoTelefone();
    }

    public void addNome(String nome) {
        contatoTelefone.setNome(nome);
    }

    public void addEndereco(String endereco) {
        // Não faz nada
    }

    public void addTelefone(String telefone) {
        contatoTelefone.setTelefone(telefone);
    }

    public void addEmail(String email) {
        // Não faz nada
    }

    public Contato getContato() {
        return contatoTelefone;
    }
}
