public class Employe {
    private int identifiant;
    private String nom;
    private String poste;
    private String email;

    public Employe(int identifiant, String nom, String poste, String email){
        this.identifiant = identifiant;
        this.nom = nom;
        this.poste = poste;
        this.email = email;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }
}
