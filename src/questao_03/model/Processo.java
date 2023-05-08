package questao_03.model;

import questao_03.states.EmAvaliacaoState;
import questao_03.states.ProcessoState;

public class Processo {
    public ProcessoState state;

    public Processo() {
        this.state = new EmAvaliacaoState();
    }

    public void avalia() {
        state.avalia(this);
    }

    public void deferir() {
        state.defere(this);
    }

    public void indefere() {
        state.indefere(this);
    }

    public void fecha() {
        state.fecha(this);
        System.out.println("Processo Fechado");
    }

    public void setState(ProcessoState state) {
        this.state = state;
    }

    public void avisaInteressado() {
        System.out.println("------- Atualizações do Processo ------" +
                "\n TODO: Encaminha aviso ao interessado sobre o status do processo via email");
    }
}
