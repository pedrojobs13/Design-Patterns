package com.ufes.singleResponsiblity.entity;

public class Lampada {
    private Boolean ligada;

    public Boolean isLigada() {
        return this.ligada;
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }
}
