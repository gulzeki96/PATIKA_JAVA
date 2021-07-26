import java.util.Scanner;

class EtkinlikSicaklik{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double s;
    String e;
    System.out.print("Sicaklik degerini giriniz: "); s = sc.nextDouble();
    e = (s<5) ? "KAYAK" : (s>=5 && s<15) ? "SINEMA" : (s>=15 && s<25) ? "PIKNIK" : "YUZME";
    System.out.printf("%.2f icaklik degeri icin uygun etkinlik %s olacaktir.\n", s, e);
    
  }


}
