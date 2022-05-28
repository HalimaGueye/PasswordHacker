import java.util.Scanner;

public class User  {
    
     static String login;
     static String password;


    public static String password()  {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Votre login est : ");
        login = scanner.nextLine();

        System.out.print("Votre mot de passe est : ");
        password = scanner.nextLine();

        return password;

    }


    
}
