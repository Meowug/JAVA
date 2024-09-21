public class Staf{
  public static void main (String[] args){
    String nama = "Johari Bin Ghazali";
    int umur = 42;
    double gaji = 3500.00;
    Tajuk();
    DataPekerja(nama, umur, gaji);
  }
  static void Tajuk(){
    System.out.println("\t\tMAKLUMAT PEKERJA\t");
    int i=0;
    do{
      System.out.print("#");
      i++;
    }while(i<37);
  }
  static void DataPekerja(String nama, int umur, double gaji){
    System.out.println("\nNama Pekerja\t: "+nama);
    System.out.println("Umur Pekerja\t: "+umur);
    System.out.println("Gaji Bulanan\t: RM"+gaji);
  }
}