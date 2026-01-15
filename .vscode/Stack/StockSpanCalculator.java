import java.util.Stack;

class StockSpanCalculator {
    public int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n ; i++ ){
            while(!st.isEmpty() && prices[st.peek()] <= prices[i]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i] = i+1;
            }else{
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        
        return span;
    }

    public static void main(String[] args) {
        StockSpanCalculator obj = new StockSpanCalculator();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        
        int[] result = obj.calculateSpan(prices);
        
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
