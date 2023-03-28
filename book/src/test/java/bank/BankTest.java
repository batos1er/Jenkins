package bank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void getComptesList() {
        Bank banque = new Bank();
        assertEquals(new ArrayList<Account>(), banque.getComptesList());
    }

    @Test
    void addCompte() {
        Bank banque = new Bank();
        banque.addCompte(new Account(1, 30, 2));
        assertEquals(1, banque.getComptesList().size());
    }

    @Test
    void suppCompte() {
        Bank banque = new Bank();
        Account compte = new Account(1, 30, 2);
        banque.addCompte(compte);
        banque.addCompte(new Account(2, 130, 3));
        banque.suppCompte(compte);
        assertEquals(1, banque.getComptesList().size());
    }

    @Test
    void soldesTotal() {
        Bank banque = new Bank();
        Account compte = new Account(1, 30, 2);
        banque.addCompte(compte);
        banque.addCompte(new Account(2, 130, 3));
        assertEquals(160, banque.soldesTotal());
    }

    @Test
    void transfertDeuxComptes() {
        Bank banque = new Bank();
        Account compte1 = new Account(1, 30, 2);
        Account compte2 = new Account(2, 130, 3);
        banque.addCompte(compte1);
        banque.addCompte(compte2);
        banque.transfertDeuxComptes(compte2, compte1,20);
        assertEquals(50, banque.getComptesList().get(0).getSolde());
    }
}