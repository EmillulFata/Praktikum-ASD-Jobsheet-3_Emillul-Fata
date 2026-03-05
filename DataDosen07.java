public class DataDosen07 {

  void dataSemuaDosen(Dosen07[] arrayOfDosen) {
    System.out.println("=== Data Semua Dosen ===");
    for (Dosen07 d : arrayOfDosen) {
      d.tampilInformasi();
    }
  }

  void jumlahDosenPerJenisKelamin(Dosen07[] arrayOfDosen) {
    int pria = 0;
    int wanita = 0;

    for (Dosen07 d : arrayOfDosen) {
      if (d.jenisKelamin) {
        pria++;
      } else {
        wanita++;
      }
    }

    System.out.println("Jumlah Dosen Pria   : " + pria);
    System.out.println("Jumlah Dosen Wanita : " + wanita);
  }

  void rerataUsiaDosenPerJenisKelamin(Dosen07[] arrayOfDosen) {
    int totalPria = 0, totalWanita = 0;
    int jumlahPria = 0, jumlahWanita = 0;

    for (Dosen07 d : arrayOfDosen) {
      if (d.jenisKelamin) {
        totalPria += d.usia;
        jumlahPria++;
      } else {
        totalWanita += d.usia;
        jumlahWanita++;
      }
    }

    System.out.println("Rata-rata usia dosen pria   : " + (totalPria / jumlahPria));
    System.out.println("Rata-rata usia dosen wanita : " + (totalWanita / jumlahWanita));
  }

  void infoDosenPalingTua(Dosen07[] arrayOfDosen) {
    Dosen07 tertua = arrayOfDosen[0];

    for (Dosen07 d : arrayOfDosen) {
      if (d.usia > tertua.usia) {
        tertua = d;
      }
    }

    System.out.println("=== Dosen Paling Tua ===");
    tertua.tampilInformasi();
  }

  void infoDosenPalingMuda(Dosen07[] arrayOfDosen) {
    Dosen07 termuda = arrayOfDosen[0];

    for (Dosen07 d : arrayOfDosen) {
      if (d.usia < termuda.usia) {
        termuda = d;
      }
    }

    System.out.println("=== Dosen Paling Muda ===");
    termuda.tampilInformasi();
  }
}