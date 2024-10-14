package ChangeBack3;


import org.junit.jupiter.api.Test;

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
        Kassa kassaTest = new Kassa();
        assertFalse(Kassa.kassa.isEmpty());

        System.out.printf("%-10s %-10s%n", "Valör:", "Antal:");
        System.out.println("-----------------");
        for (String key : Kassa.kassa.keySet()){
            System.out.printf("%-10s %-10s%n", key, Kassa.kassa.get(key));
        }
    }

    // for i in lista eller map, print aantalet valörer i varje valör
}
