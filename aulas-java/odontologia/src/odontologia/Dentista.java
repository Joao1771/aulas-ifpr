package odontologia;

public class Dentista extends Pessoa {
    private String cro;
    private int capacidade; // Capacidade de atendimento diário

    public Dentista(String nome, double salario, String cro, int capacidade) {
        super(nome, salario);
        this.cro = cro;
        this.capacidade = capacidade;
    }

    // Getters e Setters
    public String getCro() { return this.cro; }
    public void setCro(String cro) { this.cro = cro; }
    public int getCapacidade() { return this.capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }

    @Override
    public String toString() {
        return super.toString() + " - CRO: " + cro;
    }
}