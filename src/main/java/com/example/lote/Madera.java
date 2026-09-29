package com.example.lote;

public class Madera extends Lote {

    private String especie;
    private double porcentajeMerma;
    private boolean esCertificada;

    public Madera(String nombre, String socioProductor, int cantidad, String unidad, double precioBaseUnitario, String especie, double porcentajeMerma, boolean esCertificada) {
        super(nombre, socioProductor, cantidad, unidad, precioBaseUnitario);
        this.especie = especie;
        this.porcentajeMerma = porcentajeMerma;
        this.esCertificada = esCertificada;
    }

    public Madera() {
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPorcentajeMerma() {
        return porcentajeMerma;
    }

    public void setPorcentajeMerma(double porcentajeMerma) {
        this.porcentajeMerma = porcentajeMerma;
    }

    public boolean isEsCertificada() {
        return esCertificada;
    }

    public void setEsCertificada(boolean esCertificada) {
        this.esCertificada = esCertificada;
    }

    @Override
    public double calcularValor() {
        double base = getCantidad() * getPrecioBaseUnitario();

        return base * (1 - porcentajeMerma / 100.0);
    }
}
