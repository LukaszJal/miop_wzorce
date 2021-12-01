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
        this.kwota = kwota;

        wykonano = false;
    }

    @Override
    public OperacjaBankowa execute() {

        if(rachunek_zlecajacy.saldo() >= kwota )
        {
            rachunek_zlecajacy.wyplata(kwota);
            rachunek_odbierajacy.wplata(kwota);
            wykonano = true;
        }
        else wykonano = false;
        return null;
    }
}
