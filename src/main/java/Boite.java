import java.util.ArrayList;

public class Boite {
    private int tailleMax;
//    private ArrayList<Lettre> lettres;
//    private ArrayList<Publicite> publicites;
//    private ArrayList<Colis> colis;
    private ArrayList<Courrier> courriers;

    public Boite(int tailleMax) {
        this.tailleMax = tailleMax;
//        this.lettres = new ArrayList<Lettre>();
//        this.publicites = new ArrayList<Publicite>();
//        this.colis = new ArrayList<Colis>();
        this.courriers = new ArrayList<Courrier>();
    }

    public void ajouterCourrier(Courrier courrier) {
        courriers.add(courrier);
    }

    public double affranchir() {
        double montant = 0.0;
        for (Courrier courrier : courriers) {
            if (courrier.valide()) {
                montant += courrier.affranchir();
            }
        }
        return montant;
    }

    public int courriersInvalides() {
        int nbrCourriersInvalides = 0;
        for (Courrier courrier : courriers) {
            if (!courrier.valide()) {
                ++nbrCourriersInvalides;
            }
        }
        return nbrCourriersInvalides;
    }
    public void afficher() {
        for (Courrier courrier : courriers) {
            System.out.println(courrier);
            if (courrier.valide()) {
                System.out.println("\tPrix : " + this.affranchir() + " Euro\n");
            }
            else {
                System.out.println("\tStatus : " + " invalide\n");
            }
        }
    }
}
