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
       login();
    }
}
class info{
    String username;
    int accno;
    int pass;

}
