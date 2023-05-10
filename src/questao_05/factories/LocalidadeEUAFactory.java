package questao_05.factories;

import questao_05.model.Data;
import questao_05.model.DataEUA;
import questao_05.model.Moeda;
import questao_05.model.MoedaEUA;

public class LocalidadeEUAFactory extends LocalidadeAbstractFactory{
    @Override
    public Moeda getMoeda(double valor) {
        return new MoedaEUA(valor);
    }
    @Override
    public Data getData(int mes, int dia, int ano){
        return new DataEUA(mes, dia, ano);
    }
}
