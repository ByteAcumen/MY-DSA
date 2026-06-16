public class ReverseWords {

    public String reverseWords(String s) {

        // Brute force
        // String[] words = s.trim().split("\\s+");
        // StringBuilder ans = new StringBuilder();
        // for(int i = words.length -1 ; i >= 0; i--){
        // ans.append(words[i]);
        // if(i != 0){
        // ans.append(" ");
        // }
        // }
        // return ans.toString();

        // Optimal
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0)
                break;

            int j = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            if (ans.length() > 0) {
                ans.append(" ");
            }
            ans.append(s.substring(i + 1, j + 1));
        }
        return ans.toString();
    }

    public static void main(String[] args) {

        String s = "welcome to the jungle";

        ReverseWords obj = new ReverseWords();

        String ans = obj.reverseWords(s);

        System.out.println(ans);
    }
}