<<<<<<< HEAD
public class GestorDeTareas {

    public void mostrarTareas(){
        if(contador == 0){
            System.out.println("No hay tareas para mostrar.");
        } else {
            System.out.println("\n Lista de tareas:");
            for(int i = 0; i < contador; i++){
                System.out.println((i + 1) + ". " + tareas[i]);
            }
        }
    }
}
=======
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
>>>>>>> 4cc4005e5e23d3819a67dabae407cb2dbf684f8d
