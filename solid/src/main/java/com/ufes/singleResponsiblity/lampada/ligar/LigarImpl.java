package com.ufes.singleResponsiblity.lampada.ligar;

import com.ufes.singleResponsiblity.entity.Lampada;

public class LigarImpl implements Ligar {

    private Lampada lampada;

    public LigarImpl(Lampada lampada) {
        this.lampada = lampada;
    }

    @Override
    public void execute() {
        this.lampada.ligar();
    }
}
