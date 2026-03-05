import java.util.Scanner;

public class DosenDemo07 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah dosen: ");
    int jumlah = sc.nextInt();
    sc.nextLine();

    Dosen07[] arrayOfDosen = new Dosen07[jumlah];

    for (int i = 0; i < jumlah; i++) {

      System.out.println("\nData Dosen ke-" + (i + 1));

      System.out.print("Kode  : ");
      String kode = sc.nextLine();

      System.out.print("Nama  : ");
      String nama = sc.nextLine();

      System.out.print("Jenis Kelamin (Pria/Wanita): ");
      String jenisKelamin = sc.nextLine();

      boolean gender;
      if (jenisKelamin.equalsIgnoreCase("Pria")) {
        gender = true;
      } else {
        gender = false;
      }

      System.out.print("Usia  : ");
      int usia = sc.nextInt();
      sc.nextLine();

      arrayOfDosen[i] = new Dosen07(kode, nama, gender, usia);
    }

    DataDosen07 data = new DataDosen07();

    System.out.println();
    data.dataSemuaDosen(arrayOfDosen);
    data.jumlahDosenPerJenisKelamin(arrayOfDosen);
    data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
    data.infoDosenPalingTua(arrayOfDosen);
    data.infoDosenPalingMuda(arrayOfDosen);
  }
}