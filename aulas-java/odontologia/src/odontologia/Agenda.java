package odontologia;

public class Agenda {
    private int hora;
    private boolean hora8 = true;
    private boolean hora9 = true;
    private boolean hora10 = true;
    private boolean hora11 = true;
    private boolean hora12 = true;
    private boolean hora13 = true;
    private boolean hora14 = true;
    private boolean hora15 = true;
    private boolean hora16 = true;
    private boolean hora17 = true;
    private boolean hora18 = true;

    // Construtores
    public Agenda() {
        // Horários inicializados como disponíveis (true) acima
    }
    // Construtor com booleanas (simplificado para uma lógica básica)
    public Agenda(boolean h8, boolean h9, boolean h10, boolean h11, boolean h12, boolean h13, boolean h14, boolean h15, boolean h16, boolean h17, boolean h18) {
        this.hora8 = h8;
        this.hora9 = h9;
        this.hora10 = h10;
        this.hora11 = h11;
        this.hora12 = h12;
        this.hora13 = h13;
        this.hora14 = h14;
        this.hora15 = h15;
        this.hora16 = h16;
        this.hora17 = h17;
        this.hora18 = h18;
    }

    // Métodos (lógica de simulação)
    public boolean agendamento(boolean agendado) { return agendado; }

    public void setHorarios(int hora, boolean bool) {
        // Lógica de seleção do horário via 'if' encadeado
        if (hora == 8) this.hora8 = bool;
        else if (hora == 9) this.hora9 = bool;
        else if (hora == 10) this.hora10 = bool;
        else if (hora == 11) this.hora11 = bool;
        else if (hora == 12) this.hora12 = bool;
        else if (hora == 13) this.hora13 = bool;
        else if (hora == 14) this.hora14 = bool;
        else if (hora == 15) this.hora15 = bool;
        else if (hora == 16) this.hora16 = bool;
        else if (hora == 17) this.hora17 = bool;
        else if (hora == 18) this.hora18 = bool;
    }

    public boolean getHorario() {
        // Retorna a disponibilidade do horário armazenado em 'this.hora'
        return verifHorario(this.hora);
    }

    public String getHorarios() {
        // Retorna a representação de texto (sem List/StringBuilder)
        String s = "Disponibilidade:\n";
        s += "8h: " + (hora8 ? "Livre" : "Ocupado") + "\n";
        s += "9h: " + (hora9 ? "Livre" : "Ocupado") + "\n";
        s += "10h: " + (hora10 ? "Livre" : "Ocupado") + "\n";
        // ... (Todos os outros horários)
        s += "18h: " + (hora18 ? "Livre" : "Ocupado") + "\n";
        return s;
    }

    public void adicionaHorario() {
        // Lógica simplificada: tenta liberar o horário 8
        this.hora8 = true;
    }

    public boolean removeHorario(int hora) {
        // Remove um horário através de setHorarios
        this.setHorarios(hora, false);
        return true;
    }

    public boolean verifHorario(int hora) {
        // Verifica disponibilidade
        if (hora == 8) return this.hora8;
        if (hora == 9) return this.hora9;
        if (hora == 10) return this.hora10;
        // ... (outros ifs)
        if (hora == 18) return this.hora18;
        return false;
    }

    public int getHora() { return this.hora; }
    public void setHora(int hora) { this.hora = hora; }
}