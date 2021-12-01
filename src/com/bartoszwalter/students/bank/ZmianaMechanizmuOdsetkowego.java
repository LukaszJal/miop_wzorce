package com.bartoszwalter.students.bank;

public class ZmianaMechanizmuOdsetkowego implements OperacjaBankowa{

    int mechanizm_odsetkowy;
    Rachunek rachunek;

    public ZmianaMechanizmuOdsetkowego(int mechanizm_odsetkowy, Rachunek rachunek) {
        this.mechanizm_odsetkowy = mechanizm_odsetkowy;
        this.rachunek = rachunek;
    }




    @Override
    public OperacjaBankowa execute() {

        rachunek.zmienMechanizmOdsetkowy(mechanizm_odsetkowy);
        return null;
    }
}
