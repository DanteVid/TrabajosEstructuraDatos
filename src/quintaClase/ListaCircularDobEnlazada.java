package quintaClase;

import cuartaClase.Nodo;

public class ListaCircularDobEnlazada {
    private Nodo cab;
    private Nodo cola;
    
    public void agregarNodo(int num) {
        Nodo nuevo = new Nodo(num);
        if (cab == null) {
            cab = nuevo;
            cola = nuevo;
            cab.setSgte(cab);
            cab.setPrev(cab);
        } else {
            cola.setSgte(nuevo);
            cab.setPrev(nuevo);
            cola = nuevo;
            cola.setSgte(cab);
        }
    }

}
