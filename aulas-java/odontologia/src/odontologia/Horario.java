package odontologia;

public class Horario {
    private String hora; 

    public Horario(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return this.hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return this.hora;
    }
}