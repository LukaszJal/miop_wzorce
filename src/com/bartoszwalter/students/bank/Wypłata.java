package com.bartoszwalter.students.bank;

// Command

public class Wypłata implements OperacjaBankowa{

    int kwota;
    int saldo;
    boolean wykonano;

    public Wypłata(int kwota, int saldo) {
        this.kwota = kwota;
        this.saldo = saldo;
    }

    @Override
    public void execute() {

        saldo -= kwota;

    }
}
