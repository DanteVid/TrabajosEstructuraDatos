package sextaClase;
import cuartaClase.Nodo;
public class Pila {
    private Nodo top;
    private Nodo bottom;

    public Nodo getTop() {
        return top;
    }

    public void setTop(Nodo top) {
        this.top = top;
    }

    public void push(char a){
        Nodo nuevo = new Nodo(a);
        if (top == null){
            top = nuevo;
            bottom = nuevo;
        }else {
            nuevo.setSgte(top);
            top = nuevo;
        }
    }

    public void push(String a){
        Nodo nuevo = new Nodo(a);
        if (top == null){
            top = nuevo;
            bottom = nuevo;
        }else {
            nuevo.setSgte(top);
            top = nuevo;
        }
    }

    public void pop(){
        if (top == null){
            System.out.println("Pila vacía, está mal la expresión");
            System.exit(0);
        }else {
            top = top.getSgte();
        }
    }

    public Nodo peek(){
        return top;
    }
}
