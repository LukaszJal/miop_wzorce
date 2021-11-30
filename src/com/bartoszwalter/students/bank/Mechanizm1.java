package com.bartoszwalter.students.bank;

public class Mechanizm1 implements MechanizmOdsetkowy{
    @Override
    public int oblicz(Rachunek rach) {

        if(rach.saldo()<1000)
         {
             return (int) (rach.saldo() * 0.03);
         }
         else if (rach.saldo()>1000 && rach.saldo()<2000)
         {
             return (int) (rach.saldo() * 0.04);
         }
         else if (rach.saldo()>2000)
         {
             return (int) (rach.saldo() * 0.05);
         }
        return 0;
    }
}
