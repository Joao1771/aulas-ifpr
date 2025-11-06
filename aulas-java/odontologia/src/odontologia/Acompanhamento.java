package odontologia;

public class Acompanhamento {
    private Horario horario;
    private String data;
    private Dentista dentista;
    private Paciente paciente;
    private Consulta consulta;
    private String status; // Status de acompanhamento

    public Acompanhamento(Consulta consulta, String data, Horario horario) {
        this.consulta = consulta;
        this.data = data;
        this.horario = horario;
        this.dentista = consulta.getDentista(); 
        this.paciente = consulta.getPaciente();
        this.status = "MARCADO";
    }

    // Métodos com lógica de simulação
    public boolean marcarConsulta() {
        this.status = "MARCADO";
        return true;
    }

    public boolean remarcarConsulta() {
        if (this.status.equals("CANCELADO")) return false;
        this.status = "REMARCADO";
        return true;
    }

    public boolean cancelarConsulta() {
        this.status = "CANCELADO";
        return true;
    }

    // Getters e Setters
    public Horario getHorario() { return this.horario; }
    public void setHorario(Horario horario) { this.horario = horario; }
    
    @Override
    public String toString() {
        return "Acomp. em " + data + " às " + horario.getHora() + " | Status: " + status;
    }
}
