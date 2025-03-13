package src;
// Main Class
public class MainBanking {
    public static void main(String[] args) {
        ArrayList<Rekening> daftarRekening = new ArrayList<>();

        // Membuat objek rekening
        Tabungan tabungan1 = new Tabungan("Alice", "12345", 5000000, 5);
        Giro giro1 = new Giro("Bob", "67890", 2000000, 1000000);

        daftarRekening.add(tabungan1);
        daftarRekening.add(giro1);

        // Melakukan transaksi
        tabungan1.setor(1000000);
        giro1.tarik(2500000);

        // Menampilkan semua rekening
        for (Rekening rekening : daftarRekening) {
            rekening.tampilkanInfo();
            System.out.println("-----------------------");
        }
    }
}
