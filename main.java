import java.util.*;

public class main {
    public static void main(String args[]) throws InterruptedException {
        
        
        Scanner scanner = new Scanner(System.in);
        User User= new User();
        String pass = User.password();
        int Choice = 0;    

        int[] password = new int[pass.length()];
        
        System.out.print("0) - Dictionary \n1) - Brute Force  :  ");// Recuperation du mot de passe à partir de la console
        Choice = scanner.nextInt();        
        Factory factory = new Factory();
        PasswCracker passwCracker = factory.getInstance(Choice);

        passwCracker.cracker(pass.length(),password,0, pass);
    }
   

}
