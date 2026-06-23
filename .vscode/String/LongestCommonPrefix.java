public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        // String first = strs[0];
        // for(int i = 0; i < first.length(); i++){
        //     char ch = first.charAt(i);
        //     for(int j = 1; j < strs.length; j++){
        //         if(i == strs[j].length() || strs[j].charAt(i)!= ch){
        //             return first.substring(0,i);
        //         }
        //     }
        // }
        // return first;
        String first = strs[0];
        String last = strs[strs.length -1];
        int i = 0;
        while(i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)){
            i++;
        }
        return first.substring(0, i);   
    }
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String prefix = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + prefix);
    }
}