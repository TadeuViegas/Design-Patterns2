package questao_04.model;

public class Sanduiche {
    private Pao pao;
    private Queijo queijo;
    private Salada salada;
    private Presunto presunto;

    public Sanduiche montaSanduiche(Pao pao, Queijo queijo, Presunto presunto, Salada salada) {
        this.pao = pao;
        this.queijo = queijo;
        this.salada = salada;
        this.presunto = presunto;
        return this;
    }

    public Pao getPao() {
        return pao;
    }

    public Queijo getQueijo() {
        return queijo;
    }

    public Salada getSalada() {
        return salada;
    }

    public Presunto getPresunto() {
        return presunto;
    }

}
