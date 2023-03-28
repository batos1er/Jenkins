package livre;

public class Book {
    private String titre;
    private String auteur;
    private String date;


    public Book(String titre, String auteur, String date) {
        this.titre = titre;
        this.auteur = auteur;
        this.date = date;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
