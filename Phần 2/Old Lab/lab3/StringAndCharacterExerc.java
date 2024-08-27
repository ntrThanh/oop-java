package lab3;

import java.util.Scanner;

public class StringAndCharacterExerc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // testReverseString(sc);
        // testCountVowelDigits(sc);
        // testPhoneKeyPad(sc);
        // testCipherCeasarCode(sc);
        // testDecipherCeasarCode(sc);
        // testBinaryToDecimal(sc);
        // testHexString(sc);
        // testHexadecimalToDecimal(sc);
        // testOctalToDecimal(sc);
        // testRadixNToDecimal(sc);
    }

    public static String reverseString(String inStr) {
        String[] inStrArray = inStr.split("");
        String outString = "";
        for (String string : inStrArray) {
            outString = string + outString;
        }
        return outString;
    }

    public static void testReverseString(Scanner sc) {
        System.out.println("Enter a String: ");
        String inStr = sc.nextLine();
        System.out.println("The reverse of the String " + inStr + " is " + reverseString(inStr));
    }

    public static int countVowels(String inStr) {
        int countVowel = 0;
        String[] strArray = inStr.toLowerCase().split("");
        for (int i = 0; i < strArray.length; i++) {
            try {
                if (strArray[i].equals("u")
                        || strArray[i].equals("e")
                        || strArray[i].equals("o")
                        || strArray[i].equals("a")
                        || strArray[i].equals("i")) {
                    countVowel++;
                }
            } catch (Exception e) {
                continue;
            }
        }
        return countVowel;
    }

    public static int countDigits(String inStr) {
        int countDigits = 0;
        String[] strArray = inStr.toLowerCase().split("");
        for (int i = 0; i < strArray.length; i++) {
            try {
                if (Integer.parseInt(strArray[i]) >= 0 &&
                        Integer.parseInt(strArray[i]) <= 9) {
                    countDigits++;
                }
            } catch (Exception e) {
                continue;
            }
        }
        return countDigits;
    }

    public static void testCountVowelDigits(Scanner sc) {
        System.out.println("Enter a String: ");
        String inStr = sc.nextLine();
        System.out.printf("Number of vowel: %d (%.2f%%)\n", countVowels(inStr),
                (float) countVowels(inStr) * 100 / (inStr.length()));
        System.out.printf("Number of digits: %d (%.2f%%)", countDigits(inStr),
                (float) countDigits(inStr) * 100 / (inStr.length()));
    }

    public static String phoneKeyPad(String str) {
        String stringPhoneKeyPadOut = "";
        String[] strArray = str.toLowerCase().split("");
        for (int i = 0; i < strArray.length; i++) {
            String choice = strArray[i];
            switch (choice) {
                case "a":
                case "b":
                case "c":
                    stringPhoneKeyPadOut += "2";
                    break;

                case "d":
                case "e":
                case "f":
                    stringPhoneKeyPadOut += "3";
                    break;

                case "g":
                case "h":
                case "i":
                    stringPhoneKeyPadOut += "4";
                    break;

                case "j":
                case "k":
                case "l":
                    stringPhoneKeyPadOut += "5";
                    break;

                case "m":
                case "n":
                case "o":
                    stringPhoneKeyPadOut += "6";
                    break;

                case "p":
                case "q":
                case "r":
                case "s":
                    stringPhoneKeyPadOut += "7";
                    break;

                case "t":
                case "u":
                case "v":
                    stringPhoneKeyPadOut += "8";
                    break;

                case "x":
                case "y":
                case "z":
                case "w":
                    stringPhoneKeyPadOut += "9";
                    break;

                default:
                    break;
            }
        }
        return stringPhoneKeyPadOut;
    }

    public static void testPhoneKeyPad(Scanner sc) {
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(phoneKeyPad(str));
    }

    public static String cipherCaesarCode(String str) {
        String stringOut = "";
        char charArray[] = str.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if ((int) charArray[i] <= 119) {
                int charAtI = (int) charArray[i] + 3;
                stringOut += ((char) charAtI + "").toUpperCase();
            } else {
                // if ((int) charArray[i] == 120) {
                // stringOut += "A";
                // }
                // if ((int) charArray[i] == 121) {
                // stringOut += "B";
                // }
                // if ((int) charArray[i] == 122) {
                // stringOut += "C";
                // }
                if ((int) charArray[i] >= 120) {
                    int charAtI = (int) charArray[i] - 23;
                    stringOut += ((char) charAtI + "").toUpperCase();
                }
            }
        }
        return stringOut;
    }

    public static void testCipherCeasarCode(Scanner sc) {
        System.out.println("Enter a plaintext string: ");
        String str = sc.nextLine();
        System.out.print("The cipher Caesar code is ");
        System.out.println(cipherCaesarCode(str));
    }

    public static String decipherCaesarCode(String str) {
        String stringOut = "";
        char charArray[] = str.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if ((int) charArray[i] >= 100) {
                int charAtI = (int) charArray[i] - 3;
                stringOut += ((char) charAtI + "").toUpperCase();
            } else {
                // if ((int) charArray[i] == 97) {
                // stringOut += "X";
                // }
                // if ((int) charArray[i] == 98) {
                // stringOut += "Y";
                // }
                // if ((int) charArray[i] == 99) {
                // stringOut += "Z";
                // }
                if ((int) charArray[i] <= 99) {
                    int charAtI = (int) charArray[i] + 23;
                    stringOut += ((char) charAtI + "").toUpperCase();
                }
            }
        }
        return stringOut;
    }

    public static void testDecipherCeasarCode(Scanner sc) {
        System.out.println("Enter a ciphertext string: ");
        String str = sc.nextLine();
        System.out.print("The plaintext is ");
        System.out.println(decipherCaesarCode(str));
    }

    public static int binaryToDecimal(String binaryString) {
        String[] binaryStringArray = binaryString.trim().split("");
        for (int i = 0; i < binaryStringArray.length; i++) {
            if (!binaryStringArray[i].equals("1") && !binaryStringArray[i].equals("0")) {
                return -1;
            }
        }

        int decimalNumber = 0;
        int temp = 1;
        for (int i = binaryStringArray.length - 1; i >= 0; i--) {
            decimalNumber += Integer.parseInt(binaryStringArray[i]) * temp;
            temp *= 2;
        }
        return decimalNumber;
    }

    public static void testBinaryToDecimal(Scanner sc) {
        System.out.println("Enter a string binary: ");
        String binary = sc.nextLine();
        if (binaryToDecimal(binary) == -1) {
            System.out.println("error: invalid binary string " + binary);
        } else {
            System.out.println("The equivalent decimal number for binary " + binary + " is " + binaryToDecimal(binary));
        }
    }

    public static boolean isHexString(String hexString) {
        char[] charArray = hexString.toCharArray();
        for (char c : charArray) {
            if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F'))) {
                return false;
            }
        }
        return true;
    }

    public static void testHexString(Scanner sc) {
        System.out.println("Enter a hex string: ");
        String hexString = sc.nextLine();
        if (isHexString(hexString)) {
            System.out.println(hexString + " is a hex string");
        } else {
            System.out.println(hexString + " is NOT a hex string");
        }
    }

    public static int hexadecimalToDecimal(String hexString) {
        if (!isHexString(hexString)) {
            return -1;
        }
        String[] arrayHexString = hexString.toLowerCase().split("");
        for (int i = 0; i < arrayHexString.length; i++) {
            if (arrayHexString[i].equals("a")) {
                arrayHexString[i] = "10";
            } else if (arrayHexString[i].equals("b")) {
                arrayHexString[i] = "11";
            } else if (arrayHexString[i].equals("c")) {
                arrayHexString[i] = "12";
            } else if (arrayHexString[i].equals("d")) {
                arrayHexString[i] = "13";
            } else if (arrayHexString[i].equals("e")) {
                arrayHexString[i] = "14";
            } else if (arrayHexString[i].equals("f")) {
                arrayHexString[i] = "15";
            }
        }
        int decimalNumber = 0;
        int temp = 1;
        for (int i = arrayHexString.length - 1; i >= 0; i--) {
            decimalNumber += Integer.parseInt(arrayHexString[i]) * temp;
            temp *= 16;
        }
        return decimalNumber;
    }

    public static void testHexadecimalToDecimal(Scanner sc) {
        System.out.println("Enter a hexa string: ");
        String hexStr = sc.nextLine();
        if (hexadecimalToDecimal(hexStr) == -1) {
            System.out.println("error: invalid hexa string " + hexStr);
        } else {
            System.out.println(
                    "The equivalent decimal number for hexadecimal " + hexStr + " is " + hexadecimalToDecimal(hexStr));
        }
    }

    public static int octalToDecimal(String octalStr) {
        String[] octalStringArray = octalStr.split("");
        for (int i = 0; i < octalStringArray.length; i++) {
            if (!(Integer.parseInt(octalStringArray[i]) <= 7 && Integer.parseInt(octalStringArray[i]) >= 0)) {
                return -1;
            }
        }
        int decimalNumber = 0;
        int temp = 1;
        for (int i = octalStringArray.length - 1; i >= 0; i--) {
            decimalNumber += Integer.parseInt(octalStringArray[i]) * temp;
            temp *= 8;
        }
        return decimalNumber;
    }

    public static void testOctalToDecimal(Scanner sc) {
        System.out.println("Enter an octal string: ");
        String octalString = sc.nextLine();
        if (octalToDecimal(octalString) == -1) {
            System.out.println("error: invalid octal string " + octalString);
        } else {
            System.out.println(
                    "The equivalent decimal number for octal " + octalString + " is " + octalToDecimal(octalString));
        }
    }

    public static int radixNToDecimal(String radixNStr, int radix) {
        String[] radixNStrArray = radixNStr.trim().toLowerCase().split("");
        for (int i = 0; i < radixNStrArray.length; i++) {
            if (radixNStrArray[i].equals("a")) {
                radixNStrArray[i] = "10";
            } else if (radixNStrArray[i].equals("b")) {
                radixNStrArray[i] = "11";
            } else if (radixNStrArray[i].equals("c")) {
                radixNStrArray[i] = "12";
            } else if (radixNStrArray[i].equals("d")) {
                radixNStrArray[i] = "13";
            } else if (radixNStrArray[i].equals("e")) {
                radixNStrArray[i] = "14";
            } else if (radixNStrArray[i].equals("f")) {
                radixNStrArray[i] = "15";
            }
        }
        int decimalNumber = 0;
        int temp = 1;
        for (int i = radixNStrArray.length - 1; i >= 0; i--) {
            decimalNumber += Integer.parseInt(radixNStrArray[i]) * temp;
            temp *= radix;
        }
        return decimalNumber;
    }

    public static void testRadixNToDecimal(Scanner sc) {
        System.out.println("Enter the radix: ");
        int radix = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the string: ");
        String radixNStr = sc.nextLine();
        System.out.println("The equivalent decimal number " + radixNStr + " is " + radixNToDecimal(radixNStr, radix));
    }

    public static int binaryToStringUseHorcner(int[] binaryString, int radix) {
        int polyValue = 0;
        for (int i = 0; i < binaryString.length; i++) {
            polyValue = polyValue * radix + binaryString[i];
        }
        return polyValue;
    }
}