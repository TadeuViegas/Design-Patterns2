package questao_05.factories;

import questao_05.model.Data;
import questao_05.model.Moeda;

public abstract class LocalidadeAbstractFactory {
    public abstract Moeda getMoeda(double valor);
    public abstract Data getData(int dia, int mes, int ano);
}
