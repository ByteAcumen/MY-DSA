public class IsomorphicStrings {

    static boolean isomorphicString(String s , String t){
        if(s.length() != t.length()) return false;
        int n = s.length();
        for(int i = 0 ; i < n ;i++){
            for(int j = i+1; j < n; j++){
                if(s.charAt(i) == s.charAt(j)){
                    if(t.charAt(i) != t.charAt(j)){
                            return false;
                    }
                }
                if(t.charAt(i) == t.charAt(j)){
                    if(s.charAt(i) != s.charAt(j)){
                        return false;
                    }
                }

            }
        }
        // int[] m1 = new int[256],m2 = new int[256];
        // for(int i = 0 ; i < n ; i++){
        //     if(m1[s.charAt(i)] != m2[t.charAt(i)]){
        //         return false;
        //     }
        //     m1[s.charAt(i)] = i+1;
        //     m2[t.charAt(i)] = i+1;
        // }
        return true;

    }
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        boolean res = isomorphicString(s,t);
        System.out.println("is isomorphic :" + res);
    }
}
