public class Burung extends Animal {

    @Override
    public void animalSound() {
        System.out.println("Burungnya bersuara: kicau kicau");
    }

    public void ciriKhas() {
        System.out.println("Ini binatang yang bisa terbang.");
    }

    public void makanan() {
        System.out.println("Ini binatang yang suka makan biji bijian.");
    }

    // Tambahkan method main di sini
    public static void main(String[] args) {
        Burung burung = new Burung();
        burung.animalSound();
        burung.ciriKhas();
        burung.makanan();
    }
}