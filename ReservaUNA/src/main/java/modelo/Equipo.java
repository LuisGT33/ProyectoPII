package modelo;

public class Equipo extends Recurso {

    private String marca;
    private String modelo;
    private String serial;

    // Constructor vacío
    public Equipo() {
    }

    // Constructor completo
    public Equipo(int id, String nombre, String descripcion, String estado,
                  String marca, String modelo, String serial) {

        super(id, nombre, descripcion, estado);

        this.marca = marca;
        this.modelo = modelo;
        this.serial = serial;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}