package septimaClase;

public class Nodo {
    private char data;
    private Nodo izq;
    private Nodo der;

    public Nodo(char data) {
        this.data = data;
    }

    public Nodo(char data, Nodo izq, Nodo der) {
        this.data = data;
        this.izq = null;
        this.der = der;
    }



    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(char a) {
        this.izq = new Nodo(a);
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(char a) {
        this.der = new Nodo(a);
    }

    public String toString(){
        return String.valueOf(data);
    }
}
