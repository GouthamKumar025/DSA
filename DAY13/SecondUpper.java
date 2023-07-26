import java.util.Scanner;

public class SecondUpper{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().trim();
        
        String secondWordInUpperCase = getSecondWordInUpperCase(sentence);
        System.out.println("Second word in UPPERCASE: " + secondWordInUpperCase);
        
        scanner.close();
    }
    
    public static String getSecondWordInUpperCase(String sentence) {
        String[] words = sentence.split("\\s+");
        if (words.length >= 2) {
            return words[1].toUpperCase();
        } else {
            // Handle cases where there is no second word
            return "N/A";
        }
    }
}


