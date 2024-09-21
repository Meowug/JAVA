import java.util.*;

public class pemenang {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    int kedudukan;
    System.out.print("Masukkan kedudukan peserta (1,2,3) : ");
    kedudukan = sc.nextInt();
    switch (kedudukan) {
      case 1:
        System.out.println("Anda Johan");
        break;
      case 2:
        System.out.println("Anda Naib Johan");
        break;
      case 3:
        System.out.println("Anda Tempat Ketiga");
        break;
      default:
        System.out.println("Nombor tiada dalam senarai pilihan");
        break;
    }
  }
}
      
    
    