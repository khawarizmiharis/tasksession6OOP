package bangunruang;

public class Balok extends BangunRuang implements Hitung {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super("Balok");
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Overriding method dari BangunRuang
    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    // Implementasi method dari interface Hitung
    @Override
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    // Overloading: Method dengan parameter berbeda
    public double hitungVolume(double faktor) {
        return hitungVolume() * faktor;
    }
}
