package com.example.tp2apirest.modelos;

import java.util.ArrayList;
import java.util.Arrays;

public class Parametro {
    private String[] campos = {"id","nombre"};

    public Parametro(String[] campos) {
        this.campos = campos;
    }

    public Parametro(){}

    public String[] getCampos() {
        return campos;
    }

    public void setCampos(String[] campos) {
        this.campos = campos;
    }

    @Override
    public String toString() {
        return "Parametro{" +
                "campos=" + Arrays.toString(campos) +
                '}';
    }
}
