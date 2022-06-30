package Jurnal06;

public class Kubus extends Bentuk implements BangunRuang {

    public Kubus(String nama, int sisi) {//konstruktor
        super(nama);
        this.sisi = sisi;
    }
    @Override
    public double hitungLuasPermukaan() {//method hitung luas permukaan
        luas = 6 * sisi * sisi;
        return luas;
    }
    @Override
    public double hitungVolume() {//method hitung volume
        volume = sisi * sisi * sisi;
        return volume;
    }
    public void info() {
        System.out.println("Luas Permukaan          : "+nama);
        System.out.println("Panjang Sisi            : "+sisi);
    }
}
