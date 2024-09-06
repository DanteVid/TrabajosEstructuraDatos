package quintaClase;

import cuartaClase.ListaEnlazada;
import cuartaClase.Nodo;


public class ListaDoblementeEnlazada {
    private Nodo cab;
    private Nodo cola;

    public void agregarComienzo(int data){
        Nodo nuevo = new Nodo(data,null, null);
        if (cab == null){
            cab = nuevo;
            cola = nuevo;
        } else {
            nuevo.setSgte(cab);
            cab.setPrev(nuevo);
            cab = nuevo;
        }
    }

    public void agregarFinal(int data){
        Nodo nuevo = new Nodo(data,null, null);
        if (cab == null){
            cab = nuevo;
            cola = nuevo;
        } else {
            cola.setSgte(nuevo);
            nuevo.setPrev(cola);
            cola = nuevo;
        }
    }

    public void eliminarNodo(int num){
        Nodo rec = cab;
        while (rec != null){
            if (rec.getNumero() == num) {
                if (rec.getPrev() != null) {
                    rec.getPrev().setSgte(rec.getSgte());
                } else {
                    cab = rec.getSgte();
                }
                if (rec.getSgte() != null) {
                    rec.getSgte().setPrev(rec.getPrev());
                } else {
                    cola = rec.getPrev();
                }
                rec.setSgte(null);
                rec.setPrev(null);
                return;
            }
            rec = rec.getSgte();
        }
    }

    public void imprimirReversa(){
        Nodo rec = cola;
        while (rec != null){
            System.out.println(rec);
            rec = rec.getPrev();
        }
        System.out.println();
    }
}
