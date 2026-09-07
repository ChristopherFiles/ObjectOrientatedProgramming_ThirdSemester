import java.util.List;
import java.util.ArrayList;

public class MataKuliah {
    private String namaMatkul;
    private String kode;
    private  List<Mahasiswa> daftarMahasiswa;

    public MataKuliah(String nm, String ko){
        this.namaMatkul = nm;
        this.kode = ko;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public String getNamaMatkul(){
        return namaMatkul;
    }

    public String getKode(){
        return kode;
    }

    public void tambahMahasiswa(Mahasiswa mhs){
        if(!daftarMahasiswa.contains(mhs)){
            daftarMahasiswa.add(mhs);
            mhs.tambahMatkul(this);
        }
    }

    public void tampilkanPeserta(){
        int i=1;
        System.out.println("DAFTAR PESERTA MATA KULIAH "+ namaMatkul +" :");
        for(Mahasiswa mhs: daftarMahasiswa){
            System.out.println(i + "."+ mhs.getNama()+" "+mhs.getNim());
            i = i+1;
        }
    }
}
