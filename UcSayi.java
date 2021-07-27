import java.util.Scanner;

public class UcSayi{
  public static void main(String[] args){
    int n1,n2,n3;
    Scanner sc = new Scanner(System.in);
    System.out.print("Sayi giriniz: "); n1 = sc.nextInt();
    System.out.print("Sayi giriniz: "); n2 = sc.nextInt();
    System.out.print("Sayi giriniz: "); n3 = sc.nextInt();
    System.out.printf("Girilen sayilar: %d, %d, %d\n", n1, n2, n3);
    
    int max = n1 > n2 && n1 > n3 ? n1 : n2 > n1 && n2 > n3 ? n2 : n3;
    int min = n1 < n2 && n1 < n3 ? n1 : n2 < n1 && n2 < n3 ? n2 : n3;
    int ave = n1 != max && n1 != min ? n1 : n2 != max && n2 != min ? n2 : n3;
    System.out.printf("Sirali sayilar: %d > %d > %d", max, ave, min);
    
  }


}
