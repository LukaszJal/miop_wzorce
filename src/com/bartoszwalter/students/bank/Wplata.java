package com.bartoszwalter.students.bank;

// Command

public class Wplata implements OperacjaBankowa{

    int kwota;
    Rachunek rachunek;
    boolean wykonano;

    public Wplata(int kwota, Rachunek rachunek) {
        this.kwota = kwota;
        this.rachunek = rachunek;
        this.wykonano = false;
    }

    @Override
    public OperacjaBankowa execute() {

        rachunek.wplata(kwota);
        wykonano = true;

        return null;
    }
}
