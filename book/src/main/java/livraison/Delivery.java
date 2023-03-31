package livraison;

public class Delivery {
    private int distance;
    private int poidsCargaison;

    public Delivery(int distance, int poidsCargaison) {
        this.distance = distance;
        this.poidsCargaison = poidsCargaison;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getPoidsCargaison() {
        return poidsCargaison;
    }

    public void setPoidsCargaison(int poidsCargaison) {
        this.poidsCargaison = poidsCargaison;
    }

    public float calculerTarif(){
        if(this.distance <= 50 && this.poidsCargaison < 10){
            return 10;
        }
        else if (this.distance > 50 && this.poidsCargaison <10) {
            return (float) (10+(this.distance-50)*0.5);
        }
        else if (this.distance > 50 && this.poidsCargaison > 10 && this.poidsCargaison < 25) {
            return (float) (12+(this.distance-50)*0.5);
        }
        else if(this.distance <= 50 && this.poidsCargaison > 10 && this.poidsCargaison < 25){
            return 12;
        }
        else if (this.distance <= 50 && this.poidsCargaison > 25) {
            return 15;
        }
        else{
            return (float) (15+(this.distance-50)*0.5);
        }
    }
}
