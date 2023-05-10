package questao_05;

public abstract class LocalidadeAbstractFactory {
    public abstract Moeda getMoeda(double valor);
    public abstract Data getData(int dia, int mes, int ano);
}
