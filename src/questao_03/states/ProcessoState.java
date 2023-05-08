package questao_03.states;

import questao_03.model.Processo;

public interface ProcessoState {
    void avalia(Processo processo);
    void defere(Processo processo);
    void indefere(Processo processo);
    void fecha(Processo processo);
}
