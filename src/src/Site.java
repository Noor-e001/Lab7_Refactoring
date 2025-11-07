public abstract class Site {
    protected double units;
    protected double rate;

    public Site(double units, double rate) {
        this.units = units;
        this.rate = rate;
    }

    // Template Method: defines the full algorithm
    public final double getBillableAmount() {
        double base = getBaseAmount();
        double tax = getTax(base);
        return base + tax + getTypeSpecificCharge(base);
    }

    protected double getBaseAmount() {
        return units * rate;
    }

    protected double getTax(double base) {
        return base * 0.05;
    }

    // Hook: implemented differently by subclasses
    protected abstract double getTypeSpecificCharge(double base);
}
