package bank;

public class Account {
    private int id;
    private double solde = 0;
    private double taux;

    public Account(int id, double solde, double taux) {
        this.id = id;
        this.solde = solde;
        this.taux = taux;
    }

    public int getId() {
        return id;
    }

    public double getSolde() {
        return solde;
    }

    public double getTaux() {
        return taux;
    }

    public void depot(int somme){
        this.solde += somme;
    }
    public void retrait(int somme){
        this.solde -= somme;
    }
    public void transfert(Account compte, int somme){
        compte.depot(somme);
        this.retrait(somme);
    }
    public double calculerInteret(){
        return this.solde * (taux/100);
    }
}
