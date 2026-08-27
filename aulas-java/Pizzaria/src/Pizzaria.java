

public class Pizzaria {
	private EnderecoPizzaria endereco;

    public Pizzaria(EnderecoPizzaria endereco) {
        this.endereco = endereco;
    }

    public void fazerPizza(Pizza pizza) {
        System.out.println("Pizzaria fez a pizza: " + pizza);
    }

    public void entrega() {
        System.out.println("Pedido saiu para entrega.");
    }
}
