improt java.util.Scanner;


public class Manav{

  public static final double a = 2.14;
  public static final double e = 3.67;
  public static final double m = 0.95;
  public static final double d = 1.11;
  public static final double p = 5.00;
    
  public static void main(String[] args){
    double k = 0;
    double fiyat = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Armut Kaç Kilo ? :"); k = sc.nextDouble();
    fiyat += k*a;
    System.out.print("Elma Kaç Kilo ? :"); k = sc.nextDouble();
    fiyat += k*e;
    System.out.print("Domates Kaç Kilo ? :"); k = sc.nextDouble();
    fiyat += k*d;
    System.out.print("Muz Kaç Kilo ? :"); k = sc.nextDouble();
    fiyat += k*m;
    System.out.print("Patlıcan Kaç Kilo ? :"); k = sc.nextDouble();
    fiyat += k*p;
    System.out.printf("Toplam Tutar : %.2f", fiyat); 

  }



}
