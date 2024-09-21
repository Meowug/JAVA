import java.util.Scanner;

public class jumlahJam {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    double jam,bayaran=0;
    
    System.out.print("Taipkan jumlah jam (jam) : ");
    jam = sc.nextDouble();
    
    if (jam > 5)
      bayaran = jam*2.00;
    
    System.out.println("Jumlah jam (Jam) : "+jam);
    System.out.println("Bayaran (RM) : "+bayaran);
  }
}