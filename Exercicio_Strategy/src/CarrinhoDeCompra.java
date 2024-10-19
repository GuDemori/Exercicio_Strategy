import java.util.ArrayList;

public class CarrinhoDeCompra {

    private ArrayList<Produto> carrinho = new ArrayList<>();

    public void adicionarProduto(Produto produto){ carrinho.add(produto); }

    public void removerProduto(Produto produto){
        carrinho.remove(produto);
    }

    public Double getTotalProdutos(){
        double totalProdutos = 0.0;

        for(Produto produto : this.carrinho){
            totalProdutos += produto.getPreco();
        }
        return totalProdutos;
    }

    public double aplicarDesconto(DescontoStrategy descontoStrategy){
        return descontoStrategy.declararDesconto(getTotalProdutos());
    }

}
