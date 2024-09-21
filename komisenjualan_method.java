////aturcara mengira komisen jualan (latihan5 soalan 5) 

import java.util.Scanner;

public class komisenjualan_method
{ 
  public static void main(String args[])
  {
    
    
    Scanner INPUT = new Scanner(System.in);
    //istihar jenis data dan pembolehubah
    double jualan_individu, kadar_individu,komisen_individu, jualan_kedai,kadar_kedai,komisen_kedai;

    System.out.println("ATURCARA PENGIRAAN KOMISEN JURUJUAL");
    System.out.println( "Taipkan jumlah jualan anda : ");
    jualan_individu = INPUT.nextDouble();
    kadar_individu = kiraKadarIndividu(jualan_individu);  //pass nilai jualan_individu kepada method
    System.out.println( "Taipkan jumlah jualan kedai anda : ");
    jualan_kedai = INPUT.nextDouble();
    kadar_kedai = kiraKadarKedai(jualan_kedai);  //pass nilai jualan_kedai kepada method
    
    //panggil method
    komisen_individu = kiraKomisen(jualan_individu,kadar_individu);
    komisen_kedai = kiraKomisen(jualan_kedai,kadar_kedai);
    double komisenAkhir = kiraJumKomisen (komisen_individu,komisen_kedai);
    paparkeputusan(jualan_individu,jualan_kedai,komisen_individu,komisen_kedai, komisenAkhir);
  }
  
  static double kiraKadarIndividu(double jualan_individu) //method kira kadar individu
  {
    if(jualan_individu >=250000)
      return 0.05;
   else if(jualan_individu >=150000)
      return 0.03;
    else if(jualan_individu >=75000)
      return 0.01;
    else 
      return 0.00;
  }
    
  static double kiraKadarKedai(double jualan_kedai)
  {
     if (jualan_kedai >=1000000)
      return 0.03;
   else if (jualan_kedai >=700000)
      return 0.02;
    else if (jualan_kedai >=400000)
      return 0.01;
    else 
      return 0.00; 
  }
  
  static double kiraKomisen(double jualan,double kadar) //method kira komisen
  {
   return jualan*kadar; 
  }
  
  static double kiraJumKomisen (double komisen_individu,double komisen_kedai)
  {
    return komisen_individu + komisen_kedai ;
  }

  static void paparkeputusan(double jualan_individu,double jualan_kedai,double komisen_individu,double komisen_kedai,double komisenAkhir) //method
  {
    System.out.println("Jumlah jualan adalah : RM" + jualan_individu);
    System.out.println("Komisen individu adalah : RM" + komisen_individu);
    System.out.println("Jumlah jualan kedai adalah : RM" +jualan_kedai);
    System.out.println("Komisen kedai adalah : RM" + komisen_kedai);
    System.out.println("\n Jumlah komisen anda : RM" +komisenAkhir);
    //
  }
}