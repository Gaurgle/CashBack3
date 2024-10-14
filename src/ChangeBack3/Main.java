package ChangeBack3;

import java.util.LinkedHashMap;

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


        Kassa kassa = new Kassa(dagensKassa) {
            @Override
            public void addMoney(String valör, Integer antal) {
                super.addMoney(valör, antal);
            }
            @Override
            public void removeMoney(String valör, Integer antal) {
                super.removeMoney(valör, antal);
            }
            @Override
            public void showKassa() {
                super.showKassa();
            }
        };

    }
}
