package Jurnal06;

public class PrismaSegi3 extends Bentuk implements BangunRuang { 
    private int alas, tinggi, tinggi_prism;
    private int luas, volume;
    
    public PrismaSegi3(String nama, int alas, int tinggi, int tinggi_prism) {//konstruktor
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
        this.tinggi_prism = tinggi_prism;
    }
    @Override
    public double hitungLuasPermukaan() {//method hitung luas permukaan
        luas = (1/2 * alas * tinggi) * tinggi_prism;
        return luas;
    }
    @Override
    public double hitungVolume() {//method hitung volume
        volume = alas * tinggi_prism;
        return volume;
    }
    public void info() {
        System.out.println("Nama Prism Segitiga         : "+nama);
        System.out.println("Alas Segitiga               : "+alas);
        System.out.println("Tinggi Segitiga             : "+tinggi);
        System.out.println("Tinggi Prisma               : "+tinggi_prism);
    }
}
