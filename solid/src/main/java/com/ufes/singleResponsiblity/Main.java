package com.ufes.singleResponsiblity;

import com.ufes.singleResponsiblity.entity.Lampada;
import com.ufes.singleResponsiblity.lampada.desligar.Desligar;
import com.ufes.singleResponsiblity.lampada.desligar.DesligarImpl;
import com.ufes.singleResponsiblity.lampada.ligar.Ligar;
import com.ufes.singleResponsiblity.lampada.ligar.LigarImpl;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        Desligar desligar = new DesligarImpl(Optional.ofNullable(lampada).get());
        Ligar ligar = new LigarImpl(Optional.ofNullable(lampada).get());

        ligar.execute();

        System.out.println(lampada.isLigada());
    }
}
