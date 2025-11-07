public class IndustrialSite extends Site {
    public IndustrialSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    protected double getTypeSpecificCharge(double base) {
        return base * 0.15; // surcharge
    }
}
