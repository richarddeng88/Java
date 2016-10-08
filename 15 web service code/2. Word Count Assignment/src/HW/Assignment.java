package HW;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Assignment {

    public Assignment() {}

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file1.txt");
        try {
            PrintWriter output = new PrintWriter(file);
            output.println("one two three four one two three");
            output.print("three four five six one two");
            output.close();
        } catch (IOException ex) {
            System.out.printf("ERROR: %s!\n", ex);
        }

        Scanner input = new Scanner(file);
        FileReader fr = new FileReader("file1.txt");
        
        Scanner type = new Scanner(System.in);
        System.out.println("Plese type a word here >>>> ");
        String a = type.nextLine();
        
        int line = 0;
        try {
        while (true){
            line +=1;
            String line1 = input.nextLine();
            System.out.println("file1.txt," + line + "," + count_word(line1, a));
        }} catch (Exception ex){
            System.out.print("End of the work today!!! THANKS!!!");
        }

    }

    public static int count_word(String line, String word) {
        int count = 0;
        int start = 0;
        while (true) {
            int a = line.indexOf(word, start);
            if (a == -1) {
                //System.out.println("end. there is no word you typed. ");
                break;
            } else {
                count += 1;
                start = a + 1;
            }
        }
        return count;
    }

    public static int find_start_index(int startpoint, String line, String word) {
        line = "one two three four one two three";
        int stop = line.indexOf(word, startpoint);
        return stop;
    }
}
