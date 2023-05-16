public class Main {
    public static void main(String[] args) {

        Pulpen pulpen = new Pulpen();
        pulpen.merk   = "Joyko";
        pulpen.jumlahPulpen = 3;
        pulpen.warna = "Biru";

        Pulpen pulpen1 = new Pulpen();
        pulpen1.merk    = "Pilot";
        pulpen1.jumlahPulpen = 5;
        pulpen1.warna = "Tosca";

        pulpen.info();
        pulpen1.info();
    }
}