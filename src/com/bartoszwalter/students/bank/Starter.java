package com.bartoszwalter.students.bank;

public class Starter {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Rachunek rachKowalski = bank.zalozRachunek("1", "Jan", "Kowalski");
        Rachunek rachNowak = bank.zalozRachunek("2", "Jacek", "Nowak");


        rachKowalski.wplata(1500);
        new Wplata(2000, rachNowak).execute(); // command
        new Wypłata(500,rachNowak).execute(); // command
        new Przelew(rachKowalski,rachNowak,300).execute();


        int odsetkiKowalski = rachKowalski.odsetki();

        System.out.println("odsetki=" + odsetkiKowalski);


        System.out.print("Historia Kowalski ");
        rachKowalski.piszHistorie();
        System.out.print("Historia Nowak ");
        rachNowak.piszHistorie();
    }
}
