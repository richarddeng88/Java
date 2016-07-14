
/**
 * Write a description of decrpt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class decrpt {
    public void brute_force(String message) {
        CaesarCipher cipher = new CaesarCipher();
        for (int k=0; k <26; k++){
            String s = cipher.encrypt(message,k);
            System.out.println( k + " \t " + s);
        }
    }
    
}
