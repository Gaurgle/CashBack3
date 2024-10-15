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

    // IJ föreslog compute, FP?
    public void removeMoney(String valör, Integer antal) {
        kassa.compute(valör, (_, oldValue) -> {
            if (oldValue == null || oldValue <= 0) {
                return 0;
            } else {
                return Math.max(oldValue - antal, 0);
            }
        });
    }

    public void showKassa() {
        System.out.println("Nuvarande kassa:");
        System.out.printf("%-10s %-10s%n", "Valör", "Antal");
        System.out.println("-----------------");
        for (Map.Entry<String, Integer> valör : kassa.entrySet()) {
            System.out.printf("%-10s %-3d st%n", valör.getKey() +"kr", valör.getValue());
        }
    }
    public LinkedHashMap<String, Integer> getKassa() {
        return kassa;
    }
}
