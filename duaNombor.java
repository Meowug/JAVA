public class duaNombor {
  public static void main (String[] args) {
    
    int no1 = 20;
    int no2 = 35;
    int noBesar,noKecil;
    
    if (no1 > no2) {
      noBesar = no1;
      noKecil = no2;
    } else {
      noBesar = no2;
      noKecil = no1;
    }
    
    double purata = (no1+no2)/2;
    
    System.out.println("No Besar\t: "+noBesar);
    System.out.println("No Kecil\t: "+noKecil);
    System.out.println("Purata\t\t: "+purata);
  }
}