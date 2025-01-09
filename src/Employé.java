public class Employé {
    private int identifiant;
    private String nom;
    private String poste;

    public Employé(int identifiant, String nom, String poste){
        this.identifiant = identifiant;
        this.nom = nom;
        this.poste = poste;
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
