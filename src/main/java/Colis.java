public class Colis extends Courrier {
    private double volume;

    public Colis(double poids, String mode, String adresse, double volume) {
        super(poids, mode, adresse);
        this.volume = volume;
    }

    @Override
    public boolean valide() {
        return (super.valide() && this.volume <= 50.0);
    }

    public double affranchir() {
        double frais = (this.getPoids() / 1000) * 1.0 + (this.volume * 0.25);

        if (this.getMode().equals("normal")) {
            return frais;
        } else {
            return 2 * frais;
        }
    }

    @Override
    public String toString() {
        return "Colis\n"
                + super.toString() + "\n" +
                "\tVolume : " + volume;
    }
}
