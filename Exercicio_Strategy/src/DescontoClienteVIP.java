public class DescontoClienteVIP implements DescontoStrategy{

    CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
    @Override
    public double declararDesconto(double preco) {
        preco = preco - (preco * 0.2);
        return preco;
    }
}
