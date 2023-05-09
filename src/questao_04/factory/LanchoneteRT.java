package questao_04.factory;

import questao_04.model.*;

public class LanchoneteRT implements SanduicheFactory{
    @Override
    public Sanduiche criaSanduiche() {
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.montaSanduiche(Pao.INTEGRAL, Queijo.PRATO, Presunto.FRANGO, Salada.SEM_VERDURA);
        return sanduiche;
    }
}
