import java.util.*;

public class jadualSifir {
  public static void main (String[] args){
    Scanner input =  new Scanner (System.in);
    int Sifir, hasilDarab;
    System.out.println("~~~JADUAL SIFIR~~~");
    System.out.print("Masukkan nombor sifir pilihan anda: ");
    Sifir = input.nextInt();
    int nombor=0;
    do {
      hasilDarab = nombor*Sifir;
      System.out.println(nombor + " x " + Sifir + " = " +hasilDarab);
      nombor++;
    } while (nombor <= 12);
  }
}
    