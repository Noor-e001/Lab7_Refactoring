public class ResidentialSite extends Site {

    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBillableAmount() {
        double base = super.getBillableAmount();
        double discount = base * 0.10;
        return base - discount;
    }
}
