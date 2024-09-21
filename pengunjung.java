import java.util.*;

public class pengunjung{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int bildewasa=0, bilremaja=0;
    for (int i=0;i<6;i++){
      System.out.print("Taipkan umur pengunjung: ");
      int umur = sc.nextInt();
      
      if(umur > 20){
        System.out.println("Dewasa");
        bildewasa = bildewasa+1;
      } else {
        System.out.println("Remaja");
        bilremaja = bilremaja + 1;
      }
    } 
    System.out.println("Bilangan pengunjung dewasa\t : "+bildewasa);
    System.out.println("Bilangan pengunjung remaja\t : "+bilremaja);
  }
}