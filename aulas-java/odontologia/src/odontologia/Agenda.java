package odontologia;

public class Agenda {

    // Armazena o último horário consultado
    private int hora;

    // Cada variável representa a disponibilidade daquele horário.
    // true = horário livre | false = ocupado
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

    // Construtor padrão: todos os horários já começam livres (true)
    public Agenda() { }

    // Construtor que permite configurar manualmente a disponibilidade
    public Agenda(boolean h8, boolean h9, boolean h10, boolean h11, boolean h12,
                  boolean h13, boolean h14, boolean h15, boolean h16,
                  boolean h17, boolean h18) {
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

       //hora: Horário (int entre 8 e 18).
       //hora1: true = marcar como livre | false = marcar como ocupado

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

    // Retorna a disponibilidade do horário armazenado em 'this.hora'
    public boolean getHorario(int hora) {
        return verifHorario(hora);
    }

    public String getHorarios() {
        String s = "Disponibilidade:\n";
        s += "8h: " + (hora8 ? "Livre" : "Ocupado") + "\n";
        s += "9h: " + (hora9 ? "Livre" : "Ocupado") + "\n";
        s += "10h: " + (hora10 ? "Livre" : "Ocupado") + "\n";
        s += "11h: " + (hora11 ? "Livre" : "Ocupado") + "\n";
        s += "12h: " + (hora12 ? "Livre" : "Ocupado") + "\n";
        s += "13h: " + (hora13 ? "Livre" : "Ocupado") + "\n";
        s += "14h: " + (hora14 ? "Livre" : "Ocupado") + "\n";
        s += "15h: " + (hora15 ? "Livre" : "Ocupado") + "\n";
        s += "16h: " + (hora16 ? "Livre" : "Ocupado") + "\n";
        s += "17h: " + (hora17 ? "Livre" : "Ocupado") + "\n";
        s += "18h: " + (hora18 ? "Livre" : "Ocupado") + "\n";
        return s;
    }

    //marca um horario como livre (true)
    public void adicionaHorario(int hora) {
        setHorarios(hora, true);
    }
    
    //marca um horario como ocupado (false)
    public boolean removeHorario(int hora) {
        this.setHorarios(hora, false);
        return true;
    }

    //Verifica diretamente a variável booleana correspondente ao horário.
    public boolean verifHorario(int hora) {

        if (hora == 8) return this.hora8;
        if (hora == 9) return this.hora9;
        if (hora == 10) return this.hora10;
        if (hora == 11) return this.hora11;
        if (hora == 12) return this.hora12;
        if (hora == 13) return this.hora13;
        if (hora == 14) return this.hora14;
        if (hora == 15) return this.hora15;
        if (hora == 16) return this.hora16;
        if (hora == 17) return this.hora17;
        if (hora == 18) return this.hora18;

        return false; // horário inválido
    }

    public int getHora() { return this.hora; }
    public void setHora(int hora) { this.hora = hora; }
}