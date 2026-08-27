

public class Pedido {
	private int idPedido;
    private int idProduto;
    private Cliente cliente;
    private boolean temBebida;

    public Pedido(int idPedido, int idProduto, Cliente cliente, boolean temBebida) {
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.cliente = cliente;
        this.temBebida = temBebida;
    }

    public int getIdPedido() {
        return idPedido;
    }

}
