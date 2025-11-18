package odontologia;

public class Consulta {

    // Identificador único da consulta
    private int id_consulta;

    // Relacionamentos principais
    private Paciente paciente;
    private Dentista dentista;

    // Informações básicas da consulta
    private String data;          // Mantida como String por simplicidade
    private Horario horario;
    private String detalhes;

    // Estado atual da consulta: "AGENDADA", "REMARCADA" ou "CANCELADA"
    private String status = "AGENDADA";

    // Ligação com pagamento (opcional)
    private Pagamento pagamento;

    // Representação de um possível acompanhamento (limitado a 1 porque não pode usar lista)
    private Acompanhamento primeiroAcompanhamento; 


    
    //   Construtor padrão para criar uma consulta
     
    public Consulta(int id, Paciente paciente, Dentista dentista, String data, Horario horario, String detalhes) {
        this.id_consulta = id;
        this.paciente = paciente;
        this.dentista = dentista;
        this.data = data;
        this.horario = horario;
        this.detalhes = detalhes;
    }

    // -------------------------------------------------------
    //      MÉTODOS DE CONTROLE DO STATUS DA CONSULTA
    // -------------------------------------------------------

    
    //   Marca a consulta como agendada.
     
    public boolean marcar() { 
        this.status = "AGENDADA"; 
        return true; 
    }

    
    //  Marca a consulta como remarcada.
    //  Não impede remarcar canceladas — lógica simples da atividade.
    
    public boolean remarcar() { 
        this.status = "REMARCADA"; 
        return true; 
    }

    
    //   Cancela a consulta.
     
    public boolean cancelar() { 
        this.status = "CANCELADA"; 
        return true; 
    }

    
    //   Cancela a consulta (método redundante, mas mantido pela sua estrutura).
    public boolean removerConsulta(Consulta consulta) { 
        return this.cancelar(); 
    }

    // -------------------------------------------------------
    //                ACOMPANHAMENTO
    // -------------------------------------------------------

    
    //   Adiciona um acompanhamento à consulta.
    //   Como não há uso de List, permite somente 1.
     
    //   @return o acompanhamento criado ou null se já existir um.
     
    public Acompanhamento addAcompanhamento(String data, Horario horario, Dentista dentista, Paciente paciente) {
        if (this.primeiroAcompanhamento == null) {
            this.primeiroAcompanhamento = new Acompanhamento(this, data, horario);
            return this.primeiroAcompanhamento;
        }
        System.out.println("ERRO: Limite de acompanhamentos atingido (máx 1 sem Listas).");
        return null;
    }

    // -------------------------------------------------------
    //                      GETTERS/SETTERS
    // -------------------------------------------------------

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

    // -------------------------------------------------------
    //               REPRESENTAÇÃO EM STRING
    // -------------------------------------------------------

    
    //   Representação simples da consulta,
    //   útil para impressões e listagens.
     
    @Override
    public String toString() {
        return "ID: " + id_consulta + 
               " | Paciente: " + paciente.getNome() + 
               " | Data: " + data + 
               " | Status: " + status;
    }
}
