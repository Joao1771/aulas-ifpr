package odontologia;

public class Main {
    
    public static void main(String[] args) {
        
        // 1. Inicializar o Sistema e Entidades
        Sistema sistema = new Sistema();
        
        // Nota: A simulação de CPF sem bibliotecas é feita dentro da classe Pessoa/Dentista/Paciente.
        Dentista dentistaA = new Dentista("Dra. Ana Silva", 8500.00, "CRO/SP 12345");
        dentistaA.setCpf(dentistaA.gerarCpf()); // Atribui um CPF
        
        Paciente paciente1 = new Paciente(101, "Carlos Mendes", "111.222.333-44");
        Paciente paciente2 = new Paciente(102, "Mariana Luz", "555.666.777-88");
        
        Horario h8 = new Horario("08:00");
        Horario h9 = new Horario("09:00");
        Horario h10 = new Horario("10:00");
        Horario h16 = new Horario("16:00");
        
        System.out.println("\n--- Agenda Inicial ---");
        System.out.println(sistema.getAgendaGlobal().getHorarios());
        
        // 2. Criar Consultas (Agendamento)
        // O Sistema armazena nas suas 3 slots fixas (c1, c2, c3)
        Consulta c1 = sistema.criarConsulta(paciente1, dentistaA, "2024-11-15", h8);
        Consulta c2 = sistema.criarConsulta(paciente2, dentistaA, "2024-11-15", h9);
        Consulta c3 = sistema.criarConsulta(paciente2, dentistaA, "2024-11-16", h10);
        
        // Tenta criar a Quarta Consulta (deve falhar por limite fixo)
        System.out.println("\n--- Tentando Criar a Quarta Consulta ---");
        sistema.criarConsulta(paciente1, dentistaA, "2024-11-16", h8); 
        
        // 3. Listar e Consultar
        sistema.listarConsulta();
        
        // Buscar Consulta 1
        System.out.println("\n--- Busca Simples (Consulta 1) ---");
        Consulta busca = sistema.consultar(paciente1, null, "2024-11-15", h8);
        if (busca != null) {
            System.out.println("Consulta encontrada: " + busca.toString());
        } else {
            System.out.println("Consulta não encontrada.");
        }
        
        // 4. Adicionar Acompanhamento (simulado com máximo de 1)
        if (c1 != null) {
            System.out.println("\n--- Adicionar Acompanhamento (Máx 1) ---");
            Acompanhamento a1 = c1.addAcompanhamento("2024-11-20", h16, dentistaA, paciente1);
            if (a1 != null) {
                System.out.println("Acompanhamento adicionado. Status: " + a1.marcarConsulta());
                
                // Tenta adicionar outro (deve falhar pela restrição)
                c1.addAcompanhamento("2024-11-21", h16, dentistaA, paciente1);
            }
        }

        // 5. Simular Pagamento
        if (c2 != null) {
            System.out.println("\n--- Realizar Pagamento ---");
            String recibo = sistema.pagamento(300.00, c2, "Pix");
            System.out.println(recibo);
        }
        
        // 6. Agenda Final
        System.out.println("\n--- Agenda Final ---");
        System.out.println(sistema.getAgendaGlobal().getHorarios());
    }
}