package primeraClase;

import java.util.Objects;

public class GestorTareas {
    private Tarea cab;


    public void anadirTarea(Tarea nuevaTarea) {
        if (cab == null) {
            cab = nuevaTarea;
        } else if (buscarTarea(nuevaTarea.getDescripcionTarea())){
            System.out.println("Ya está en la lista, intenta con otro");
            //Verificar si está o no, si ya está, tira el mensaje de error y no hace nada
        } else {
            Tarea rec = cab;
            //Recorre la lista hasta el último elemento
            while(rec.getSgte()!=null){
                rec = rec.getSgte();
            }
            rec.setSgte(nuevaTarea);
        }
    }

    public void printTareas() {
        if (cab == null) {
            System.out.println("¡La lista está vacía!");
            return;
        } else {
            Tarea rec = cab;
            //Imprime los elementos uno por uno
            while (rec != null) {
                System.out.println(rec);
                rec = rec.getSgte();
            }
        }
    }

    public void eliminarTarea(String descripcionTareaBuscada) {
        if (cab == null) {
            //Verificar que esté vacía
            System.out.println("¡La lista está vacía!");
        } else if (cab.getDescripcionTarea().equalsIgnoreCase(descripcionTareaBuscada)) {
            //Verificar si es el primer elemento para borrarlo adecuadamente
            cab = cab.getSgte();
            System.out.println("Tarea/nombre borrad@ con éxito");
        } else {
            Tarea rec = cab.getSgte();
            Tarea ant = cab;
            //Recorrer toda la lista para encontrar la tarea a borrar
            while (rec != null) {
                if (rec.getDescripcionTarea().equalsIgnoreCase(descripcionTareaBuscada)) {
                    //Eliminar el elemento de forma apropiada si es encontrado
                    ant.setSgte(rec.getSgte());
                    System.out.println("Tarea/nombre borrad@ con éxito");
                    return;
                }
                ant = rec;
                rec = rec.getSgte();
            }
            //Si no se encuentra en la lista, suelta un mensaje de error y no hace nada
            System.out.println("Tarea/nombre no está en la lista");
        }
    }

    public boolean buscarTarea(String descripcionTareaBuscada) {
        if (cab == null) {
            System.out.println("¡La lista está vacía!");
        } else {
            Tarea rec = cab;
            while (rec != null) {
                //Compara las tareas para ver si están o no
                if (rec.getDescripcionTarea().equalsIgnoreCase(descripcionTareaBuscada)) {
                    return true;
                }
                rec = rec.getSgte();
            }
        }
        return false;
    }
}
