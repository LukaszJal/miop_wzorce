package com.bartoszwalter.students.bank;

// Command

public class Wplata implements OperacjaBankowa{

    int kwota;
    int saldo;

    public Wplata(int kwota, int saldo) {
        this.kwota = kwota;
        this.saldo = saldo;
    }

    @Override
    public void execute() {

        saldo += kwota;

    }
}
