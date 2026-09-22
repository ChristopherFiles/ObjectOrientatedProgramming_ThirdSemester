# Refleksi Pembelajaran PBO: Abstract Class & Multiple Interfaces dalam Java

Dokumen ini berisi refleksi materi dan catatan teknis terkait implementasi konsep *Object-Oriented Programming* (OOP) pada bahasa pemrograman Java, khususnya mengenai **Abstract Class**, **Inheritance**, **Interfaces**, dan **Multiple Interfaces**.

---

## 📌 Ringkasan Materi

Pada sesi ini, fokus utama pembelajaran adalah memahami hierarki kelas dan memanfaatkannya untuk mengatasi keterbatasan *single inheritance* pada Java.

### 1. Abstract Class & Inheritance
* **Abstract Class (`Animal`)**: Digunakan sebagai cetak biru (*blueprint*) dasar yang tidak dapat diinstansiasi secara langsung[cite: 3, 5].
* **Abstract Method (`animalSound()`)**: Method tanpa implementasi (*body*) di kelas abstrak yang wajib di-*override* oleh kelas turunan[cite: 3, 5].
* **Concrete Method (`sleep()`)**: Method reguler dengan logika baku yang langsung diwariskan ke subclass[cite: 3, 5].
* **Subclass (`Burung`, `Dog`, `Pig`)**: Kelas-kelas konkret yang mewarisi sifat `Animal` dan mengimplementasikan bentuk suara masing-masing[cite: 1, 2, 3].

### 2. Multiple Interfaces
Java tidak mendukung pewarisan berganda dari kelas induk (*multiple class inheritance*), namun mendukung **Multiple Interfaces**[cite: 6].
* **Interface (`Terbang`, `Berenang`)**: Menjadi "kontrak" kemampuan yang memuat deklarasi method abstrak[cite: 4, 6, 7].
* **Implementasi Banyak Interface (`Bebek`)**: Menggunakan kata kunci `implements Terbang, Berenang` untuk menerapkan dua kemampuan sekaligus pada satu kelas[cite: 6].

### 3. Struktur Kode Modular
Pemisahan kode dari satu file tunggal menjadi struktur terpisah (1 kelas/interface per file `.java`) sangat penting untuk:
* Mencegah *error* kompilasi **Duplicate Class**.
* Memudahkan pemeliharaan (*maintenance*) serta kerapian arsitektur proyek.

---

## 📁 Struktur Proyek (`src/`)

```text
src/
├── Animal.java          # Abstract Class Induk
├── Burung.java          # Subclass dari Animal
├── Dog.java             # Subclass dari Animal
├── Pig.java             # Subclass dari Animal
├── Terbang.java         # Interface 1
├── Berenang.java        # Interface 2
├── Bebek.java           # Subclass Animal & Implements Terbang, Berenang
├── FirstInterface.java  # Interface pendukung
├── SecondInterface.java # Interface pendukung
├── DemoClass.java       # Implements FirstInterface, SecondInterface
└── Main.java            # Main Class (Titik Jalur Eksekusi)