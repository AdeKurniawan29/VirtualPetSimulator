Nama: Ade Kurniawan
NIM: H1D025041
Tema: Game
Program console Java untuk simulasi merawat hewan peliharaan virtual (kucing atau anjing).

## Fitur
- Memilih kucing atau anjing.
- Memberi makan dan mengajak bermain.
- Memeriksa kondisi hewan.
- Melihat status lapar, kesehatan, dan kebahagiaan.
- Mendengarkan suara hewan.

## Cara menjalankan
Buka terminal pada folder yang berisi seluruh file `.java`, lalu jalankan:

## Struktur file
- `Pet.java`: abstract superclass, atribut, constructor, getter/setter, dan method umum.
- `Cat.java`: subclass kucing.
- `Dog.java`: subclass anjing.
- `Feedable.java`: interface untuk aktivitas memberi makan.
- `Playable.java`: interface untuk aktivitas bermain.
- `Main.java`: menu dan alur utama program.

## Pemetaan 10 requirement PBO
1. **State dan Behavior**: atribut hunger, health, happiness serta method feed(), play(), showStatus().
2. **Immutability**: konstanta `public static final MAX_STAT` dan atribut `private final petId`.
3. **Enkapsulasi dan Overloading**: atribut private, getter/setter, penggunaan `this`, dan dua constructor pada Pet.
4. **Inheritance**: Cat dan Dog menggunakan `extends Pet`; Main terpisah.
5. **Super Chaining**: constructor subclass memanggil `super(...)`; showStatus() memanggil `super.showStatus()`.
6. **Method Overriding**: subclass menimpa method dengan `@Override`.
7. **Abstract Class**: Pet merupakan abstract class dengan abstract method makeSound() dan checkCondition().
8. **Logika State Percabangan**: checkCondition() pada Cat dan Dog menggunakan if/else, membaca dan mengubah state.
9. **Polimorfisme Interface**: Main menggunakan `Feedable feeder` dan `Playable player` untuk memanggil method objek.
10. **Multiple Interface**: Cat dan Dog mengimplementasikan `Feedable` serta `Playable`.

## Catatan pengujian
- Pilih kucing, lalu uji semua menu.
- Jalankan kembali program dan pilih anjing.
- Beri makan untuk melihat nilai hunger turun dan health naik.
- Ajak bermain untuk melihat happiness naik dan hunger bertambah.
- Periksa kondisi untuk menguji percabangan dan perubahan state.
- Lihat status untuk memeriksa nilai atribut.

Nilai hunger menunjukkan tingkat kelaparan: semakin tinggi nilainya, semakin lapar hewan.

## Screenshot Percobaan Saat Run
![Screenshot 1](screenshot/Screenshot%202026-11-07%20191256.png)
![Screenshot 2](screenshot/Screenshot%202026-11-07%20191455.png)
![Screenshot 3](screenshot/Screenshot%202026-11-07%20191509.png)
![Screenshot 4](screenshot/Screenshot%202026-11-07%20191546.png)
![Screenshot 5](screenshot/Screenshot%202026-11-07%20191557.png)