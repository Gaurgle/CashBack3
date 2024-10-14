import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


import ChangeBack3.ChangeBack3;
import org.junit.jupiter.api.Test;

public class ChangebackTest {

    @Test
    public void testChangeBack(){
        ChangeBack3 transaction = new ChangeBack3(8.0, 10.0);

        assertEquals(2.0, transaction.changeBack());
        assertNotEquals(transaction.cash, transaction.price);
    }

    // for i in lista eller map, print aantalet valörer i varje valör
}
