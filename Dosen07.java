public class Dosen07 {

  String kode;
  String nama;
  boolean jenisKelamin;
  int usia;

  // Konstruktor default
  public Dosen07() {
  }

  // Konstruktor berparameter
  public Dosen07(String kode, String nama, boolean jenisKelamin, int usia) {
    this.kode = kode;
    this.nama = nama;
    this.jenisKelamin = jenisKelamin;
    this.usia = usia;
  }

  void tampilInformasi() {
    System.out.println("Kode  : " + kode);
    System.out.println("Nama  : " + nama);
    System.out.println("JK    : " + (jenisKelamin ? "Pria" : "Wanita"));
    System.out.println("Usia  : " + usia);
    System.out.println("-----------------------");
  }
}