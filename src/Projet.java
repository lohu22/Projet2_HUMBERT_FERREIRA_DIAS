import java.util.ArrayList;

public class Projet {
    private int identifiant;
    private String nom;
    private String date_de_début;
    private String date_de_fin;
    private ArrayList<Tâche> taches;

    public Projet(int identifiant, String nom, String date_de_début, String date_de_fin, ArrayList<Tâche> taches) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.date_de_début = date_de_début;
        this.date_de_fin = date_de_fin;
        this.taches = new ArrayList<>();
    }
}
