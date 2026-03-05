import java.util.Scanner;

public class MataKuliahDemo07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mata Kuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MataKuliah07[] arrayOfMataKuliah = new MataKuliah07[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data MataKuliah ke-" + (i + 1));
            System.out.print("Kode : ");
            kode = sc.nextLine();
            System.out.print("Nama : ");
            nama = sc.nextLine();
            System.out.print("SKS : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfMataKuliah[i] = new MataKuliah07();
            arrayOfMataKuliah[i].tambahData(kode, nama, sks, jumlahJam);

        }
        System.out.println("\n===Data MataKuliah===:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mata Kuliah " + (i + 1));
            arrayOfMataKuliah[i].CetakInfo();
        }
    }
}