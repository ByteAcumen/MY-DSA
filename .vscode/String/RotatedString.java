public class RotatedString {

    public static boolean rotatedString(String s , String goal){
        if(s.length() != goal.length()) return false;
        // for(int i = 0 ; i < s.length() ; i++){
        //     String rotated = s.substring(i) + s.substring(0,i);
        //     if(rotated.equals(goal)){
        //         return true;
        //     }
        // }
        // return false;
        String Double = s + s ;
        return Double.contains(goal);
        
    }
    public static void main(String[] args) {
        String s = "rotation";
        String goal = "tationro";
        boolean res = rotatedString(s,goal);
        System.out.println("The string is rotated :" + res);
    }
}
