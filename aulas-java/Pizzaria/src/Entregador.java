
public class Entregador {
	private String idTrabalhador;
    private String nome;
    private EnderecoPedido enderecoPedido;
    private EnderecoPizzaria enderecoPizzaria;

    public Entregador(String idTrabalhador, String nome, EnderecoPizzaria enderecoPizzaria) {
        this.idTrabalhador = idTrabalhador;
        this.nome = nome;
        this.enderecoPizzaria = enderecoPizzaria;
    }

    public void entrega(EnderecoPedido destino) {
        System.out.println(nome + " está entregando para: " + destino);
    }
}
