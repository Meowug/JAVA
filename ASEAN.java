public class ASEAN {
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
    