import java.util.Scanner;



class SifreKontrol{
  static String kullaniciAdi = "patika";
  static String sifre = "java123";
  public static void main(String[] args){
  
    String username, password;
    Scanner sc = new Scanner(System.in);
    Scanner scChar = new Scanner(System.in);
    int girisFlag = 0;
    char c;
    while(girisFlag == 0){
      System.out.print("Kullanici Adi : "); username = sc.nextLine();
      System.out.print("Sifre         : "); password = sc.nextLine();
    
     if(username.equals(kullaniciAdi) && password.equals(sifre)){
       System.out.println("Giris Yaptiniz!");
       girisFlag = 1;
     }
     else{
       System.out.println("Giris Bilgileri Hatali");
       System.out.println("Sifrenizi Sifirlamak İstiyor musunuz? ((e)Evet/(h)Hayir) "); c = scChar.next().charAt(0);
       if(c == 'e'){
         while(true){
           System.out.println("Yeni sifre giriniz: "); password = sc.nextLine();
           if(sifre.equals(password)){
             System.out.println("gecersiz sifre!"); continue;
           }
           else{
             //sifre = '\0';
             sifre = password;
             System.out.println("Sifre olusturuldu.");
             break;
           }
         }
       } 
     }
  }
 }
}
