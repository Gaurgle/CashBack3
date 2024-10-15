package ChangeBack3;

import java.util.LinkedHashMap;

public class Transaktion {

    public double cash;
    public double price;

    public Transaktion(double price, double cash) throws ChangeBackException {
        this.cash = cash;
        this.price = price;
    }

    public String changeBack() {
        return cash - price + "kr";
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
            int antalSomBehövs = (int) (change / valörBelopp);
            int antalTillgängliga = valörer.get(valör);

            if (antalTillgängliga > 0) {
                int antalAttGe = Math.min(antalSomBehövs, antalTillgängliga);

                if (antalAttGe > 0) {
                    växel.put(valör, antalAttGe);
                    change -= antalAttGe * valörBelopp;
                }
            }

            if (change == 0) {
                return växel;
            }
        }

        if (change > 0) {
            throw new ChangeBackException("vi har tyvärr inte så mycket växel att ge.");
        }

        return växel;
    }
}
