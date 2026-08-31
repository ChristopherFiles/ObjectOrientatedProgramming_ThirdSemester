import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Mahasiswa mhs = new Mahasiswa();

        System.out.print("Masukkan Nama  : ");
        mhs.nama = input.nextLine();

        System.out.print("Masukkan NIM   : ");
        mhs.nim = input.nextLine();

        System.out.print("Masukkan Nilai : ");
        mhs.nilai = input.nextDouble();

        mhs.tampilkanData();

        input.close();
    }
}