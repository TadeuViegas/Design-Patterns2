package questao_01.model;

public class ContatoInternet extends Contato {
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contato Internet: " + nome + ", " + email;
    }
}
