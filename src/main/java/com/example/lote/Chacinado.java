package com.example.lote;

public class Chacinado extends Lote {

    private int diasEstacionamiento;
    private boolean esArtesanal;
    private String tipo;

    public Chacinado(String nombre, String socioProductor, int cantidad, String unidad, double precioBaseUnitario, int diasEstacionamiento, boolean esArtesanal, String tipo) {
        super(nombre, socioProductor, cantidad, unidad, precioBaseUnitario);
        this.diasEstacionamiento = diasEstacionamiento;
        this.esArtesanal = esArtesanal;
        this.tipo = tipo;
    }

    public Chacinado () {
    }

    public int getDiasEstacionamiento() {
        return diasEstacionamiento;
    }

    public void setDiasEstacionamiento(int diasEstacionamiento) {
        this.diasEstacionamiento = diasEstacionamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEsArtesanal() {
        return esArtesanal;
    }

    public void setEsArtesanal(boolean esArtesanal) {
        this.esArtesanal = esArtesanal;
    }

    @Override
    public double calcularValor () {
        double base = getCantidad() * getPrecioBaseUnitario();

        double recargo = diasEstacionamiento * 0.01;
        if (recargo > 0.30) {
            recargo = 0.30;
        }
        return base * (1 + recargo);
    }
}
