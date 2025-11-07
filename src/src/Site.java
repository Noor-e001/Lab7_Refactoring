public class Site {
    protected double units;
    protected double rate;

    public Site(double units, double rate) {
        this.units = units;
        this.rate = rate;
    }

    public double getBillableAmount() {
        double base = getBaseAmount();
        double tax = base * 0.05;
        return base + tax;
    }

    private double getBaseAmount() {
        return units * rate;
    }
}
