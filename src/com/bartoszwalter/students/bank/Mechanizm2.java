package com.bartoszwalter.students.bank;

public class Mechanizm2 implements MechanizmOdsetkowy{

    @Override
    public int oblicz(Rachunek rach) {


        if(rach.saldo()<1000)
        {
            return (int) (rach.saldo() * 0.06);
        }
        else if (rach.saldo()<1000 && rach.saldo()>2000)
        {
            return (int) (rach.saldo() * 0.07);
        }
        else if (rach.saldo()>2000)
        {
            return (int) (rach.saldo() * 0.08);
        }
        return 0;
    }
}
