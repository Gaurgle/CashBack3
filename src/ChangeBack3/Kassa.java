package ChangeBack3;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Kassa {

        // LinkedHashMap håller ordningen densamma.
        protected static LinkedHashMap<String, Integer> kassa = new LinkedHashMap<>(){{
            put("1000", 5);
            put("500", 7);
            put("200", 9);
            put("100", 10);
            put("50", 11);
            put("20", 12);
            put("10", 13);
            put("5", 14);
            put("2", 15);
            put("1", 16);
        }};

    public void showKassa() {
        for (String key : kassa.keySet()) {
            System.out.println(kassa.get(key));

        }

    }

}
