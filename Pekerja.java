/*public class ASEAN {
  String negara;
  int tahun;
  public ASEAN(){
    negara =null;
    tahun = 0;
  }
  public void setNegara(String n, int t) {
    negara = n;
    tahun = t;
  }
  public void paparan() {
    System.out.println("Negara ASEAN : "+negara);
    System.out.println("Tahun kemasukan : "+tahun);
  }
  public static void main (String[] args){
    ASEAN anggota1 = new ASEAN();
    anggota1.setNegara("Malaysia", 1967);
    anggota1.paparan();
    ASEAN anggota2 = new ASEAN();
    anggota2.setNegara("Vietnam", 1995);
    anggota2.paparan();
  }
}
  */

public class Pekerja{
  String nama, jawatan;
  double gaji;
  
  public void setdata(String n, double g, String j){
    nama = n;
    gaji = g;
    jawatan = j;
  }
  public void papar(){
    System.out.println("Nama\t\t : "+nama);
    System.out.println("Gaji\t\t : RM "+String.format("%.2f",gaji));
    System.out.println("Jawatan\t : "+jawatan);
  }
  public static void main (String[] args){
    Pekerja Staf1 = new Pekerja();
    Staf1.setdata("Ryan Basri", 2000.00, "Juruteknik");
    Staf1.papar();
  }}