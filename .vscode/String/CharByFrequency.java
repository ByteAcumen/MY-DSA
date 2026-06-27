import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CharByFrequency {

    public static String charByFrequency(String s){

        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        StringBuilder ans = new StringBuilder();
        for(char ch : list){
            for(int i = 0; i < map.get(ch); i++){
                ans.append(ch);
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        String res = charByFrequency(s);
        System.out.println(res);
    } 
}
