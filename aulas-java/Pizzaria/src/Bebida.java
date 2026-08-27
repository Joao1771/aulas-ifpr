

public class Bebida {
	private int preco;
    private String nome;
    private String volume;

    public Bebida(String nome, int preco, String volume) {
        this.nome = nome;
        this.preco = preco;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return nome + " (" + volume + ") - R$" + preco;
    }
}
