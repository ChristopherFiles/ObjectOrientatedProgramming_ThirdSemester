import java.util.List;
import java.util.ArrayList;

public class Mahasiswa{
    private String nama;
    private String nim;
    private List<MataKuliah> daftarMataKuliah;

    public Mahasiswa(String na, String ni){
        this.nama = na;
        this.nim = ni;
        this.daftarMataKuliah = new ArrayList<>();
    }

    public String getNama(){
        return nama;
    }

    public String getNim(){
        return nim;
    }

    public void tambahMatkul(MataKuliah mk){
        if(!daftarMataKuliah.contains(mk)){
            daftarMataKuliah.add(mk);
            mk.tambahMahasiswa(this);
        }
    }

    public void tampilkanMK(){
        int i=1;
        System.out.println("DAFTAR MATA KULIAH "+nama+" :");
        for(MataKuliah mk: daftarMataKuliah){
            System.out.println(i + "."+ mk.getKode()+" "+mk.getNamaMatkul());
            i = i+1;
        }
    }
}