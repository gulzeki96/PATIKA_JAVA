import java.util.Scanner;

public class KDV {

  public static void main(String[] args){
    double fiyat, oran, kdvTutari, kdvliFiyati = 0;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("fiyati giriniz : "); fiyat = sc.nextDouble();
    
    oran = (fiyat > 1000) ? 0.08 : 0.18;
    kdvTutari = fiyat * oran;
    kdvliFiyati = fiyat + kdvTutari;
    
    System.out.printf("fiyat: %f\n", fiyat);
    System.out.printf("oran : %f\n", oran);
    System.out.printf("kdv tutari: %f\n", kdvTutari);
    System.out.printf("kdvli fiyati: %f\n", kdvliFiyati);
    
  }

}
