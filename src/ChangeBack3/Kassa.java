package ChangeBack3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Kassa {

    // LinkedHashMap håller ordningen densamma.
    private LinkedHashMap<String, Integer> kassa;
    public Kassa(LinkedHashMap<String, Integer> kassa) {
        this.kassa = kassa;
    }

    public void addMoney(String valör, Integer antal){
        kassa.put(valör, kassa.getOrDefault(valör, 0)+antal);
    }

    public void removeMoney(String valör, Integer antal){
        if (kassa.containsKey(valör)){
            int nuvarandeKassa = kassa.get(valör);
            kassa.put(valör, Math.max(nuvarandeKassa - antal, 0));
        }
    }

    public void showKassa() {
        System.out.printf("%-10s %-10s%n", "Valör:", "Antal:");
        System.out.println("-----------------");
        for (Map.Entry<String, Integer> valör : kassa.entrySet()) {
            System.out.printf("%-10s %-10d%n", valör.getKey(), valör.getValue());

        }

    }
    public LinkedHashMap<String, Integer> getKassa() {
        return kassa;
    }
}
