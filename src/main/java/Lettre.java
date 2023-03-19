public class Lettre extends Courrier {
    private String format;

    public Lettre(double poids, String mode, String adresse, String format) {
        super(poids, mode, adresse);
        this.format = format;
    }

    private double affranchirNormal() {
        double tarifBase = this.format.equals("A4") ? 2.5 : 3.5;
        return   tarifBase + (1.0 * this.getPoids() / 1000);
    }

    public double affranchir() {
        if (this.getMode().equals("normal")) {
            return affranchirNormal();
        } else {
            return 2 * affranchirNormal();
        }
    }

    @Override
    public String toString() {
        return "Lettre\n"
                + super.toString() + "\n" +
                "\tformat : " + format;
    }
}
