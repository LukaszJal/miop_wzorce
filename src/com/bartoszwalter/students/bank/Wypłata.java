package com.bartoszwalter.students.bank;

// Command

public class Wypłata implements OperacjaBankowa{

    int kwota;
    Rachunek rachunek;
    boolean wykonano;

    public Wypłata(int kwota, Rachunek rachunek) {
        this.kwota = kwota;
        this.rachunek = rachunek;

        wykonano = false;
    }

    @Override
    public OperacjaBankowa execute() {

        if(rachunek.wyplata(kwota)==0) wykonano=true;
        else wykonano = false;

        return null;
    }
}
