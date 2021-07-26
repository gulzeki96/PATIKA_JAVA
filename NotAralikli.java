import java.util.Scanner;

public class NotAralikli{

  public static void main(String[] args){
    
  int matematik, fizik, kimya, turkce, muzik;
  int counter = 0;
  int toplam = 0;
  Scanner sc = new Scanner(System.in);
  System.out.println("notlarinizi giriniz,");
  System.out.print("matematik: "); matematik = sc.nextInt();
  if(matematik >= 0 && matematik <= 100){
    toplam += matematik;
    ++counter;
  }
  System.out.print("fizik    : "); fizik = sc.nextInt();
  if(fizik >= 0 && fizik <= 100){
    toplam += fizik;
    ++counter;
  }    
  System.out.print("kimya    : "); kimya = sc.nextInt();
  if(kimya >= 0 && kimya <= 100){
    toplam += kimya;
    ++counter;
  }
  System.out.print("turkce   : "); turkce = sc.nextInt();
   if(turkce >= 0 && turkce <= 100){
    toplam += turkce;
    ++counter;
  }
  System.out.print("muzik    : "); muzik = sc.nextInt();
  if(muzik >= 0 && muzik <= 100){
    toplam += muzik;
    ++counter;
  }  
  
  double ort = toplam / counter;
  
  String result = (ort > 55) ? "Sinifi Gecti" : "Sinifta Kaldi" ;      
  System.out.printf("%.2f ortalama ile ", ort);
  System.out.println(result);
    
  }

}
