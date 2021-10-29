import java.util.Scanner;

public class mainn {
    public static void main(String args []) throws Exception{
        System.out.println("Enter Email ID:");
        Scanner scanner = new Scanner(System.in);
        String emailid = scanner.next();
        Mail.sendMail(emailid);
    }
}
