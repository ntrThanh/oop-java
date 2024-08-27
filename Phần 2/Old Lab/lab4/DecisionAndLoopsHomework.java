package lab4;

import java.util.*;
import java.io.*;;

public class DecisionAndLoopsHomework {
    public static void main(String[] args) {
        // guessNumber();
        guessWord();
    }

    public static String readFile(String fileName) {
        ArrayList<String> randomWords = new ArrayList<String>();
        File file = null;
        Scanner sc = null;
        try {
            file = new File(fileName); // đường dẫn file
            sc = new Scanner(file);
            while (sc.hasNext()) {
                randomWords.add(sc.nextLine());
            }
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        int randomWord = (int) (Math.random() * randomWords.size());
        return randomWords.get(randomWord);
    }

    public static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        final int randomNumber = (int) (Math.random() * 100);
        guessNumber(randomNumber, sc);
    }

    public static void guessNumber(int number, Scanner sc) {
        System.out.println("Key in your guess: ");
        int keyNumberGuess = sc.nextInt();
        int count = 1;

        while (keyNumberGuess != number) {
            if (keyNumberGuess > number) {
                System.out.println("Try lower");
                count++;
            } else if (keyNumberGuess < number) {
                System.out.println("Try higher");
                count++;
            }
            keyNumberGuess = sc.nextInt();
        }
        if (count == 1) {
            System.out.println("You got it in " + count + " trial!");
        } else {
            System.out.println("You got it in " + count + " trials!");
        }
    }

    public static void guessWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to be guessed:");
        String guessedString = sc.nextLine();
        guessWord(readFile(guessedString), sc); // có thể thay thế
                                                // guessedString bằng
                                                // phương thức
                                                // readFile("PathFile");
    }

    public static void guessWord(String guessedString, Scanner sc) {
        System.out.println("Key in one character or your guess word: ");
        String guessStringorCharacter = sc.nextLine();
        int count = 1;

        String[] originString = guessedString.trim().split("");
        String[] guessStringArray = new String[guessedString.length()];
        for (int i = 0; i < guessStringArray.length; i++) {
            guessStringArray[i] = "_";
        }

        while (!guessedString.equals(arrayToString(guessStringArray))
                && !guessedString.equals(guessStringorCharacter)) {
            if (guessStringorCharacter.length() == 1) {
                for (int i = 0; i < guessStringArray.length; i++) {
                    if (guessStringorCharacter.equals(originString[i])) {
                        guessStringArray[i] = guessStringorCharacter;
                    }
                }
            }
            System.out.println("Trial " + count + ": " + arrayToString(guessStringArray));
            if (guessedString.equals(arrayToString(guessStringArray))) {
                break;
            }
            System.out.println("Key in one character or your guess word: ");
            guessStringorCharacter = sc.nextLine();
            count++;
        }
        System.out.println("Congratulation!");
        System.out.println("You got in " + count + " trials");
    }

    public static String arrayToString(String[] array) {
        String stringOut = "";
        for (int i = 0; i < array.length; i++) {
            stringOut += array[i];
        }
        return stringOut;
    }
}
