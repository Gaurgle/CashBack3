package ChangeBack3;

import java.util.LinkedHashMap;

public class Transaktion {

    public double cash;
    public double price;

    public Transaktion(double price, double cash) {
        this.cash = cash;
        this.price = price;
    }

    // behövs ej
    public double changeBack(){
        return cash - price;
    }

    public LinkedHashMap<String, Integer> växelTillbaka(
            double cash, double price, LinkedHashMap<String, Integer> valörer) throws ChangeBackException {
        double change = cash - price;
        LinkedHashMap<String, Integer> växel = new LinkedHashMap<>();

        if (change < 0) {
            throw new ChangeBackException("Växeln kan inte vara mindre än noll");
        } else if (change == 0) {
            throw new ChangeBackException("Växeln är 0 kr");
        }

        for (String valör : valörer.keySet()) {
            int valörBelopp = Integer.parseInt((valör));
            int antal = (int) (change / valörBelopp);
            if (antal > 0 ) {
                växel.put(valör, antal);
                change -= antal * valörBelopp;
            }
        }
        return växel;
    }


}