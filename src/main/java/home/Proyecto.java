package home;

import java.io.Serializable;

public class Proyecto implements Serializable {
    private String nombre;
    private String responsable;
    private String fechaInicio;
    private String fechaFin;
    private String estado;

    // Constructor por defecto
    public Proyecto() {
    }

    // Constructor con parámetros
    public Proyecto(String nombre, String responsable, String fechaInicio, String fechaFin, String estado) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getResponsable() { return responsable; }
    public void setResponsable(String responsable) { this.responsable = responsable; }
    public String getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }
    public String getFechaFin() { return fechaFin; }
    public void setFechaFin(String fechaFin) { this.fechaFin = fechaFin; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
