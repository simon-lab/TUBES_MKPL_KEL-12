package Jurnal06;

public class Lingkaran extends Bentuk implements BangunDatar{
    private int jari_jari;
    private int keliling, luas;
    private final double phi = 3.14;

    public Lingkaran(String nama, int jari_jari) {//konstruktor
        super(nama);
        this.jari_jari = jari_jari;
    }
    @Override
    public double hitungKeliling() {//method hitung keliling
        keliling = 2 * ((int) 22 / 7) * jari_jari * jari_jari;
        double r = jari_jari;
        return keliling;
    }
    @Override
    public double hitungLuas() {//method hitung luas
        luas = (int) (0.5 * phi * jari_jari * jari_jari);
        double x = jari_jari;
        return luas;
    }
    @Override
    public void info() {
        System.out.println("Nama Lingkaran           : "+nama);
        System.out.println("Panjang Jari-Jari        : "+jari_jari);
    }
}
