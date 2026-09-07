public class Main {

    
    public static void main(String[] args){

        Mahasiswa m1 = new Mahasiswa("Yusuf","J04096");
        Mahasiswa m2 = new Mahasiswa("Adrian", "J04044");
        Mahasiswa m3 = new Mahasiswa("Ibrahim", "J04107");

        MataKuliah mk1 = new MataKuliah("PBO", "TPL001");
        MataKuliah mk2 = new MataKuliah("Basis Data", "TPL002");
        MataKuliah mk3 = new MataKuliah("RKPL", "TPL003");

        m1.tambahMatkul(mk1);
        m1.tambahMatkul(mk2);
        m1.tambahMatkul(mk3);
        m1.tampilkanMK();
        System.out.println();
        mk1.tampilkanPeserta();
        mk1.tambahMahasiswa(m2);
        System.out.println();
        mk1.tampilkanPeserta();

    }
}
