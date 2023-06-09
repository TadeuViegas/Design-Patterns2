package questao_08;

import questao_08.decorators.Emissor;
import questao_08.decorators.EmissorBasico;
import questao_08.decorators.EmissorDecoratorComCompressao;
import questao_08.decorators.EmissorDecoratorComCriptografia;

public class TesteEmissorDecorator {
    public static void main(String[] args) {
        //Padrão Decorator
        String mensagem = "Mensagem Teste 123";

        Emissor emissorCript = new EmissorDecoratorComCriptografia(new EmissorBasico());
        emissorCript.envia(mensagem);

        Emissor emissorCompr = new EmissorDecoratorComCompressao(new EmissorBasico());
        emissorCompr.envia(mensagem);

        Emissor emissorCriptCompr = new EmissorDecoratorComCriptografia
                (new EmissorDecoratorComCompressao(new EmissorBasico()));
        emissorCriptCompr.envia(mensagem);
    }

   /* Pergunta Teorica: Você conseguiu observar alguma vantagem nessa abordagem. Comente!

    Tem vantagem nessa abordagem, pois o padrão Decorator é útil em situações onde
    você precisa adicionar funcionalidade a um objeto de maneira flexível e modular,
    sem afetar outros objetos ou modificar o código existente. Ele ajuda a melhorar
    a extensibilidade, a reutilização de código e a separação de preocupações na aplicação.*/
}

