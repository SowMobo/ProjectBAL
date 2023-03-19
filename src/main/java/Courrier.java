public class Courrier {
    private double poids;
    private String mode;
    private String adresse;

    protected Courrier(double poids, String mode, String adresse) {
        this.poids = poids;
        this.mode = mode.toLowerCase();
        this.adresse = adresse;
    }

    public String getMode() {
        return mode;
    }

    public boolean valide() {
        return !(this.adresse.isEmpty());
    }

    public double getPoids() {
        return poids;
    }

    /**
     * Serve d'interface pour les classes fils (polymorphisme).
     * @return
     */
    protected double affranchir() {
        return 0.0;
    }

    @Override
    public String toString() {
        String isExpresse = mode.equals("express") ? "oui" : "non";
        return "\tPoids : " + poids + " grammes" + '\n' +
                "\tExpress : " + isExpresse + '\n' +
                "\tDestination : " + adresse;
    }
}
