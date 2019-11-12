package com.example.tp2apirest.modelos;

import java.util.ArrayList;

public class Resultado {
    private int cantidad;
    private int inicio;
    private Parametro parametros;
    private ArrayList<Provincia> provincias;
    private int total;

    public Resultado(int cantidad, int inicio, Parametro parametros, ArrayList<Provincia> provincias, int total) {
        this.cantidad = cantidad;
        this.inicio = inicio;
        this.parametros = parametros;
        this.provincias = provincias;
        this.total = total;
    }

    public Resultado(){}

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public Parametro getParametros() {
        return parametros;
    }

    public void setParametros(Parametro parametros) {
        this.parametros = parametros;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "cantidad=" + cantidad +
                ", inicio=" + inicio +
                ", parametros=" + parametros +
                ", provincias=" + provincias +
                ", total=" + total +
                '}';
    }
}
