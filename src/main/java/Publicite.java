public class Publicite extends Courrier {
    public Publicite(double poids, String mode, String adresse) {
        super(poids, mode, adresse);
    }

    public double affranchir() {
        if (this.getMode().equals("normal")) {
            return (this.getPoids() / 1000) * 5.0;
        } else {
            return 2 * (this.getPoids() / 1000) * 5.0;
        }
    }

    @Override
    public String toString() {
        return "Publicite\n"
                + super.toString();
    }
}
