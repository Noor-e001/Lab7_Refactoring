public class IndustrialSite extends Site {

    public IndustrialSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBillableAmount() {
        double base = units * rate;
        double surcharge = base * 0.15;
        return base + surcharge;
    }
}
