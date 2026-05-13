package modelo;

import java.time.LocalDateTime;

public class Reserva {

    private int id;
    private Usuario usuario;
    private Recurso recurso;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private String estado;
    private String motivo;

    // Constructor vacío
    public Reserva() {
    }

    // Constructor completo
    public Reserva(int id, Usuario usuario, Recurso recurso,
                   LocalDateTime inicio, LocalDateTime fin,
                   String estado, String motivo) {

        this.id = id;
        this.usuario = usuario;
        this.recurso = recurso;
        this.inicio = inicio;
        this.fin = fin;
        this.estado = estado;
        this.motivo = motivo;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}