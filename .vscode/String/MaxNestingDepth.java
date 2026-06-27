public class MaxNestingDepth {

    public static int maxNestingDepth(String s){
        int maxDepth = 0;
        int currDepth = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                currDepth++;
                maxDepth = Math.max(maxDepth, currDepth);
            }else if(ch == ')'){
                currDepth--;
            }
        }
        return maxDepth;
    }
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int res = maxNestingDepth(s);
        System.out.println("The maximum nesting depth is : "+res);
    }
}