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