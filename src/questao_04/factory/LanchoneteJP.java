package questao_04.factory;

import questao_04.model.*;

public class LanchoneteJP implements SanduicheFactory{
    @Override
    public Sanduiche criaSanduiche() {
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.montaSanduiche(Pao.FRANCES, Queijo.MUSSARELA, Presunto.FRANGO, Salada.COM_VERDURA);
        return sanduiche;
    }
}
