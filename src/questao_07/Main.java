package questao_07;

import questao_07.observers.BingoCard;
import questao_07.observers.BingoSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Padrao Observer
        //Main: crie um jogo de Bingo com 5 cartelas, onde cada cartela tem 6 números, e cujo
        //número máximo do sorteio é 50, ou seja, os números sorteados variam dentro do
        //intervalo [0, 50].

        BingoSystem bingoSystem = BingoSystem.getInstance();
        List<BingoCard> bingoCards = new ArrayList<>();
        int maxNumber = 50;
        int numberOfSlots = 6;
        int numberOfCards = 5;

        for (int i = 1; i <= numberOfCards; i++) {
            bingoCards.add(new BingoCard(bingoSystem, i, numberOfSlots, maxNumber));
        }

        System.out.println("- Cartelas aleatórias (BingoCard) -");
        for (BingoCard bc : bingoCards)
            System.out.println(bc);
    }
}
