package com.bartoszwalter.students.bank;

// Command

public class Wplata2 implements OperacjaBankowa{

    int kwota;
    Rachunek rachunek;
    boolean wykonano;

    public Wplata2(int kwota, Rachunek rachunek) {
        this.kwota = kwota;
        this.rachunek = rachunek;
        this.wykonano = false;
    }

    @Override
    public void execute() {

        // Tutaj trzeba dodać do salda kwotę. Ale jak gdy pole saldo jest prywatne?
        // Brak metody modyfikującej saldo. Dodać ją ??

    }
}
