package primeraClase;

public class GestorTareas {
    private Tarea cab;



    public void anadirTarea(Tarea nuevaTarea) {
        if (cab == null) {
            cab = nuevaTarea;
            return;
        } else {
            //Recorrer la lista para verificar si está o no la tarea/nombre
            Tarea rec = cab;
            while (rec.getSgte() != null){
                if (rec.getDescripcionTarea().equalsIgnoreCase(nuevaTarea.getDescripcionTarea())){
                    System.out.println("¡La tarea ya está en la lista!");
                    return;
                }
                rec = rec.getSgte();
            }
        }
    }

    public void printTareas(){
        if (cab == null) {
            System.out.println("¡La lista está vacía!");
            return;
        }else {
            Tarea rec = cab;
            while (rec != null){
                System.out.println(rec);
                rec = rec.getSgte();
            }
        }
    }
}
