import org.testng.Assert;
import org.testng.annotations.Test;

// PROGRAMME Test (non demandé)
public class Poste {

    @Test
    public void testValid() {
        //Creation d'une boite-aux-lettres
        Boite boite = new Boite(30);

        //Creation de divers courriers/colis..
        Lettre lettre1 = new Lettre(200, "express", "1 place de la Pyramide 92911 La Defense", "A3");

        Publicite pub1 = new Publicite(1500, "express", "147 Quai du Président Roosevelt, 92130 Issy-les-Moulineaux");

        Colis colis1 = new Colis(5000, "express", "18 Rue rapail, 75002 Paris", 30);

        boite.ajouterCourrier(lettre1);
        boite.ajouterCourrier(pub1);
        boite.ajouterCourrier(colis1);

        System.out.println("Le montant total d'affranchissement est de " + boite.affranchir());
        boite.afficher();

        System.out.println("La boite contient " + boite.courriersInvalides() + " courriers invalides");

        Assert.assertEquals(boite.courriersInvalides(),0,"La boite contient des courriers invalides");
    }

    @Test
    public void testInvalid() {
        //Creation d'une boite-aux-lettres
        Boite boite = new Boite(30);

        //Creation de divers courriers/colis..
        Lettre lettre1 = new Lettre(200, "express", "1 place de la Pyramide 92911 La Defense", "A3");
        Lettre lettre2 = new Lettre(800, "normal", "", "A4"); // invalide

        Publicite pub1 = new Publicite(1500, "express", "147 Quai du Président Roosevelt, 92130 Issy-les-Moulineaux");
        Publicite pub2 = new Publicite(3000, "normal", ""); // invalide

        Colis colis1 = new Colis(5000, "express", "18 Rue rapail, 75002 Paris", 30);
        Colis colis2 = new Colis(3000, "express", "7 Avenue de la poste, 59000 Lille", 70); //Colis invalide !

        boite.ajouterCourrier(lettre1);
        boite.ajouterCourrier(lettre2);
        boite.ajouterCourrier(pub1);
        boite.ajouterCourrier(pub2);
        boite.ajouterCourrier(colis1);
        boite.ajouterCourrier(colis2);

        System.out.println("Le montant total d'affranchissement est de " + boite.affranchir());
        boite.afficher();

        System.out.println("La boite contient " + boite.courriersInvalides() + " courriers invalides");

        Assert.assertEquals(boite.courriersInvalides(),0,"La boite contient des courriers invalides");
    }


}