public class ResidentialSite extends Site {

    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBillableAmount() {
        double base = units * rate;
        double discount = base * 0.10;
        return base - discount;
    }
}
