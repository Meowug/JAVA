import java.util.Scanner;

public class kirakomisen {
  public static void main (String args[]) {
    Scanner sc = new Scanner (System.in);
    
    
    System.out.print("Masukkan jumlah jumlah jualan individu: ");
    double jIndividu = sc.nextDouble();
    double kadarKomIn = kiraKadarIn (jIndividu);
    
    System.out.print("Masukkan jumlah jumlah jualan kedai: ");
    double jKedai = sc.nextDouble();
    double kadarKomKed = kiraKadarKed (jKedai);
    
    System.out.println(kadarKomIn);
    System.out.println(kadarKomKed);
  }
    
    static double kiraKadarIn (double jIndividu) {
      if (jIndividu >= 250000)
        return 0.05;
      else if (jIndividu >= 150000)
        return 0.03;
      else if (jIndividu >= 75000)
        return 0.01;
      else
        return 0.0;
    }
    
    static double kiraKadarKed (double jKedai) {
      if (jKedai >= 1000000)
        return 0.03;
      else if (jKedai >= 700000)
        return 0.02;
      else if (jKedai >= 400000)
        return 0.01;
      else
        return 0.0;
    }
    
    static double kiraKomisen (juala
    
  }
    
    