import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int opcion;

    static void main() {
        GestorDeTareas gestor = new GestorDeTareas();
        do {
            mostrarMenu();
            switch (opcion) {
                case 1:
<<<<<<< HEAD

                    break;
                case 2:
                    gestor.mostrarTareas();
=======
                    System.out.print("Introduce la descripción de la tarea: ");
                    String descripcion = sc.nextLine();
                    gestor.añadirTarea(descripcion);
                    break;
                case 2:

>>>>>>> 4cc4005e5e23d3819a67dabae407cb2dbf684f8d
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);

    }
    public static void mostrarMenu(){

        System.out.println("\n--- Gestor de Tareas ---");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Listar tareas");
        System.out.println("3. Salir");
        System.out.println("Seleccione una opción: ");
        opcion = sc.nextInt();
    }
}