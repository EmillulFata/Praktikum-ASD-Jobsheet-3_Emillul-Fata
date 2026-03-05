1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan! 
2. Apa yang dilakukan oleh kode program berikut?
   Mahasiswa07[] arrayOfMahasiswa = new Mahasiswa07[3];
3.  Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut? 
   arrayOfMahasiswa[0] = new Mahasiswa07();
4. Apa yang dilakukan oleh kode program berikut?
    arrayOfMahasiswa[0] = new Mahasiswa07();
    arrayOfMahasiswa[0].nim = "244107060033";
    arrayOfMahasiswa[0].nama = "Agnes Titania Kinanti";
    arrayOfMahasiswa[0].kelas = "SIB-1E";
    arrayOfMahasiswa[0].ipk = (float) 3.75;
5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2? 

Jawab:
1. Tidak harus.
Sebuah class yang akan dijadikan array of object tidak wajib memiliki method, tetapi biasanya memiliki atribut untuk menyimpan data. Method hanya digunakan untuk mengolah atau menampilkan data dari atribut tersebut.
Jadi, class tetap bisa dijadikan array of object meskipun hanya memiliki atribut saja tanpa method.
2. Kode tersebut digunakan untuk membuat array yang berisi objek bertipe Mahasiswa07 dengan jumlah 3 elemen. Namun pada tahap ini objeknya belum dibuat, yang dibuat hanya tempat atau referensi arraynya saja.
3. Jika pada class Mahasiswa07 tidak ditulis konstruktor secara eksplisit, maka Java secara otomatis membuat konstruktor default (tanpa parameter).
Karena itu, baris berikut tetap bisa dijalankan:
arrayOfMahasiswa[0] = new Mahasiswa07();
Artinya program memanggil konstruktor default yang dibuat otomatis oleh Java.
4. Program tersebut melakukan :
arrayOfMahasiswa[0] = new Mahasiswa07();
-Membuat objek Mahasiswa07 pada indeks ke-0 dalam array.
arrayOfMahasiswa[0].nim = "244107060033";
-Mengisi atribut NIM dari objek tersebut.
arrayOfMahasiswa[0].nama = "Agnes Titania Kinanti";
-Mengisi atribut nama mahasiswa.
arrayOfMahasiswa[0].kelas = "SIB-1E";
-Mengisi kelas mahasiswa.
arrayOfMahasiswa[0].ipk = (float) 3.75;
-Mengisi IPK mahasiswa.
5. Karena masing-masing class memiliki fungsi yang berbeda:
  Class Mahasiswa07
-Berfungsi sebagai class model / blueprint yang menyimpan atribut dan method mahasiswa.
  Class MahasiswaDemo07
-Berfungsi sebagai class utama (main program) untuk menjalankan program, membuat objek, dan menguji class Mahasiswa.
Pemisahan ini membuat program menjadi lebih terstruktur, mudah dipahami, dan mudah dikembangkan.