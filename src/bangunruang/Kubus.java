package bangunruang;

public class Kubus extends BangunRuang implements Hitung {
    private double sisi;

    public Kubus(double sisi) {
        super("Kubus");
        this.sisi = sisi;
    }

    // Override method abstrak dari BangunRuang
    @Override
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    // Implementasi method dari interface Hitung
    @Override
    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
}
