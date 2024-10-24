package com.ufes.singleResponsiblity.lampada.desligar;

import com.ufes.singleResponsiblity.entity.Lampada;

public class DesligarImpl implements Desligar {

    private Lampada lampada;

    public DesligarImpl(Lampada lampada) {
        this.lampada = lampada;
    }

    @Override
    public void execute() {
        this.lampada.desligar();
    }
}
