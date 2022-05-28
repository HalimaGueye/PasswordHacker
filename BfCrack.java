public class BfCrack implements PasswCracker {
    @Override
    public String cracker (int size, int[] password, int position, String pass) throws InterruptedException{

            String testString = ""; // Initialisation de la chaine de test
            String cracked = ""; // Initialisation de la chaine crackée
        
            if (pass.length() > size) { // Si la taille du mot de passe est supérieur à la taille du mot de passe àcracker
              System.out.print("Le mot de passe saisi est trop long. Nous ne supportons que " + size + " caractères.");
              return "";
            }
        
            for (int i = 0; i < 36; i++) { // Boucle de permutation de 0 à 36 (26 lettres + 10 chiffres)
              password[position] = i;
        
              if (position != size - 1) { // Si on n'est pas à la fin du mot de passe
                testString = cracker(size, password, position + 1, pass);
                if (testString != "") {
                  return testString;
                }
              } else if (position == size - 1) { // Si on est à la fin du mot de passe
                for (int j = 0; j < size; j++) {
        
                  switch (password[j] + 1) {
                    case 1:
                      cracked = cracked + "A";
                      break;
                    case 2:
                      cracked = cracked + "B";
                      break;
                    case 3:
                      cracked = cracked + "C";
                      break;
                    case 4:
                      cracked = cracked + "D";
                      break;
                    case 5:
                      cracked = cracked + "E";
                      break;
                    case 6:
                      cracked = cracked + "F";
                      break;
                    case 7:
                      cracked = cracked + "G";
                      break;
                    case 8:
                      cracked = cracked + "H";
                      break;
                    case 9:
                      cracked = cracked + "I";
                      break;
                    case 10:
                      cracked = cracked + "J";
                      break;
                    case 11:
                      cracked = cracked + "K";
                      break;
                    case 12:
                      cracked = cracked + "L";
                      break;
                    case 13:
                      cracked = cracked + "M";
                      break;
                    case 14:
                      cracked = cracked + "N";
                      break;
                    case 15:
                      cracked = cracked + "O";
                      break;
                    case 16:
                      cracked = cracked + "P";
                      break;
                    case 17:
                      cracked = cracked + "Q";
                      break;
                    case 18:
                      cracked = cracked + "R";
                      break;
                    case 19:
                      cracked = cracked + "S";
                      break;
                    case 20:
                      cracked = cracked + "T";
                      break;
                    case 21:
                      cracked = cracked + "U";
                      break;
                    case 22:
                      cracked = cracked + "V";
                      break;
                    case 23:
                      cracked = cracked + "W";
                      break;
                    case 24:
                      cracked = cracked + "X";
                      break;
                    case 25:
                      cracked = cracked + "Y";
                      break;
                    case 26:
                      cracked = cracked + "Z";
                      break;
                    case 27:
                      cracked = cracked + "0";
                      break;
                    case 28:
                      cracked = cracked + "1";
                      break;
                    case 29:
                      cracked = cracked + "2";
                      break;
                    case 30:
                      cracked = cracked + "3";
                      break;
                    case 31:
                      cracked = cracked + "4";
                      break;
                    case 32:
                      cracked = cracked + "5";
                      break;
                    case 33:
                      cracked = cracked + "6";
                      break;
                    case 34:
                      cracked = cracked + "7";
                      break;
                    case 35:
                      cracked = cracked + "8";
                      break;
                    case 36:
                      cracked = cracked + "9";
                      break;
                  }
        
                }
                // System.out.println(cracked);
                if (cracked.equalsIgnoreCase(pass)) { // Si la chaine de test est égale à la chaine de test
                  System.out.println("Votre mot de passe est : " + cracked);
                  return cracked;
                } else {
                  cracked = "";
                }
              }
        
            }
            return "";
          
    }
}
