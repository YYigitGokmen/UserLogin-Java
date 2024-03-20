




import java.util.Scanner;





public class UserLogin {

public static void main(String[] args) {

    String userName,password;

    Scanner inp = new Scanner(System.in);

    System.out.print("Kullanıcı Adınız: "   );
userName=inp.nextLine();

    System.out.print("Sifreniz: ");
    password=inp.nextLine();

    if (userName.equals("Patika")&& password.equals("java123")) {
        System.out.println("Giriş Yaptınız!!!");

    } else{
        System.out.print("Hatalı Deneme");
    }
  }
}
