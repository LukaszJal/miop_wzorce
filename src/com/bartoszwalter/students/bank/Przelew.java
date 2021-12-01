package com.bartoszwalter.students.bank;

// Command

public class Przelew implements OperacjaBankowa{

    Rachunek rachunek_zlecajacy;
    Rachunek rachunek_odbierajacy;
    int kwota;
    boolean wykonano;

    public Przelew(Rachunek rachunek_odbierajacy, Rachunek rachunek_zlecajacy, int kwota) {

        this.rachunek_odbierajacy = rachunek_odbierajacy;
        this.rachunek_zlecajacy = rachunek_zlecajacy;
        wykonano = false;
    }

    @Override
    public OperacjaBankowa execute() {

        return null;
    }
}
