package questao_01.builders;

import questao_01.model.Contato;
import questao_01.model.ContatoInternet;

public class ContatoInternetBuilder implements Builder {
    private ContatoInternet contatoInternet;

    public void novoContato() {
        contatoInternet = new ContatoInternet();
    }

    public void addNome(String nome) {
        contatoInternet.setNome(nome);
    }

    public void addEmail(String email) {
        contatoInternet.setEmail(email);
    }

    public void addEndereco(String endereco) {
    }

    public void addTelefone(String telefone) {
    }

    public Contato getContato() {
        return contatoInternet;
    }
}
