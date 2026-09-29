package com.example.lote;

public class Leche extends Lote {
    private double porcetajeGrasa;
    private boolean esRefrigerada;
    private String cuenca;

    public Leche(String nombre, String socioProductor, int cantidad, String unidad, double precioBaseUnitario, double porcetajeGrasa, boolean esRefrigerada, String cuenta) {
        super(nombre, socioProductor, cantidad, unidad, precioBaseUnitario);
        this.porcetajeGrasa = porcetajeGrasa;
        this.esRefrigerada = esRefrigerada;
        this.cuenca = cuenca;
    }

    public Leche () {
    }

    public double getPorcetajeGrasa() {
        return porcetajeGrasa;
    }

    public void setPorcetajeGrasa(double porcetajeGrasa) {
        this.porcetajeGrasa = porcetajeGrasa;
    }

    public boolean isEsRefrigerada() {
        return esRefrigerada;
    }

    public void setEsRefrigerada(boolean esRefrigerada) {
        this.esRefrigerada = esRefrigerada;
    }

    public String getCuenca() {
        return cuenca;
    }

    public void setCuenca(String cuenca) {
        this.cuenca = cuenca;
    }

    @Override
    public double calcularValor () {

        double base = getCantidad() * getPrecioBaseUnitario();

        if (porcetajeGrasa >= 3.5){

            return base * 1.10;
        }
        return base;
    }
}
