// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass Burung (turunan dari Animal)
class Burung extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Burungnya bersuara: kicau kicau");
    }

    public void ciriKhas() {
        System.out.println("Ini binatang yang bisa terbang.");
    }

    public void makanan() {
        System.out.println("Burung makan biji-bijian dan cacing.");
    }
}

// Subclass Pig (turunan dari Animal)
class Pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

// Interface pertama
interface FirstInterface {
    void myMethod();
}

// Interface kedua
interface SecondInterface {
    void myOtherMethod();
}

// DemoClass mengimplementasikan Multiple Interfaces
class DemoClass implements FirstInterface, SecondInterface {
    @Override
    public void myMethod() {
        System.out.println("Memanggil myMethod() dari FirstInterface.");
    }

    @Override
    public void myOtherMethod() {
        System.out.println("Memanggil myOtherMethod() dari SecondInterface.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // 1. Memanggil objek Burung (Inheritance & Abstract Class)
        Burung burungKu = new Burung();
        burungKu.animalSound();
        burungKu.sleep();
        burungKu.ciriKhas();
        burungKu.makanan();

        System.out.println("----------------------------------");

        // 2. Memanggil objek Pig (Inheritance & Abstract Class)
        Pig pigKu = new Pig();
        pigKu.animalSound();
        pigKu.sleep();

        System.out.println("----------------------------------");

        // 3. Memanggil objek DemoClass (Multiple Interfaces)
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}