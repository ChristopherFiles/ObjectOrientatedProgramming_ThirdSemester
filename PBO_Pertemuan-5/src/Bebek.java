public class Bebek extends Animal implements Terbang, Berenang {

    // Override dari kelas induk Animal
    @Override
    public void animalSound() {
        System.out.println("Bebek bersuara: kwek kwek!");
    }

    // Override dari Interface Terbang
    @Override
    public void terbang() {
        System.out.println("Bebek bisa terbang rendah.");
    }

    // Override dari Interface Berenang
    @Override
    public void berenang() {
        System.out.println("Bebek bisa berenang di atas air.");
    }
}