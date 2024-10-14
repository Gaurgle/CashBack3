package ChangeBack3;

public class Transaktion {

    double cash;
    double price;

    public Transaktion(double price, double cash) {
        this.cash = cash;
        this.price = price;

    }

    public double changeBack(){
        return cash - price;
    }
}