package questao_09.decorators;

public abstract class NumeroDecorator implements Numero {
    private Numero numeroUm;

    public NumeroDecorator(Numero numeroUm) {
        this.numeroUm = numeroUm;
    }

    public void imprimir() {
        numeroUm.imprimir();
    }
}
