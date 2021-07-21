
import java.util.Scanner;

public class NotOrtalama{

  public static void main(String[] args){
    
  int matematik, fizik, kimya, turkce, tarih, muzik;
  Scanner sc = new Scanner(System.in);
  System.out.println("notlarinizi giriniz,");
  System.out.print("matematik: "); matematik = sc.nextInt();
  System.out.print("fizik    : "); fizik = sc.nextInt();
  System.out.print("kimya    : "); kimya = sc.nextInt();
  System.out.print("turkce   : "); turkce = sc.nextInt();
  System.out.print("tarih    : "); tarih = sc.nextInt();
  System.out.print("muzik    : "); muzik = sc.nextInt();
  
  int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
  double ort = toplam / 6.0;
  
  String result = (ort > 60) ? "Sinifi Gecti" : "Sinifta Kaldi" ;      
  System.out.println(result);
    
  }

}
