
import java.util.ArrayList;
import java.util.List;

public class GestorDeTareas {

    private List<Tarea> tareas = new ArrayList<>();

    public void anadirTarea(String descripcion) {
        if (descripcion == null || descripcion.isBlank()) {
            System.out.println("La descripción de la tarea no puede estar vacía.");
            return;
        }
        Tarea nueva = new Tarea(descripcion);
        tareas.add(nueva);
        System.out.println("Tarea añadida: " + descripcion);
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas para mostrar.");
        } else {
            System.out.println("\n Lista de tareas:");
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
        }
    }

}

