package com.example.lote;

public class Lote {

    private String nombre;
    private String socioProductor;
    private int cantidad;
    private String unidad;
    private double precioBaseUnitario;

    public Lote (String nombre, String socioProductor, int cantidad, String unidad, double precioBaseUnitario){
        this.nombre = nombre;
        this.socioProductor = socioProductor;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.precioBaseUnitario = precioBaseUnitario;
    }

    public Lote(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0){
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        this.cantidad = cantidad;
    }

    public String getSocioProductor() {
        return socioProductor;
    }

    public void setSocioProductor(String socioProductor) {
        if (socioProductor == null || socioProductor.isEmpty()){
            throw new IllegalArgumentException("El socio productor no puede estar vacio.");
        }
        this.socioProductor = socioProductor;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        if (unidad == null || unidad.isEmpty()){
            throw new IllegalArgumentException("La unidad no puede estar vacia.");
        }
        this.unidad = unidad;
    }

    public double getPrecioBaseUnitario() {
        return precioBaseUnitario;
    }

    public void setPrecioBaseUnitario(double precioBaseUnitario) {
        if (precioBaseUnitario < 0){
            throw new IllegalArgumentException("El precio unitario no puede estar vacio.");
        }
        this.precioBaseUnitario = precioBaseUnitario;
    }

    public double calcularValor () {
        double valor = cantidad * precioBaseUnitario;
        return valor;
    }
}
