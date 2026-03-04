/**
 * <p>
 * Esta clase proporciona métodos de acceso (getters y setters)
 * para consultar y modificar sus atributos.
 * </p>
 *
 * @author Kacper Jasinski
 * @author Saul Hernandez Gonzalez
 * @version 1.0
 * @since 2026
 */
public class Tarea {

    /**
     * Atributo para la descripcion de la tarea.
     */
    private String descripcion;

    /**
     * Indica si la tarea ha sido completada.
     * {@code true} si está completada, {@code false} si no lo está.
     */
    private boolean completada;

    /**
     * Construye una nueva tarea con una descripción .
     * <p>
     * Por defecto la tarea se crea como no completada.
     * </p>
     *
     * @param descripcion Descripcion de la tarea.
     */
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    /***
     * @return La descripción actual de la tarea.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion Nueva descripción que se asignará a la tarea.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @return {@code true} si la tarea está completada;
     *         {@code false} en caso contrario.
     */
    public boolean isCompletada() {
        return completada;
    }

    /**
     *
     * @param completada {@code true} para marcar la tarea como completada;
     *                   {@code false} para marcarla como pendiente.
     */
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    /**
     *
     * @return Muestra el estado de la tarea, con su descripcion.
     */
    @Override
    public String toString() {
        return "[" + (completada ? "Completada" : " ") + "] " + descripcion;
    }
}