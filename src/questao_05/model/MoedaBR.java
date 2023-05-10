package questao_05.model;

import java.text.NumberFormat;
import java.util.Locale;

public class MoedaBR extends Moeda {
    public MoedaBR(double valor) {
        super(valor);
    }
    @Override
    public String getValorFormatado() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return nf.format(valor);
    }
}
