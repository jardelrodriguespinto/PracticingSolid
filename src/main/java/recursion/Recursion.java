package recursion;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Recursion {

    public static int sumOfDigits(int[] arr, int arrayLength){
        if (arrayLength == 0)
            return 0;

        return arr[arrayLength  - 1] + sumOfDigits(arr, arrayLength - 1);
    }

    public static List<Character> commonChars(String[] words) {

        Set<Character> commonChars = new HashSet<>();

        // Iterar sobre cada palavra
        for (String word : words) {
            // Converter a palavra em um conjunto de caracteres únicos
            Set<Character> chars = new HashSet<>();
            for (char c : word.toCharArray()) {
                chars.add(c);
            }

            if (chars.size() > commonChars.size())
                commonChars = chars;
            else if (chars.size() == commonChars.size())
                commonChars.retainAll(chars);
        }

        return commonChars.stream().toList();
    }

    public static String reverse(String str, int strLength) {
        if (strLength == 0)
            return "";

        return  String.valueOf(str.charAt(strLength - 1)) + reverse(str, strLength - 1);
    }

    public static boolean isPalindrome(String str, int strLength) {
        if (strLength == 0)
            return true;

        return  String.valueOf(str.charAt(strLength - 1)).equals(reverse(str, strLength - 1));
    }
}
