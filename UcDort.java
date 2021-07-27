import java.util.Scanner;


public class UcDort{
  public static void main(String[] args){
    int a;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("bir sayi gir: "); a = sc.nextInt();
    int i;
    int toplam, counter;
    toplam = 0; counter = 0;
    for (i=1; i<a; i++){
      if(i%3 != 0 || i % 4 != 0)
        continue;
      System.out.print(i + " ");
      toplam+= i;
      ++counter;
    }
    System.out.println("\nortalamalari: " + (double)toplam/counter);
  }
}
