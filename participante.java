//Inscripción de Participantes: 
//Los participantes pueden registrarse en eventos disponibles 
//(Se debe respetar la capacidad máxima).



package evento;

public class Participante {
    private String nombre;
    private List<Evento> eventosInscritos;

    public Participante(String nombre) {
        this.nombre = nombre;
        this.eventosInscritos = new ArrayList<>();
    }

    public  Participante participante = new Participante();

    public String getNombre() {
        return nombre;
    }

    public void inscribirEnEvento(Evento evento) {
        if (evento.getParticipante() < evento.getCapacidadMaxima()) {
            evento.registrarParticipante();
            eventosInscritos.add(evento);
        } else {
            throw new IllegalStateException("No se puede inscribir; el evento está lleno.");
        }
    }

    public List<Evento> getEventosInscritos() {
        return eventosInscritos;
    }
}
