package bangunruang;

public abstract class BangunRuang {
    protected String nama;

    public BangunRuang(String nama) {
        this.nama = nama;
    }

    public abstract double hitungVolume(); // Method abstrak
}
