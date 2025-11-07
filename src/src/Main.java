public class Main {
    public static void main(String[] args) {
        Site residential = new ResidentialSite(100, 0.20);
        Site industrial = new IndustrialSite(100, 0.25);

        System.out.println("Residential bill: " + residential.getBillableAmount());
        System.out.println("Industrial bill: " + industrial.getBillableAmount());
    }
}
