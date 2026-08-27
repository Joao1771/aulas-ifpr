public class Main {
	public static void main(String[] args) {
        EnderecoPizzaria enderecoPizzaria = new EnderecoPizzaria("Rua Alexandre", "Bairro Pioneiros", "Rio de Janeiro", "RJ", "432432435442");
        EnderecoPedido enderecoCliente = new EnderecoPedido("Rua Boccattino", "Bairro Italia", "São Paulo", "SP", "54234342");

Cliente cliente = new Cliente("123.456.789-00", "João", enderecoCliente);

        Pizza pizza = new Pizza("Calabresa", 40, "Salgada");
        Bebida bebida = new Bebida("Coca-Cola", 10, "2L");
        Pedido pedido = new Pedido(1, 101, cliente, true);

        Pizzaria pizzaria = new Pizzaria(enderecoPizzaria);
        pizzaria.fazerPizza(pizza);   
        pizzaria.entrega();           

        Pizzaiolo pizzaiolo = new Pizzaiolo("001", "Carlos");
        pizzaiolo.fazerPizza(pizza);

        Entregador entregador = new Entregador("002", "Marcos", enderecoPizzaria);

        cliente.realizarPedido(pedido);

        entregador.entrega(enderecoCliente);
        
        System.out.println("\nResumo do Pedido:");
        System.out.println(pedido);
        System.out.println("Itens: " + pizza + " e " + bebida);

    }
    
}