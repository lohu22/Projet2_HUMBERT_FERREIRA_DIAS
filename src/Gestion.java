import java.util.ArrayList;

public class Gestion {
    private ArrayList<Employe> employés;
    private ArrayList<Projet> projets;

    public Gestion(){
        employés = new ArrayList<>();
        projets = new ArrayList<>();
    }

    public void ajouter_des_employés(Employe employé){
        employés.add(employé);
    }

    public void supprimer_des_employés(int identifiant_employé){
    }



}
