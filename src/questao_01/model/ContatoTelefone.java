package questao_01.model;

public class ContatoTelefone extends Contato{
    private String telefone;
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Contato Telefone: " + nome + ", " + telefone;
    }
}
