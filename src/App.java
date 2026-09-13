import java.util.Scanner;
public class App {

    static void login()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter login details");
        info i=new info();

       System.out.print("Enter UserName : ");
       i.username=sc.nextLine();
       System.out.print("enter Account no : ");
        i.accno=sc.nextInt();
        System.out.print("Enter Password : ");
        i.pass=sc.nextInt();
    }
    public static void main(String[] args) throws Exception {

        System.out.println(" ========== BANK MANAGEMENT SYSTEM ==========");
      // login();
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter your choice : ");
       int n=sc.nextInt();
       switch(n)
       {
        case 1 :System.out.println("Login");
        break;
        case 2 : System.out.println("create new acc ");
        break;
        case 3 : System.out.println("Exit");
        break;
        default : System.out.println("Enter valid choice");
        break;

       }
    }
}
class info{
    String username;
    int accno;
    int pass;

}
