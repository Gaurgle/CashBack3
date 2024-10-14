package ChangeBack3;

public class ChangeBack3 {

    double cash;
    double price;

    public ChangeBack3(double price, double cash) {
        this.cash = cash;
        this.price = price;

    }

    public double changeBack(){
        return cash - price;
    }



}
