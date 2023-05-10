package questao_05;

public class DataBR extends Data {
    public DataBR(int dia, int mes, int ano) {
        super(dia, mes, ano);
    }

    @Override
    public String toString() {
        return "Data Local (Brasil): " + dia +"/"
                + mes +"/"
                + ano +", "
                + DiaDaSemana.SEGUNDA_FEIRA;
    }
}
