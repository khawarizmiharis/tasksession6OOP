package bangunruang;

public class Main {
    public static void main(String[] args) {
        Kubus kubus = new Kubus(5);
        Balok balok = new Balok(4, 3, 2);

        System.out.println("Bangun Ruang: " + kubus.nama);
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());

        System.out.println("\nBangun Ruang: " + balok.nama);
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());

        // Menggunakan Overloading
        System.out.println("Volume Balok dengan faktor 2: " + balok.hitungVolume(2));
    }
}
