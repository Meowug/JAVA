import java.util.Scanner;

public class infoProgram
{
  public static void main (String args[])
  {
    Scanner Key = new Scanner (System.in);
    
    String namaKelas,namaKoordinator; //setkan jenis data untuk pembolehubah
    int bilPel;
    
    System.out.print("Masukkan nama kelas : ");
    namaKelas = Key.nextLine();
    System.out.print("Masukkan nama koordinator : ");
    namaKoordinator = Key.nextLine();
    System.out.print("Masukkan bilangan pelajar : ");
    bilPel = Key.nextInt();
    
    System.out.println("\nMaklumat Program");
    System.out.println("Nama kelas : "+namaKelas);
    System.out.println("Nama koordinator : "+namaKoordinator);
    System.out.println("Bilangan pelajar : "+bilPel);
  }
}