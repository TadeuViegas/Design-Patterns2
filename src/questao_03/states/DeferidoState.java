package questao_03.states;

import questao_03.model.Processo;

class DeferidoState implements ProcessoState {

    public void avalia(Processo processo) {
        // TODO
    }
    public void defere(Processo processo) {
        // TODO
    }
    public void indefere(Processo processo) {
        // TODO
    }
    public void fecha(Processo processo) {
        processo.setState(new FechadoState());
    }
}
