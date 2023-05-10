package questao_05;

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
