public class IndustrialSite extends Site {

    public IndustrialSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBillableAmount() {
        double base = super.getBillableAmount();
        double surcharge = base * 0.15;
        return base + surcharge;
    }
}
