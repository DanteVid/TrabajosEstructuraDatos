package cuartaClase;

import primeraClase.Tarea;

public class Nodo {

    private String data;
    private char letra;
    private int numero;
    private Nodo sgte;
    private Nodo prev;

    public Nodo(int numero) {
        this.numero = numero;
    }

    public Nodo(int numero, Nodo sgte) {
        this.numero = numero;
        this.sgte = sgte;
    }

    public Nodo(String data, Nodo sgte) {
        this.data = data;
        this.sgte = sgte;
    }

    public Nodo(String data) {
        this.data = data;
    }

    public Nodo(char letra, Nodo sgte) {
        this.letra = letra;
        this.sgte = sgte;
    }

    public Nodo(char letra) {
        this.letra = letra;
    }

    public Nodo(int numero, Nodo sgte, Nodo prev) {
        this.numero = numero;
        this.sgte = sgte;
        this.prev = prev;
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

    public Nodo getPrev() {
        return prev;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public String toString() {
        return String.valueOf(numero);
    }
}

//Todo terminado
