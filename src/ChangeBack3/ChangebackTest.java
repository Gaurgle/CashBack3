package ChangeBack3;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class ChangebackTest {

    @Test
    public void testChangeBack(){
        Transaktion transaction = new Transaktion(8.0, 10.0);

        assertEquals(2.0, transaction.changeBack());
        assertNotEquals(transaction.cash, transaction.price);
    }

    @Test
    public void showKassaTest(){
        LinkedHashMap<String, Integer> dagensKassa = new LinkedHashMap<>();
        Kassa kassaTest = new Kassa(dagensKassa);
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


        assertFalse(kassaTest.getKassa().isEmpty());

        System.out.printf("%-10s %-10s%n", "Valör:", "Antal:");
        System.out.println("-----------------");
        for (Map.Entry<String, Integer> valör : kassaTest.getKassa().entrySet()){
            System.out.printf("%-10s %-10s%n", valör.getKey(), valör.getValue());
        }
    }
}
