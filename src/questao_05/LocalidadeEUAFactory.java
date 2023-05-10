package questao_05;

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
