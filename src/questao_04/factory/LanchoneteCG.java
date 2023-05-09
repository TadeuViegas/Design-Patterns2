package questao_04.factory;

import questao_04.model.*;

public class LanchoneteCG implements SanduicheFactory{
    @Override
    public Sanduiche criaSanduiche() {
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.montaSanduiche(Pao.BOLA, Queijo.CHEDDAR, Presunto.PERU, Salada.SEM_VERDURA);
        return sanduiche;
    }
}
