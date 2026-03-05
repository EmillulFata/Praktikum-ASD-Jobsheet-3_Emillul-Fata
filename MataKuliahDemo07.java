import java.util.Scanner;

public class MataKuliahDemo07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MataKuliah07[] arrayOfMataKuliah = new MataKuliah07[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
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

            arrayOfMataKuliah[i] = new MataKuliah07(kode, nama, sks, jumlahJam);
        }
        System.out.println("\nData MataKuliah:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Data MataKuliah ke-" + (i + 1));
            System.out.println("Kode MK : " + arrayOfMataKuliah[i].kodeMK);
            System.out.println("Nama MK : " + arrayOfMataKuliah[i].namaMK);
            System.out.println("SKS : " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMataKuliah[i].jam);
            System.out.println("------------------------------");
        }
    }
}