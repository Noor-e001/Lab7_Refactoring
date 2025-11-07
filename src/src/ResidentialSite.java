public class ResidentialSite extends Site {
    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    protected double getTypeSpecificCharge(double base) {
        return -base * 0.10; // discount
    }
}
