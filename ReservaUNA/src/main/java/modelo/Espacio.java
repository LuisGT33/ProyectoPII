package modelo;

public class Espacio extends Recurso {

    private int capacidad;
    private String ubicacion;
    private String tipo;

    // Constructor vacío
    public Espacio() {
    }

    // Constructor completo
    public Espacio(int id, String nombre, String descripcion, String estado,
                   int capacidad, String ubicacion, String tipo) {

        super(id, nombre, descripcion, estado);

        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
    }

    // Getters y Setters
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}