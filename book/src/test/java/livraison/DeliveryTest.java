package livraison;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryTest {
    @Test
    void testCalculTarif(){
        Delivery d1 = new Delivery(15, 20);
        Delivery d2 = new Delivery(15, 8);
        Delivery d3 = new Delivery(72, 28);
        Delivery d4 = new Delivery(53, 20);
        Delivery d5 = new Delivery(15, 26);
        assertEquals(12, d1.calculerTarif());
        assertEquals(10, d2.calculerTarif());
        assertEquals(26, d3.calculerTarif());
        assertEquals(13.5, d4.calculerTarif());
        assertEquals(15, d5.calculerTarif());
    }

}