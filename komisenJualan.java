import java.util.Scanner;

public class komisenJualan{
  public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    
    System.out.println("ATURCARA MENGIRA KOMISEN JUALAN UNTUK SUKU TAHUNAN");
    System.out.print("Masukkan nama jurujual\t\t : ");
    String nama = sc.nextLine();
    System.out.print("Taipkan jumlah jualan individu (RM)\t : ");
    double jIndividu = sc.nextDouble();
    System.out.print("Taipkan jumlah jualan Kedai (RM)\t : ");
    double jKedai = sc.nextDouble();
    double kKomisen_Individu = kiraKadarKomisenIndividu(jIndividu);
    double kKomisen_Kedai = kiraKadarKomisenKedai(jKedai);
    double jKomisenIndividu = kiraKomisen(jIndividu, kKomisen_Individu);
    double jKomisenKedai = kiraKomisen(jKedai, kKomisen_Kedai);
    double komisen = jumlahKomisen(jKomisenIndividu, jKomisenKedai);
    paparan(nama, jIndividu, jKedai, jKomisenIndividu, jKomisenKedai, komisen);
    /*System.out.println(kKomisen_Individu);
    System.out.println(kKomisen_Kedai);
    System.out.println(jKomisenIndividu);
    System.out.println(jKomisenKedai);
    System.out.println(komisen);*/
  }
    
  static double kiraKadarKomisenIndividu(double jIndividu){
    if (jIndividu >= 250000)
      return 0.05;
    else if (jIndividu >= 150000)
      return 0.03;
    else if (jIndividu >= 75000)
      return 0.01;
    else
      return 0;
  }
  
  static double kiraKadarKomisenKedai(double jKedai){
    if (jKedai>= 1000000)
      return 0.03;
    else if (jKedai >= 700000)
      return 0.02;
    else if (jKedai >= 400000)
      return 0.01;
    else
      return 0;
  }
  
  static double kiraKomisen(double j, double k){
    return j*k;
  }
  static double jumlahKomisen(double jKomisenIndividu, double jKomisenKedai){
   return jKomisenIndividu + jKomisenKedai;
  }
  
  static void paparan(String nama, double jIndividu, double jKedai, double jKomisenIndividu, double jKomisenKedai, double komisen){
    System.out.println("Nama Jurujual\t\t : "+nama);
    System.out.println("Jumlah Jualan Individu\t : RM "+String.format("%.2f",jIndividu));
    System.out.println("Jumlah Komisen Individu\t : RM "+String.format("%.2f",jKomisenIndividu));
    System.out.println("Jumlah Jualan Kedai\t\t : RM "+ String.format("%.2f",jKedai));
    System.out.println("Jumlah Komisen Kedai\t : RM "+String.format("%.2f",jKomisenKedai));
    System.out.println("Jumlah Keseluruhan Komisen\t : RM "+String.format("%.2f",komisen));
  }
}