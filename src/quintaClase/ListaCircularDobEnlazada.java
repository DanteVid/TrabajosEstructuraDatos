package quintaClase;

import cuartaClase.Nodo;

public class ListaCircularDobEnlazada {
    private Nodo cab;
    private Nodo cola;
    
    public void agregarNodo(int num) {
        Nodo nuevo = new Nodo(num);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cabeza.setSgte(cabeza);
            cabeza.setPrev(cabeza);
        } else {
            cola.setSgte(nuevoNodo);
            cabeza.setPrev(nuevoNodo);
            cola = nuevoNodo;
            cola.setSgte(cabeza);
        }
    }

}
