public class Balok {

    private double panjang;
    private double lebar;
    private double tinggi;

    Balok(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}