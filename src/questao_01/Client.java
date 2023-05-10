package questao_01;

import questao_01.diretor.Diretor;
import questao_01.builders.Builder;
import questao_01.builders.ContatoCompletoBuilder;
import questao_01.builders.ContatoInternetBuilder;
import questao_01.builders.ContatoTelefoneBuilder;
import questao_01.model.*;

public class Client {
    public static void main(String[] args) {
        //Padrõe Builder e Step Builder
        Diretor diretor = new Diretor();

        Pessoa pessoa = new Pessoa(
                "Tadeu Viegas",
                "Avenida ABC, Numero 777",
                "(98-981106451)",
                "tadeu@ifma.com");

        Builder contatoCompletoBuilder = new ContatoCompletoBuilder();
        Builder contatoTelefoneBuilder = (Builder) new ContatoTelefoneBuilder();
        Builder contatoInternetBuilder = new ContatoInternetBuilder();

        diretor.setBuilder(contatoInternetBuilder);
        diretor.construirContato(pessoa);
        ContatoInternet contatoInternet = (ContatoInternet) diretor.getContato();
        System.out.println("\n------------------- Informações de Contato --------------------\n"
                + contatoInternet.toString());

        diretor.setBuilder(contatoTelefoneBuilder);
        diretor.construirContato(pessoa);
        ContatoTelefone contatoTelefone = (ContatoTelefone) diretor.getContato();
        System.out.println(contatoTelefone.toString());

        diretor.setBuilder(contatoCompletoBuilder);
        diretor.construirContato(pessoa);
        ContatoCompleto contatoCompleto = (ContatoCompleto) diretor.getContato();
        System.out.println(contatoCompleto.toString());
    }
}
