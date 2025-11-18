package odontologia;

public class Acompanhamento {

    // Guarda o horário em que o acompanhamento acontece
    private Horario horario;

    // Data da consulta (mantida como String para simplicidade no nível básico)
    private String data;

    // Relações básicas do acompanhamento
    private Dentista dentista;
    private Paciente paciente;
    private Consulta consulta;

    // Status atual do acompanhamento
    // Pode ser: "MARCADO", "REMARCADO", "CANCELADO"
    private String status;

    //   Construtor principal do acompanhamento.
    // Pega automaticamente o dentista e o paciente da consulta recebida.
    
    public Acompanhamento(Consulta consulta, String data, Horario horario) {
        this.consulta = consulta;
        this.data = data;
        this.horario = horario;

        // Associação direta com a consulta
        this.dentista = consulta.getDentista();
        this.paciente = consulta.getPaciente();

        // Toda consulta criada começa marcada
        this.status = "MARCADO";
    }

    // Marca um acompanhamento (caso esteja cancelado ou não).
    // Retorna true para indicar que funcionou.
    
    public boolean marcarConsulta() {
        this.status = "MARCADO";
        return true;
    }

    // Tenta remarcar o acompanhamento.
    // Não permite remarcar se estiver CANCELADO.
    
    public boolean remarcarConsulta() {
        if (this.status.equals("CANCELADO")) {
            // Cancelado não pode ser remarcado
            return false;
        }
        this.status = "REMARCADO";
        return true;
    }

    //Cancela definitivamente o acompanhamento.
    
    public boolean cancelarConsulta() {
        this.status = "CANCELADO";
        return true;
    }

    //GETTERS/SETTERS

    public Horario getHorario() { return this.horario; }

    public void setHorario(Horario horario) { 
        this.horario = horario; 
    }

    // Representação em string do acompanhamento.
    
    @Override
    public String toString() {
        return "Acomp. em " + data + " às " + horario.getHora() + " | Status: " + status;
    }
}
