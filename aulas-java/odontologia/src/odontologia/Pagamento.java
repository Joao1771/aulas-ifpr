package odontologia;

public class Pagamento {
    private double valor;
    private Consulta consulta;
    private String forma; // Ex: "Cartão", "Dinheiro", "Pix"

    public Pagamento(double valor, Consulta consulta, String forma) {
        this.valor = valor;
        this.consulta = consulta;
        this.forma = forma;
        System.out.println("Pagamento de R$" + valor + " registrado para a Consulta ID " + consulta.getId_consulta());
    }

    // Getters e Setters (conforme diagrama)
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
    public Consulta getConsulta() { return consulta; }
    public void setConsulta(Consulta consulta) { this.consulta = consulta; }
    public String getForma() { return forma; }
    public void setForma(String forma) { this.forma = forma; }
    
    @Override
    public String toString() {
        return "Valor: R$" + valor + ", Forma: " + forma;
    }
}