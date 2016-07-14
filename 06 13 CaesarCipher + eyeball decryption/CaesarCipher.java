import edu.duke.*;

public class CaesarCipher {
    public void shift_26_alphabet(int key) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //Compute the shifted alphabet
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);// substruct the first to the key th alphabet. 
        String a = alphabet.substring(key);
        String b = alphabet.substring(0,key);
        
        System.out.println(shiftedAlphabet);
        System.out.println(a);
        System.out.println(b);
    }
    
    public String encrypt(String input, int key) {
        //Make a StringBuilder with message (encrypted)
        StringBuilder encrypted = new StringBuilder(input);
        //Write down the alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //Compute the shifted alphabet
        String shiftedAlphabet = alphabet.substring(key)+
        alphabet.substring(0,key);
        //Count from 0 to < length of encrypted, (call it i)
        for(int i = 0; i < encrypted.length(); i++) {
            //Look at the ith character of encrypted (call it currChar)
            char currChar = encrypted.charAt(i);
            //Find the index of currChar in the alphabet (call it idx)
            int idx = alphabet.indexOf(currChar);
            //If currChar is in the alphabet
            if(idx != -1){
                //Get the idxth character of shiftedAlphabet (newChar)
                char newChar = shiftedAlphabet.charAt(idx);
                //Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i, newChar); // replace the ith char with newChar
            }
            //Otherwise: do nothing
        }
        //Your answer is the String inside of encrypted
        return encrypted.toString();
    }
    
    public void testCaesar() {
        int key = 17;
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message, key);
        System.out.println(encrypted);
        int decrypt_key = 26 -key;
        String decrypted = encrypt(encrypted, decrypt_key);
        System.out.println(decrypted);
    }
    
    public void burte_force() {
        FileResource fr = new FileResource();
        String message = fr.asString();
        for (int k=0; k <26; k++){
            String s = encrypt(message,k);
            System.out.println( k + " \t " + s);
        }
    }
}

