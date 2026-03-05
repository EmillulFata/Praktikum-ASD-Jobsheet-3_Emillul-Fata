public class Mahasiswa07 {

  String nim;
  String nama;
  String kelas;
  double ipk;

  // Konstruktor default
  public Mahasiswa07() {
  }

  // Konstruktor berparameter
  public Mahasiswa07(String nim, String nama, String kelas, double ipk) {
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    this.ipk = ipk;
  }

  void tampilInformasi() {
    System.out.println("NIM   : " + nim);
    System.out.println("Nama  : " + nama);
    System.out.println("Kelas : " + kelas);
    System.out.println("IPK   : " + ipk);
    System.out.println("----------------------------------");
  }
}