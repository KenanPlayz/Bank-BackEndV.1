import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Mail {
    public static void sendMail(String recepient) throws Exception{
        System.out.println("Sending Mail ");
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccountEmail = "coyotesmailbot@gmail.com";
        String password = "Zaqws@2015";
        int otp = (int) (Math.random()*500)+900;

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }

        });
        Message message = prepareMessage(session,myAccountEmail, recepient, otp);
    Transport.send(message);
    System.out.println("Message Sent");
    }

    private static Message prepareMessage(Session session, String myAccountEmail, String recepient, int otp){
       try{
           Message message = new MimeMessage(session);
           message.setFrom(new InternetAddress(myAccountEmail));
           message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
           message.setSubject("OTP-KBANK||VERIFICATION");
           message.setText("Hey There, here is your OTP"+otp );
           return message;
       } catch(Exception ex){
           Logger.getLogger(Mail.class.getName()).log(Level.SEVERE,null, ex);
       }
       return null;
    }

   
}

