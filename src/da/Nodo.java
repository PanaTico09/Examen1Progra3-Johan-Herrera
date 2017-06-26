package da;

public class Nodo {
    private Jugador datos;
    private Nodo anterior;
    private Nodo siguiente;

    public Nodo(Jugador datos) {
        this.datos = datos;
        this.anterior = null;
        this.siguiente = null;
    }

    public Jugador getDatos() {
        return datos;
    }

    public void setDatos(Jugador datos) {
        this.datos = datos;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
