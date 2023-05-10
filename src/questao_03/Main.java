package questao_03;

import questao_03.model.Processo;

public class Main {
    public static void main(String[] args) {
        //Padrão de projeto State
        Processo processo = new Processo();
        processo.avalia();

        // avaliação de um processo
        processo.indefere();
        processo.deferir();

        // após avaliação de um processo, este é conduzidao estado “Fechado”,
        // independente se o estado é “Indeferido” ou “Deferido
        processo.fecha();

    }
}
