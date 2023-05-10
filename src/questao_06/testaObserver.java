package questao_06;

import questao_06.observers.Corretora;

public class testaObserver {
    public static void main(String[] args) {
        //Padrao Observer
        //Teste feito com dados fornecidos na questao 06
        Acao acao = new Acao("VALE3", 45.27);
        Corretora corretora1 = new Corretora("Corretora1");
        Corretora corretora2 = new Corretora("Corretora2");
        acao.registraInteressado(corretora1);
        acao.registraInteressado(corretora2);

        acao.setValor(50);
    }
}
/*
Pergunta Teorica: Você conseguiu observar alguma vantagem nessa abordagem. Comente!

Sim. A principal vantagem de usar o padrão Observer em Java é que ele permite que
        objetos em um sistema se comuniquem de maneira desacoplada. Isso significa
        que os objetos não precisam saber uns dos outros para poderem funcionar corretamente.
        O sujeito pode notificar seus observadores sem precisar saber o que eles fazem com a informação recebida.
        Da mesma forma, os observadores podem se registrar para receber notificações do sujeito
        sem precisar saber exatamente o que o sujeito faz ou como ele funciona internamente.*/
