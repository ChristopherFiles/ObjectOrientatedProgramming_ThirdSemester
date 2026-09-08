public class Dosen {
    private String nidn;
    private String nama;
    private String programStudi;
    private String jabatan;
    private int jumlahSks;

    public Dosen(String nidn, String nama, String programStudi, String jabatan, int jumlahSks) {
        this.nidn = nidn;
        this.nama = nama;
        this.programStudi = programStudi;
        this.jabatan = jabatan;
        this.jumlahSks = jumlahSks;
    }

    public String getNidn() {
        return nidn;
    }

    public String getNama() {
        return nama;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public String getJabatan() {
        return jabatan;
    }

    public int getJumlahSks() {
        return jumlahSks;
    }

    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Nama tidak boleh kosong.");
        }
    }

    public void setJabatan(String jabatan) {
        if (jabatan != null && !jabatan.trim().isEmpty()) {
            this.jabatan = jabatan;
        } else {
            System.out.println("Jabatan tidak boleh kosong.");
        }
    }

    public void tambahSks(int sks) {
        if (sks > 0) {
            jumlahSks += sks;
        } else {
            System.out.println("Jumlah SKS harus lebih dari 0.");
        }
    }

    public void tampilkanData() {
        System.out.println("=== DATA DOSEN ===");
        System.out.println("NIDN          : " + nidn);
        System.out.println("Nama          : " + nama);
        System.out.println("Program Studi : " + programStudi);
        System.out.println("Jabatan       : " + jabatan);
        System.out.println("Jumlah SKS    : " + jumlahSks);
    }
}