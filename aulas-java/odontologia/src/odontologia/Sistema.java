package odontologia;

public class Sistema {
    
    // Armazenamento fixo de consultas
    private Consulta consulta1;
    private Consulta consulta2;
    private Consulta consulta3;
    
    private final Agenda agendaGlobal = new Agenda();
    private int proximoIdConsulta = 1;

    // Construtor
    public Sistema() {
        System.out.println("Sistema da Clínica Odontológica inicializado.");
    }
    
    // Métodos
    public Consulta criarConsulta(Paciente paciente, Dentista dentista, String data, Horario horario) {
        
        int horaInt = Integer.parseInt(horario.getHora().substring(0, 2));

        // 1. Verificar disponibilidade na agenda
        if (!agendaGlobal.verifHorario(horaInt)) {
            System.out.println("ERRO: Horário " + horario.getHora() + " indisponível.");
            return null;
        }

        Consulta novaConsulta = new Consulta(proximoIdConsulta, paciente, dentista, data, horario, "Checagem geral");
        
        // 2. Tenta armazenar nos slots fixos
        if (this.consulta1 == null) {
            this.consulta1 = novaConsulta;
        } else if (this.consulta2 == null) {
            this.consulta2 = novaConsulta;
        } else if (this.consulta3 == null) {
            this.consulta3 = novaConsulta;
        } else {
            System.out.println("ERRO: Capacidade máxima de consultas (3) atingida.");
            return null;
        }
        
        // 3. Atualizar estados
        proximoIdConsulta++;
        agendaGlobal.setHorarios(horaInt, false); // Ocupar horário
        System.out.println("SUCESSO: Consulta criada. ID: " + novaConsulta.getId_consulta());
        return novaConsulta;
    }

    public void listarConsulta() {
        System.out.println("\n--- Lista de Consultas (Máx 3) ---");
        if (consulta1 != null) System.out.println(consulta1);
        if (consulta2 != null) System.out.println(consulta2);
        if (consulta3 != null) System.out.println(consulta3);
        
        if (consulta1 == null && consulta2 == null && consulta3 == null) {
            System.out.println("Nenhuma consulta registrada.");
        }
        System.out.println("----------------------------------");
    }

    // Busca simplificada (retorna apenas a primeira que corresponde, ou null)
    public Consulta consultar(Paciente paciente, Dentista dentista, String data, Horario horario) {
        
        Consulta[] consultasArray = {consulta1, consulta2, consulta3};

        for (int i = 0; i < 3; i++) {
            Consulta c = consultasArray[i];
            if (c != null) {
                boolean match = true;
                
                if (paciente != null && !c.getPaciente().equals(paciente)) match = false;
                if (dentista != null && !c.getDentista().equals(dentista)) match = false;
                if (data != null && !c.getData().equals(data)) match = false;
                if (horario != null && !c.getHorario().getHora().equals(horario.getHora())) match = false;
                
                if (match) return c;
            }
        }
        return null;
    }

    public Consulta realizarConsulta(Paciente p, Dentista d, Consulta c) {
        // Busca a consulta por referência
        if (c != null) {
            c.setDetalhes("Consulta finalizada com sucesso.");
            return c;
        }
        return null;
    }
    
    public String pagamento(double valor, Consulta consulta, String forma) {
        Pagamento p = new Pagamento(valor, consulta, forma);
        consulta.setPagamento(p);
        return "Pagamento efetuado. " + p.toString();
    }

    public Agenda agendamento(Agenda a) {
        return agendaGlobal;
    }
    
    public Agenda getAgendaGlobal() {
        return agendaGlobal;
    }
}