package da;

public class Jugador {

    private int edad;
    private String nombre;
    private String seleccion;
    private String posicion;
    private String marca;
    private boolean convocados; //True = Titular - False = Suplente

    public Jugador(int edad, String nombre, String seleccion, String posicion, boolean convocados) {
        this.edad = edad;
        this.nombre = nombre;
        this.seleccion = seleccion;
        this.posicion = posicion;
        this.convocados = convocados;  
    }
    public Jugador(int edad, String nombre, String seleccion, String posicion, boolean convocados, String marca) {
        this.edad = edad;
        this.nombre = nombre;
        this.seleccion = seleccion;
        this.posicion = posicion;
        this.convocados = convocados;
        this.marca = marca;
    }

    public boolean isConvocados() {
        return convocados;
    }

    public void setConvocados(boolean convocados) {
        this.convocados = convocados;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
