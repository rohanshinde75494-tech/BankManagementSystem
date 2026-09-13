import java.util.Scanner;

public class login_page {
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
}
class info{
    String username;
    int accno;
    int pass;

}