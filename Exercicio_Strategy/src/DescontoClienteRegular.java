public class DescontoClienteRegular implements DescontoStrategy{
    @Override
    public double declararDesconto(double preco) {
        preco = preco - (preco * 0.1);
        return preco;
    }

}
