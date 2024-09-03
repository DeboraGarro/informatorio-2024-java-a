// Creación de Eventos: Permitir a los organizadores crear y gestionar eventos culinarios.

//Reseñas de Eventos: Los participantes pueden dejar reseñas sobre los eventos a los que asistieron




package evento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evento  {
    private static final Evento New = null;
    private String nombre;
    private LocalDate fecha;
    private int capacidadMaxima;
    private int participante;
    private chef chef;
    private List<reseña> reseñas;
    private ArrayList reseña;

    public Evento nuevoEvento(){
        Evento nuevoEvento = New Evento();
        Scanner sc = new Scanner(System.in); 

      System.out.println("Agregar nuevo evento: ");
      String nuevoEvento = sc.nextLine(); 
      sc.nextLine();
    }

    public Evento(String nombre, LocalDate fecha, int capacidadMaxima) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.capacidadMaxima = capacidadMaxima;
        this.participante = 0;
        this.reseña = new ArrayList<>();

    
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getAsistentes() {
        return participante;
    }

    public void registrarAsistente() {
        if (participante < capacidadMaxima) {
            participante++;
        } else {
            throw new IllegalStateException("Capacidad máxima alcanzada.");
        }
    }

    public void agregarReseña(Reseña reseña) {
        reseña.add(reseña);
    }

    public List<Reseña> getReseñas() {
        List<Reseña> reseña;
        return reseña;
    }

    public void asignarChef(Chef chef) {
        this.chef = chef;
    }

    public Chef getChef() {
        return chef;
    }
}




