package primeraClase;

public class Tarea {
    private String descripcionTarea;
    private Tarea sgte;

    public Tarea(String descripcionTarea, Tarea sgte) {
        this.descripcionTarea = descripcionTarea;
        this.sgte = sgte;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public Tarea getSgte() {
        return sgte;
    }

    public void setSgte(Tarea sgte) {
        this.sgte = sgte;
    }

    public String toString(){
        //Modificar el metodo para que solo imprima el texto
        return descripcionTarea;
    }
}
