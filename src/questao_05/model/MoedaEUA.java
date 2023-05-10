package questao_05.model;

import java.text.NumberFormat;
import java.util.Locale;

public class MoedaEUA extends Moeda{
    public MoedaEUA(double valor) {
        super(valor);
    }
    @Override
    public String getValorFormatado() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        return nf.format(valor);
    }

}
