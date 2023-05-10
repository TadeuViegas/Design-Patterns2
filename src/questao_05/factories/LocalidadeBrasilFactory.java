package questao_05.factories;

import questao_05.model.Data;
import questao_05.model.DataBR;
import questao_05.model.Moeda;
import questao_05.model.MoedaBR;

public class LocalidadeBrasilFactory extends LocalidadeAbstractFactory {
    @Override
    public Moeda getMoeda(double valor) {
        return new MoedaBR(valor);
    }
    @Override
    public Data getData(int dia, int mes, int ano){
        return new DataBR(dia, mes, ano);
    }
}
