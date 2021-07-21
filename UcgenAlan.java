import java.util.Scanner;



public class UcgenAlan {


  public static void main(String[] args){
  
    double k1, k2, k3;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("1. kenar uzulugu : "); k1 = sc.nextDouble();
    System.out.print("2. kenar uzulugu : "); k2 = sc.nextDouble(); 
    System.out.print("3. kenar uzulugu : "); k3 = sc.nextDouble(); 
    
    double u = (k1 + k2 + k3) / 2.0;
    
    double alan = Math.sqrt(u * (u-k1) * (u-k2) * (u-k3));
    
    
    
    if(Math.abs(k1-k2)>=k3 || Math.abs(k1-k3)>=k2 || Math.abs(k2-k3)>=k1)
      System.out.println("hatali kenar uzunluklari");
    else   
      System.out.printf("alan : %f\n", alan);
  }


}
