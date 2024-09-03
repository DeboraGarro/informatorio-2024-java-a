import java.time.LocalDate;
import java.util.List;

import evento.Evento;
import evento.Participante;

public class Main {

    public static void main(String[] args) {
        SistemaEventos sistema = new SistemaEventos();

        Evento nuevoEvento = New Evento();
        
        
        // Crear chef
        Chef chef = new Chef("Chef Martin");
        evento.asignarChef(chef);

        // Agregar eventos al sistema
        sistema.agregarEvento(evento);
       

        // Listar eventos disponibles
        List<Evento> eventosDisponibles = sistema.listarEventosDisponibles(LocalDate.of(2024, 9, 15));
        for (Evento evento : eventosDisponibles) {
            System.out.println("Evento disponible: " + evento.getNombre());
        }

        // Exportar eventos no disponibles
        ExportadorEventos.exportarEventosNoDisponibles(sistema.listarEventosDisponibles(LocalDate.of(2024, 9, 15)), LocalDate.of(2024, 9, 15), "eventos_no_disponibles.csv");
    }
}


        do {
            System.out.println("Elija una Opcion: ");
            System.out.println("1. Agregar evento: ");
            System.out.println("2. Agragar chef:  ");
            System.out.println("3. Asignar chef ");
            System.out.println("4. nuevo participante: ");
            System.out.println("5. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine(); 


            switch (opcion) {
                case 1: //crear evento
                Evento nuevoEvento = New nuevoEvento();
                    break;
            
                case 2: // agregar chef
                Chef chef1 = new Chef
                    break;
                case 3: //asignar chef
                evento1.asignarChef(chef1);
                    break;
                case 4: // Nuevo participante 
                Participante participante = new Participante();
                    break;
                    case 5: // salir
                    break;
                    default: 
                    break; 
            }
     }while (opcion !=4); 

     scanner.close();
    }

}


