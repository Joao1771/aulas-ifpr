

public class Pizza {
	private String nome;
    private int preco;
    private String sabor;

    public Pizza(String nome, int preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return nome + " (" + sabor + ") - R$" + preco;
    }
}
