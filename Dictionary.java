import java.io.File;
import java.util.Scanner;

public class Dictionary implements PasswCracker {
    @Override

    public String cracker (int size, int[] password, int position, String pass) throws InterruptedException  {
        try {
            File file = new File("C:\\Users\\HalimaG\\Desktop\\DesignPattern_TP\\Factory\\dictionnaire.txt");
            Scanner scanner = new Scanner(file);

            String temp=null;

            while(scanner.hasNextLine()){
                temp=scanner.nextLine();
                if (temp.equals(pass)){
                    System.out.print("Votre mot de passe est :"+temp);
                return temp;
                }
            }        


        } catch (Exception e) {
            System.out.print(e);
        }
        System.out.print("Mot de passe non retrouvé");
        return "Mot de passe non retrouvé";
    }

}
