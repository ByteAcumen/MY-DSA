import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrams {

    public static boolean anagram(String s1 , String s2){

        if(s1.length() != s2.length()) return false;

        // char[] arr1 = s1.toCharArray();
        // char[] arr2 = s2.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // for(int i = 0 ; i < s1.length() ; i++){
        //     if(arr1[i] != arr2[i]){
        //         return false;
        //     }
        // }

        // return true;

        int[] freq = new int[26];
        for(int i = 0 ; i < s1.length(); i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i = 0; i < 26;i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s1 = "cab";
        String s2 = "act";
        boolean res = anagram(s1,s2);
        System.out.println("Is Anagrams : " + res);
    }
    
}
