public class MahasiswaDemo07 {
  public static void main(String[] args) {

    Mahasiswa07[] arrayOfMahasiswa = new Mahasiswa07[3];

    arrayOfMahasiswa[0] = new Mahasiswa07();
    arrayOfMahasiswa[0].nim = "244107060033";
    arrayOfMahasiswa[0].nama = "Agnes Titania Kinanti";
    arrayOfMahasiswa[0].kelas = "SIB-1E";
    arrayOfMahasiswa[0].ipk = (float) 3.75;

    arrayOfMahasiswa[1] = new Mahasiswa07();
    arrayOfMahasiswa[1].nim = "2341720172";
    arrayOfMahasiswa[1].nama = "Achmad Maulana Hamzah";
    arrayOfMahasiswa[1].kelas = "TI-2A";
    arrayOfMahasiswa[1].ipk = (float) 3.36;

    arrayOfMahasiswa[2] = new Mahasiswa07();
    arrayOfMahasiswa[2].nim = "244107023006";
    arrayOfMahasiswa[2].nama = "Dirhamawan Putranto";
    arrayOfMahasiswa[2].kelas = "TI-1E";
    arrayOfMahasiswa[2].ipk = (float) 3.80;

    for (Mahasiswa07 mhs : arrayOfMahasiswa) {
      mhs.tampilInformasi();
    }
  }
}