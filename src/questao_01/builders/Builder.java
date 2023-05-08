package questao_01.builders;

import questao_01.model.Contato;

public interface Builder {
    void novoContato();
    void addNome(String nome);
    void addEndereco(String endereco);
    void addTelefone(String telefone);
    void addEmail(String email);
    Contato getContato();
}
