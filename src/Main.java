import java.util.Scanner;

/**
 * Clase principal para la aplicacion de gestión de tareas.
 * <p>
 * Contiene el método {@code main},
 * Gestiona la interacción del usuario con un menú.
 * </p>
 *
 * <p>
 * En esta clase se puede:
 * <ul>
 *     <li>Agregar nuevas tareas</li>
 *     <li>Listar tareas existentes</li>
 *     <li>Salir del programa</li>
 * </ul>
 * </p>
 *
 * La clase utiliza un objeto {@link GestorDeTareas} para porder usar
 * la gestión de tareas.
 *
 * @author Kacper Jasinski
 * @author Saul Hernandez Gonzalez
 * @version 1.0
 * @since 2026
 */
public class Main {

    /**
     * Objeto {@link Scanner} utilizado para leer la entrada del usuario
     * desde la consola.
     */
    static Scanner sc = new Scanner(System.in);

    /**
     * Método principal que inicia el programa.
     * <p>
     * Implementa un bucle {@code do-while} que muestra un menú
     * hasta que el usuario selecciona la opción de salida.
     * </p>
     *
     */
    public static void main(String[] args) {

        GestorDeTareas gestor = new GestorDeTareas();
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Limpia el buffer tras leer un entero

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la descripción de la tarea: ");
                    String descripcion = sc.nextLine();
                    gestor.anadirTarea(descripcion);
                    break;

                case 2:
                    gestor.mostrarTareas();
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 3);

        sc.close();
    }

    /**
     * Muestra  el menú para el usuario.
     */
    public static void mostrarMenu() {
        System.out.println("\n--- Gestor de Tareas ---");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Listar tareas");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }
}