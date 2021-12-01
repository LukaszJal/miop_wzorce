package com.bartoszwalter.students.bank;

public class Starter {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Rachunek rachKowalski = bank.zalozRachunek("1", "Jan", "Kowalski");
        Rachunek rachNowak = bank.zalozRachunek("2", "Jacek", "Nowak");


        rachKowalski.wplata(1500);
        OperacjaBankowa wplata1 = new Wplata(2000, rachNowak).execute();
        int odsetkiKowalski = rachKowalski.odsetki();

        System.out.println("odsetki=" + odsetkiKowalski);
        rachKowalski.piszHistorie();
        rachNowak.piszHistorie();
    }
}
