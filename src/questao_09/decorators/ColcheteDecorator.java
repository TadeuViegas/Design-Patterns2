package questao_09.decorators;

public class ColcheteDecorator extends NumeroDecorator {
    public ColcheteDecorator(Numero numero) {
        super(numero);
    }

    @Override
    public void imprimir() {
        System.out.print("[");
        super.imprimir();
        System.out.print("]" + "\n");
    }
}
