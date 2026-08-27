

public class Cliente {
	 private String cpfCliente;
	    private EnderecoPedido endereco;
	    private String nome;

	    public Cliente(String cpfCliente, String nome, EnderecoPedido endereco) {
	        this.cpfCliente = cpfCliente;
	        this.nome = nome;
	        this.endereco = endereco;
	    }

	    public Pedido realizarPedido(Pedido pedido) {
	        System.out.println(nome + " realizou o pedido " + pedido.getIdPedido());
	        return pedido;
	    }
}
