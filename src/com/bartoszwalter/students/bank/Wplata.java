package com.bartoszwalter.students.bank;

// Command

public class Wplata implements OperacjaBankowa{

    int kwota;
    int saldo;
    boolean wykonano;

    public Wplata(int kwota, int saldo) {
        this.kwota = kwota;
        this.saldo = saldo;
        this.wykonano = false;
    }

    @Override
    public void execute() {

        // Dodaję do lokalnego salda kwote. Ale co z nią dalej ?
        // execute nie zwraca żadnej wartości. W java brak wskaźników, tylko referencje.
        saldo += kwota;

    }
}
