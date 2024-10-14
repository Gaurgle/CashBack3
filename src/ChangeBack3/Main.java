package ChangeBack3;

import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;

public class Main {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> dagensKassa = new LinkedHashMap<>();
        dagensKassa.put("1000", 5);
        dagensKassa.put("500", 9);
        dagensKassa.put("200", 11);
        dagensKassa.put("100", 18);
        dagensKassa.put("50", 21);
        dagensKassa.put("20", 40);
        dagensKassa.put("10", 34);
        dagensKassa.put("5", 50);
        dagensKassa.put("2", 41);
        dagensKassa.put("1", 94);


        Kassa kassa = new Kassa(dagensKassa);
//        kassa.showKassa();
        kassa.addMoney("500", 30);


        String indata = showInputDialog("Ange pris & betalmedel (ex: 99 100)");
        Scanner sc = new Scanner(indata);
        double price = sc.nextInt();
        double cash = sc.nextInt();

        Transaktion köp1 = new Transaktion(price, cash);

        try {
            LinkedHashMap<String, Integer> växel = köp1.växelTillbaka(cash, price, dagensKassa);
            kassa.showKassa();
            System.out.println("\nVäxel tillbaka:");
            System.out.printf("%-10s %-10s%n", "Valör", "Antal");
            System.out.println("----------------");
            for (String valör : växel.keySet()) {
                int antal = växel.get(valör);
                System.out.printf("%-10s %-3d st%n", valör +"kr", +växel.get(valör));
                kassa.removeMoney(valör, antal);
            }
            System.out.println();

            kassa.showKassa();
        } catch (ChangeBackException e) {
            e.printStackTrace();
            System.out.println("Fel " + e.getMessage());
        }
    }
}
