package questao_05;

public abstract class Moeda {
    protected double valor;
    public Moeda(double valor) {
        this.valor = valor;
    }
    public abstract String getValorFormatado();
}
