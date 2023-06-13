package geometri;


public class Main {
    public static void main(String[] args) {
        // Objek PersegiPanjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(7.0, 9.0);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());

        // Objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(4.0);
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
    

    }
}
