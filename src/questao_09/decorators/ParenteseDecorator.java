package questao_09.decorators;

public class ParenteseDecorator extends NumeroDecorator {
    public ParenteseDecorator(Numero numero) {
        super(numero);
    }

    @Override
    public void imprimir() {
        System.out.print("(");
        super.imprimir();
        System.out.print(")");
    }
}