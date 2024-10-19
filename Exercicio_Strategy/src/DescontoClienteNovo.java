public class DescontoClienteNovo implements DescontoStrategy {
    @Override
    public double declararDesconto(double preco) {
        return preco;
    }
}
