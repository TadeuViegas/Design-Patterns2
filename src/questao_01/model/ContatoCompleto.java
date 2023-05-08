package questao_01.model;

 public class ContatoCompleto extends Contato {
    protected String endereco;
    protected String telefone;
    protected String email;

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contato Completo: " + nome + ", " + endereco + ", " + telefone + ", " + email;
    }
}
