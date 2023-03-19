import org.testng.annotations.Test;

public class TestBoite {
    @Test
    public void  testo1() {
        Boite poste = new Boite(5);
        Lettre leVerte = new Lettre(2.0, "expresse", "", "A4");
        Publicite pub2 = new Publicite(5, "express", "106 rue du vieux pont 78955 CSP");
        Colis colis3 = new Colis(15, "express", "07 rue lucie aubrac bondy", 51);

        poste.ajouterCourrier(leVerte);
        poste.ajouterCourrier(pub2);
        poste.ajouterCourrier(colis3);

        System.out.println("Le montant total d'affranchissement est de " + poste.affranchir());
        poste.afficher();
        System.out.println("La boîte contient " + poste.courriersInvalides() + " courriers invalides");
    }
}