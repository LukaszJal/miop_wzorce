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

        saldo += kwota;

    }
}
