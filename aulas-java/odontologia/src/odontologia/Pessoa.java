package odontologia;

public abstract class Pessoa {
    private String nome;
    private double salario;
    private boolean verif;
    private String cpf;


    public Pessoa(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.verif = false; 
    }

    public String getCpf() { return this.cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
    public boolean isVerif() { return verif; }
    public void setVerif(boolean verif) { this.verif = verif; }

    @Override
    public String toString() {
        return nome + " (CPF: " + cpf + ")";
    }
}