package questao_05.model;

public class DataEUA extends Data{
    public DataEUA(int mes, int dia, int ano) {
        super(mes, dia, ano);
    }

    @Override
    public String toString() {
        return "Data Local (EUA): " + mes +"/"
                + dia +"/"
                + ano +", "
                + DayOfWeek.MONDAY;
    }
}
