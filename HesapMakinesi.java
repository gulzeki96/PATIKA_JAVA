import java.util.Scanner;

class HesapMakinesi{
  public static void main(String[] args){
    
    int n1, n2, islem;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Ilk sayiyi giriniz: "); n1 = sc.nextInt();
    System.out.print("Ikinci sayiyi giriniz: "); n2 = sc.nextInt();
    System.out.println("(1)Toplama, (2)Cikarma, (3)Carpma, (4)Bolme");
    System.out.print("Islem seciniz: "); islem = sc.nextInt();
    
    switch(islem){
      case 1:  System.out.printf("%d + %d = %d\n", n1, n2, n1+n2); break;
      case 2:  System.out.printf("%d - %d = %d\n", n1, n2, n1-n2); break;
      case 3:  System.out.printf("%d * %d = %d\n", n1, n2, n1*n2); break;
      case 4:  System.out.printf("%d / %d = %f\n", n1, n2, (double)n1/n2); break;
      default: System.out.println("hatali islem girisi!");
    }
    
  
  }


}
