import java.util.ArrayList;
import java.util.List;

public class GestorDeTareas {

    private List<Tarea> tareas = new ArrayList<>();

    public void añadirTarea(String descripcion) {
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

}
