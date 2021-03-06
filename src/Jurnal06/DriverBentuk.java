package Jurnal06;

public class DriverBentuk {
    public static void main(String[] args) { //main
        Kubus K = new Kubus("Kiub", 5);
        Ligkaran L = new Lingkaran("Sirkel", 14);
        PesegiPanjang PP = new PersegiPanjang("Rektenggel", 8, 9) {};
        PrismaSegi3 PS3 = new PrismaSegi3("Trainggel Prism", 6, 7, 10);
        L.info();
        System.out.println("Luas                : "+L.hitungLus());
        System.out.println("Keliling            : "+L.hitungKeliling());
        
        PP.info();
        System.out.println("Luas                    : "+L.hitungLuas());
        System.out.println("Keliling                : "+L.hitungKeliling());
        K.info();
        System.out.println("Luas Permukaan     : "+K.hitungLuasPermukaan());
        System.out.println("Volume             : "+K.hitungVolume());
        PS3.info();
        System.out.println("Luas Permukaan          : "+PS3.hitungLuasPermukaan());
        System.out.println("Volume                  : "+PS3.hitungVolume());
    }
}
