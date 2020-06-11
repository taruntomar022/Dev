import java.util.*;

public class check {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        
        String exp = sc.nextLine();
        
        System.out.print(dupbra(exp));
    }
    
    public static boolean dupbra(String exp){
        Stack<Character> st = new Stack<>();
        
        for(int i = 0;i<exp.length();i++){
            char ch= exp.charAt(i);
            
            if(ch==')'){
                if( st.peek() == '(' ){
                    return true;
                }else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
                
            }else{
                st.push(ch);
            }
        }
        return false;
    }

}
