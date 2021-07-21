
import java.util.Scanner;

public class DaireDilimi {
  public static final double pi = 3.14;
  public static void main(String[] args){
  
    double r, a = 0;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("daire'nin yaricap ve aci bilgilerini giriniz,");
    System.out.print("r : "); r= sc.nextDouble();
    System.out.print("a : "); a= sc.nextDouble();
  
    double dilimAlani = (pi * (r * r) * a)/360.0;
    System.out.printf("%f derecelik alan: %f", a, dilimAlani);
  
  }





}
