package cuartaClase;

import primeraClase.Tarea;

public class Nodo {
    private int numero;
    private Nodo sgte;

    public Nodo(int numero, Nodo sgte) {
        this.numero = numero;
        this.sgte = sgte;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }

    public String toString(){
        return String.valueOf(numero);
    }
}
