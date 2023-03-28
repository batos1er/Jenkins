package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> comptesList = new ArrayList<>();


    public List<Account> getComptesList() {
        return comptesList;
    }

    public void addCompte(Account compte){
        comptesList.add(compte);
    }
    public void suppCompte(Account compte){
        comptesList.remove(compte);
    }
    public double soldesTotal(){//refaire pour afficher dans un sout chaque compte avec son solde
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
