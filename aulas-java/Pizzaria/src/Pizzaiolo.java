

public class Pizzaiolo {
	private String idTrabalhador;
    private String nome;

    public Pizzaiolo(String idTrabalhador, String nome) {
        this.idTrabalhador = idTrabalhador;
        this.nome = nome;
    }

    public void fazerPizza(Pizza pizza) {
        System.out.println(nome + " fez a pizza: " + pizza);
    }
}
