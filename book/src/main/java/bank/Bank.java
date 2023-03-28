package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> comptesList = new ArrayList<>();



    public void addCompte(Account compte){
        comptesList.add(compte);
    }
    public void suppCompte(Account compte){
        comptesList.remove(compte);
    }
    public double soldesTotal(){
        double solde = 0;
        for (Account compte: comptesList) {
            solde += compte.getSolde();
        }
        return solde;
    }
    public void transfertDeuxComptes(Account c1, Account c2, int somme){
        c1.transfert(c2, somme);
    }
}
