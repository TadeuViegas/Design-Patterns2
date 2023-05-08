package questao_03.states;

import questao_03.model.Processo;

public class EmAvaliacaoState implements ProcessoState {
    public void avalia(Processo processo) {
        processo.setState(new DeferidoState());
        processo.avisaInteressado();
    }
    public void defere(Processo processo) {
        // TODO
    }
    public void indefere(Processo processo) {
        // TODO
    }
    public void fecha(Processo processo) {
        // TODO
    }
}
