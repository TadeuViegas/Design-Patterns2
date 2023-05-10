package questao_09;

import questao_09.decorators.*;

public class TesteNumeroDecorado {
    //Padrão Decorator
    //Implemente decoradores para colocar parênteses,
    //colchetes e chaves ao redor do número (ex.: “{1}”). Combine-os de
    //diversas formas.
    public static void main(String[] args) {
        Numero numeroUm = new NumeroUm();
        numeroUm.imprimir();

        numeroUm = new ChaveDecorator(numeroUm);
        numeroUm.imprimir();

        numeroUm = new ParenteseDecorator(numeroUm);
        numeroUm.imprimir();

        numeroUm = new ColcheteDecorator(numeroUm);
        numeroUm.imprimir();

        numeroUm = new ColcheteDecorator(new ChaveDecorator(new ParenteseDecorator(new NumeroUm())));
        numeroUm.imprimir();

        numeroUm = new ChaveDecorator(new ColcheteDecorator(new ParenteseDecorator(new NumeroUm())));
        numeroUm.imprimir();

        numeroUm = new ParenteseDecorator(new ChaveDecorator(new ColcheteDecorator(new NumeroUm())));
        numeroUm.imprimir();

        numeroUm = new ParenteseDecorator(new ColcheteDecorator(new ChaveDecorator(new NumeroUm())));
        numeroUm.imprimir();

        numeroUm = new ChaveDecorator(new ParenteseDecorator(new ColcheteDecorator(new NumeroUm())));
        numeroUm.imprimir();
    }
}
