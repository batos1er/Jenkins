package bank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void TestGetter() {
        Account compte = new Account(2, 20, 2.3);
        assertEquals(2, compte.getId());
        assertEquals(20, compte.getSolde());
        assertEquals(2.3, compte.getTaux());
    }

    @Test
    void depot() {
        Account compte = new Account(2, 20, 2.3f);
        compte.depot(20);
        assertEquals(40, compte.getSolde());
    }

    @Test
    void retrait() {
        Account compte = new Account(2, 20, 2.3f);
        compte.retrait(10);
        assertEquals(10, compte.getSolde());
    }

    @Test
    void transfert() {
        Account compte1 = new Account(2, 20, 2.3f);
        Account compte2 = new Account(3, 70, 2.3f);
        compte1.transfert(compte2, 10);
        assertEquals(80, compte2.getSolde());
    }

    @Test
    void calculerInteret() {
        Account compte = new Account(2, 100, 2.0f);
        double interet = compte.calculerInteret();
        assertEquals(2, interet);
    }
}