public class MataKuliah07 {

  String kodeMK;
  String namaMK;
  int sks;
  int jam;

  // Konstruktor default
  public MataKuliah07() {
  }

  // Konstruktor berparameter
  public MataKuliah07(String kodeMK, String namaMK, int sks, int jam) {
    this.kodeMK = kodeMK;
    this.namaMK = namaMK;
    this.sks = sks;
    this.jam = jam;
  }

  void tampilInformasi() {
    System.out.println("Kode MK : " + kodeMK);
    System.out.println("Nama MK : " + namaMK);
    System.out.println("SKS     : " + sks);
    System.out.println("Jam     : " + jam);
    System.out.println("----------------------");
  }
}