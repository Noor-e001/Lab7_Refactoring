public class Site {
    private double units;
    private double rate;

    public Site(double units, double rate) {
        this.units = units;
        this.rate = rate;
    }

    public double getBillableAmount() {
        double base = units * rate;
        double tax = base * 0.05;
        return base + tax;
    }
}
