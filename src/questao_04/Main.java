package questao_04;

import questao_04.factory.LanchoneteCG;
import questao_04.factory.LanchoneteJP;
import questao_04.factory.LanchoneteRT;
import questao_04.factory.SanduicheFactory;
import questao_04.model.Sanduiche;

public class Main {
    public static void main(String[] args) {

        // Padrão Factory Method
        // implementação das variacoes de sanduiches (no caso 3 tipos)
        SanduicheFactory lanchoneteCG = new LanchoneteCG();
        SanduicheFactory lanchoneteJP = new LanchoneteJP();
        SanduicheFactory lanchoneteRT = new LanchoneteRT();

        Sanduiche cg = lanchoneteCG.criaSanduiche();
        Sanduiche jp = lanchoneteJP.criaSanduiche();
        Sanduiche rt = lanchoneteRT.criaSanduiche();

        System.out.println("---------- Lista de Sanduíches --------");

        System.out.println("\n*** Lanchonete CG*** ");
        System.out.println("Ingredientes:");
        System.out.println("Pão: " + rt.getPao());
        System.out.println("Queijo: " + rt.getQueijo());
        System.out.println("Presunto: " + rt.getPresunto());
        System.out.println("Salada: " + rt.getSalada());

        System.out.println("\n*** Lanchonete JP ***");
        System.out.println("Ingredientes:");
        System.out.println("Pão: " + jp.getPao());
        System.out.println("Queijo: " + jp.getQueijo());
        System.out.println("Presunto: " + jp.getPresunto());
        System.out.println("Salada: " + jp.getSalada());

        System.out.println("\n*** Lanchonete RT ***");
        System.out.println("Ingredientes:");
        System.out.println("Pão: " + cg.getPao());
        System.out.println("Queijo: " + cg.getQueijo());
        System.out.println("Presunto: " + cg.getPresunto());
        System.out.println("Salada: " + cg.getSalada());
    }
}
