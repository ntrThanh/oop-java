package lab4;

import java.util.Scanner;

public class StringAndCharacterHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // testExchangeCipher(sc);
        // testIsPalindromicWord(sc);
        // testIsPalindromicPhrase(sc);
    }

    public static String exchangeCipher(String inStr) {
        String outStr = "";
        char[] charArrayInStr = inStr.toLowerCase().toCharArray();
        for (int i = 0; i < charArrayInStr.length; i++) {
            int count = 0;
            for (int j = 97; j <= 122; j++) {
                if ((int) charArrayInStr[i] == j) {
                    outStr += (char) (122 - count);
                }
                count++;
            }
        }
        return outStr.toUpperCase();
    }

    public static void testExchangeCipher(Scanner sc) {
        System.out.println("Enter a plaintext string: ");
        String inStr = sc.nextLine();
        System.out.println("The ciphertext string is: " + exchangeCipher(inStr));
    }

    public static boolean isPalindromicWord(String inStr) {
        String outStr = "";
        String[] inStrArray = inStr.toLowerCase().split("");
        for (String string : inStrArray) {
            outStr = string + outStr;
        }

        if (outStr.equals(inStr.toLowerCase())) {
            return true;
        }
        return false;
    }

    public static void testIsPalindromicWord(Scanner sc) {
        System.out.println("Enter your string: ");
        String inStr = sc.nextLine();
        if (isPalindromicWord(inStr)) {
            System.out.println("\"" + inStr + "\" is a palindrome");
        } else {
            System.out.println("\"" + inStr + "\" is not a palindrome");
        }
    }

    public static boolean isPalindromicPhrase(String inStr) {
        String outStr = "";
        char[] charArray = inStr.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                outStr += charArray[i];
            }
        }
        if (isPalindromicWord(outStr)) {
            return true;
        }
        return false;
    }

    public static void testIsPalindromicPhrase(Scanner sc) {
        System.out.println("Enter your pharse: ");
        String pharseString = sc.nextLine();
        if (isPalindromicPhrase(pharseString)) {
            System.out.println("\"" + pharseString + "\" is a palindrome");
        } else {
            System.out.println("\"" + pharseString + "\" is not a palindrome");
        }
    }
}
