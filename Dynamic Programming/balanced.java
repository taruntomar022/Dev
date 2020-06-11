import java.util.*;


public class balanced {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String exp = sc.nextLine();

        System.out.println(balancedBrac(exp));
    }

    public static boolean balancedBrac(String exp) {
        Stack<Character> st = new Stack<>();
        int c =0;
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);

            if(ch =='('||ch=='{'||ch=='['){
                st.push(ch);
            }else if(ch == ')'){
                if( st.size()==0 || st.peek() != '(' ){
                    return false;
                }else{
                    st.pop();
                }
            }else if(ch=='}'){
                if( st.size()==0 || st.peek() != '{' ){
                    return false;
                }else{
                    st.pop();
                }   
            }else if(ch==']'){
                if( st.size()==0 || st.peek() != '[' ){
                    return false;
                }else{
                    st.pop();
                }   
            }
        }
        return st.size()==0;
        
    }
}