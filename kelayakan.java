import java.util.Scanner;

public class kelayakan {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    char gredMath, gredSNS;
    String status;
    
    System.out.print("Taipkan gred bagi mata pelajaran Matematik : ");
    gredMath = sc.next().charAt(0);
    System.out.print("Taipkan gred bagi mata pelajaran Sains\t: ");
    gredSNS = sc.next().charAt(0);
    
    if((gredMath <='B' || gredMath <='b')&&(gredSNS <= 'C' || gredSNS <= 'c')) {
      status = "Anda layak ke Aliran Sains.";}
    else
      status = "Anda tidak layak ke Aliran Sains.";
    
    System.out.println(status);
  }
}