import java.util.*;
import java.util.regex.*;

// Task4: Count how many words and numbers are in a given string
// Words are sequences of letters, numbers are integer tokens.
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.hasNextLine() ? sc.nextLine() : "";

        Pattern wordPattern = Pattern.compile("\\b[A-Za-z]+\\b");
        Pattern numberPattern = Pattern.compile("\\b-?\\d+\\b");

        Matcher wm = wordPattern.matcher(input);
        int words = 0;
        while (wm.find()) words++;

        Matcher nm = numberPattern.matcher(input);
        int numbers = 0;
        while (nm.find()) numbers++;

        System.out.println(words + " words " + numbers + " numbers");
    }
}
