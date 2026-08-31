public class Mahasiswa {

    String nama;
    String nim;
    double nilai;

    void cekKelulusan() {

        if (nilai >= 60) {
            System.out.println("Status : LULUS");
        } else {
            System.out.println("Status : MENGULANG");
        }
    }

    void tampilkanData() {

        System.out.println("\n=== HASIL KELULUSAN ===");
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Nilai  : " + nilai);

        cekKelulusan();
    }
}