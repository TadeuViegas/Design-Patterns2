package questao_09.decorators;

public class ChaveDecorator extends NumeroDecorator {
    public ChaveDecorator(Numero numero) {
        super(numero);
    }

    @Override
    public void imprimir() {
        System.out.print("{");
        super.imprimir();
        System.out.print("}");
    }
}