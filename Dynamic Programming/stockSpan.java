import java.util.*;

public class stockSpan {
    public static void main(String[] args) {

        
    }
    public static int[] solve(int[] arr){
        // solve
        int span[]=new int[arr.length];
         Stack<Integer> st = new Stack<>();
          st.push(0);
          arr[0]=1;
         for(int i = 2;i<arr.length;i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                span[i] = i+1;
            }else{
                span[i] = i-st.peek();
            }
         }
        return span;
      }
}