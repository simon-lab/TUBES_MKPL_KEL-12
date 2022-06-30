package Jurnal06;

public class PersegiPanjang extends Bentuk implements BangunDatar {

    
    public PersegiPanjang(String nama, int panjang, int lebar) {//konstruktor
        super(nama);
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    public double hitungKeliling() {//method hitung keliling
        keliling = 2 * panjang * lebar;
        return keliling;
    }
    @Override
    public double hitungLuas() {//method hitung luas
        luas = panjang * lebar;
        return luas;
    }
    public void info() {
        System.out.println("Nama Persegi Panjang                    : "+nama);
        System.out.println("Panjang                                 : "+panjang);
        System.out.println("Lebar                                   : "+lebar);
    }
}
