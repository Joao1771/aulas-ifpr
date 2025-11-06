package odontologia;

public class Paciente extends Pessoa {
    private String historico;
    private int id_paciente;

    public Paciente(int id, String nome, String cpf) {
        super(nome, 0); 
        this.id_paciente = id;
        setCpf(cpf);
        this.historico = "Sem histórico médico registrado.";
    }

    public String getHistorico() { return this.historico; }
    public void setHistorico(String historico) { this.historico = historico; }
    public int getIdPaciente() { return this.id_paciente; }
    public void setIdPaciente(int id) { this.id_paciente = id; }
}