package odontologia;

public class Consulta {
    private int id_consulta;
    private Paciente paciente;
    private Dentista dentista;
    private String data;
    private Horario horario;
    private String detalhes;
    private String status = "AGENDADA";
    private Pagamento pagamento;
    
    // Simula o relacionamento 1..* (muitos) com apenas 1 objeto
    private Acompanhamento primeiroAcompanhamento; 

    public Consulta(int id, Paciente paciente, Dentista dentista, String data, Horario horario, String detalhes) {
        this.id_consulta = id;
        this.paciente = paciente;
        this.dentista = dentista;
        this.data = data;
        this.horario = horario;
        this.detalhes = detalhes;
    }

    // Métodos
    public boolean marcar() { this.status = "AGENDADA"; return true; }
    public boolean remarcar() { this.status = "REMARCADA"; return true; }
    public boolean cancelar() { this.status = "CANCELADA"; return true; }
    
    // Adiciona Acompanhamento (usando o campo único)
    public Acompanhamento addAcompanhamento(String data, Horario horario, Dentista dentista, Paciente paciente) {
        if (this.primeiroAcompanhamento == null) {
            this.primeiroAcompanhamento = new Acompanhamento(this, data, horario);
            return this.primeiroAcompanhamento;
        }
        System.out.println("ERRO: Limite de acompanhamentos atingido (máx 1 sem Listas).");
        return null;
    }

    public boolean removerConsulta(Consulta consulta) { return this.cancelar(); }

    // Getters
    public Pagamento getPagamento() { return pagamento; }
    public void setPagamento(Pagamento pagamento) { this.pagamento = pagamento; }
    public int getId_consulta() { return id_consulta; }
    public Paciente getPaciente() { return paciente; }
    public Dentista getDentista() { return dentista; }
    public String getDetalhes() { return this.detalhes; }
    public void setDetalhes(String detalhes) { this.detalhes = detalhes; }
    public String getStatus() { return status; }
    public String getData() { return this.data; }
    public Horario getHorario() { return this.horario; }

    @Override
    public String toString() {
        return "ID: " + id_consulta + " | Paciente: " + paciente.getNome() + " | Data: " + data + " | Status: " + status;
    }
}