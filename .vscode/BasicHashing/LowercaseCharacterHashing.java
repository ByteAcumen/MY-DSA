import java.util.*;

public class LowercaseCharacterHashing {
    public static void main(String[] args) {
        String s = "abcdabefc";

        int[] hash = new int[26];

        for (char c : s.toCharArray()) {
            hash[c - 'a']++;
        }

        char[] queries = {'a', 'c', 'z'};
        for (char q : queries) {
            System.out.println(q + " → " + hash[q - 'a']);
        }
    }
}
