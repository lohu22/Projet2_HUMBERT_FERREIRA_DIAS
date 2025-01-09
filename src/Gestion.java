import java.util.ArrayList;

public class Gestion {
    private ArrayList<Employé> employés;
    private ArrayList<Projet> projets;

    public Gestion(){
        employés = new ArrayList<>();
        projets = new ArrayList<>();
    }

    public void ajouter_des_employés(Employé employé){
        employés.add(employé);
    }

    public void supprimer_des_employés(int identifiant_employé){
    }



}
