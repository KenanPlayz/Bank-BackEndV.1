import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        //login/create
        System.out.println("Hey there welcome! \nWould you like to: \n   [Create a new account]   or   [Login with your existing one]");
        String loginCreateAccount = scan.nextLine().toLowerCase();
        System.out.println(loginCreateAccount);
        //
        while(true){
            //create new account statements
            if(loginCreateAccount.equals("create a new account"))
            break;
            else if(loginCreateAccount.equals("create"))
            break;
            else if(loginCreateAccount.equals("new account"))
            break;
            else if(loginCreateAccount.equals("a new account"))
            break;
            if(loginCreateAccount.equals("create a new one"))
            break;
            else if(loginCreateAccount.equals("create"))
            break;
            else if(loginCreateAccount.equals("new one"))
            break;
            else if(loginCreateAccount.equals("a new one"))
            break;
            //login statements
            else if(loginCreateAccount.equals("login"))
            break;
            else if(loginCreateAccount.equals("login with another account"))
            break;
            else if(loginCreateAccount.equals("login with another one"))
            break;
            else if(loginCreateAccount.equals("login with my existing one"))
            break;
            else if(loginCreateAccount.equals("login with an existing one"))
            break;
            else if(loginCreateAccount.equals("login with a existing one"))
            break;
            else if(loginCreateAccount.equals("login with my existing account"))
            break;
            else if(loginCreateAccount.equals("login with an existing account"))
            break;
            else if(loginCreateAccount.equals("login with a existing account"))
            break;
            else{
                System.out.println("Looks like that is an incorrect option, please enter a correct one!!");
                loginCreateAccount = scan.nextLine().toLowerCase();
                //----------------------Work in progress----------------------------------
                
                
            }
        }


        // home screen
        HomeScreen();//prints homescreen and reads input and also contains PasswordVerifier Method --> executed during method call

        // Mail and Password Verifier

    }

    public static void HomeScreen() { // Prints the homescreen of the bank
        Scanner scan1 = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\t Hey There! \t ");
        System.out.print("Welcome to KBANK:- \nPlease Enter your mail id: ");
        String cMailID = scan1.nextLine(); // Variable that reads the mail id - home screen
        System.out.print("Please enter your password: ");
        String cPassword = scan1.nextLine(); // variable that reads the password - home screen
        PasswordVerifier(cMailID,cPassword);
    }
    public static void PasswordVerifier(String cMailID, String cPassowrd){
           if(cMailID.equals("@gmail.com")){
               if(cPassowrd.length()!= 8){
               System.out.println("Please enter a password greater than 8 characters");
               HomeScreen();
               }else{
                   
               }
           }
           else{
           System.out.println("The entered mail id is not correct, please use an appropriate domain");
           HomeScreen();
           }
    }
}
