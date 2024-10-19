public class LojaOnline {

    public static void main(String[] args) {
        Produto camiseta = new Produto("Camiseta", 50.0);
        Produto tenis = new Produto("Tenis Nike", 299.90);
        Produto calca = new Produto("Calca", 84.90);

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.adicionarProduto(camiseta);
        carrinhoDeCompra.adicionarProduto(camiseta);
        carrinhoDeCompra.adicionarProduto(calca);
        carrinhoDeCompra.adicionarProduto(tenis);
        carrinhoDeCompra.removerProduto(camiseta);

        System.out.println("Total para cliente novo: " + carrinhoDeCompra.aplicarDesconto(new DescontoClienteNovo()));


        System.out.println("Total para cliente regular: " + carrinhoDeCompra.aplicarDesconto(new DescontoClienteRegular()));


        System.out.println("Total para cliente VIP: " + carrinhoDeCompra.aplicarDesconto(new DescontoClienteVIP()));
    }

}
