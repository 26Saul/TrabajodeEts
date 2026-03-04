import java.util.ArrayList;
import java.util.List;

/**
 * La clase {@code GestorDeTareas} gestiona una colección de objetos {@link Tarea}.
 * <p>
 * Permite añadir nuevas tareas, obtener la lista completa y mostrar
 * las tareas almacenadas en consola.
 * </p>
 *
 *
 * @author Kacper Jasinski
 * @author Saul Hernandez Gonzalez
 * @version 1.0
 */
public class GestorDeTareas {

    /**
     * Lista que almacena las tareas registradas en el sistema.
     */
    private List<Tarea> tareas = new ArrayList<>();

    /**
     * Añade una nueva tarea al gestor.
     * <p>
     * Si la descripción es {@code null} o está vacía, la tarea no se añadirá
     * y se mostrará un mensaje de advertencia en consola.
     * </p>
     *
     * @param descripcion Texto descriptivo de la tarea a añadir.
     */
    public void anadirTarea(String descripcion) {
        if (descripcion == null || descripcion.isBlank()) {
            System.out.println("La descripción de la tarea no puede estar vacía.");
            return;
        }

        Tarea nueva = new Tarea(descripcion);
        tareas.add(nueva);
        System.out.println("Tarea añadida: " + descripcion);
    }

    /**
     * Devuelve la lista completa de tareas almacenadas.
     *
     * @return Una lista de objetos {@link Tarea}.
     */
    public List<Tarea> getTareas() {
        return tareas;
    }

    /**
     * Muestra por consola todas las tareas almacenadas.
     * <p>
     * Si no existen tareas registradas, se informará al usuario
     * mediante un mensaje en consola.
     * </p>
     */
    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas para mostrar.");
        } else {
            System.out.println("\nLista de tareas:");
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
        }
    }
}
