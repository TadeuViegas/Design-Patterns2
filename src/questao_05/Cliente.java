package questao_05;

import questao_05.factories.LocalidadeAbstractFactory;
import questao_05.factories.LocalidadeBrasilFactory;
import questao_05.factories.LocalidadeEUAFactory;
import questao_05.model.Data;
import questao_05.model.Moeda;

public class Cliente {
    public static void main(String[] args) {
        //Padrão Abstract Factory
        LocalidadeAbstractFactory factoryBR = new LocalidadeBrasilFactory();
        LocalidadeAbstractFactory factoryEUA = new LocalidadeEUAFactory();

        Data dataBR = factoryBR.getData(9, 5,2023);
        Moeda moedaBR = factoryBR.getMoeda(1250);
        System.out.println(dataBR.toString());
        System.out.println("Valor (Brasil): " + moedaBR.getValorFormatado());

        System.out.println();

        Data dataEUA = factoryEUA.getData(9, 5, 2023);
        Moeda moedaEUA = factoryEUA.getMoeda(1250);
        System.out.println(dataEUA.toString());
        System.out.println("Valor (EUA): " + moedaEUA.getValorFormatado());


    }
}
