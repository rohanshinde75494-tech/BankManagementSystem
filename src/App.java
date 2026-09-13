import java.util.Scanner;
public class App {

   
    public static void main(String[] args) throws Exception {

        System.out.println(" ========== BANK MANAGEMENT SYSTEM ==========");
      // login();
       Scanner sc=new Scanner(System.in);
       System.out.println("1> login");
       System.out.println("2> Create account");
       System.out.println("3> exit");
       System.out.println();
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
        login_page obj =new login_page();
       if(n==1)
       {
          obj.login();
       }
      else if(n==2)
       {
          // create_acc();
       }
       else if(n==3)
       {
        return;
       }
       else
       {
        main(args);
       }
    }
}

