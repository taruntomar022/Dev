import java.io.*;
import java.util.*;

public class ClimbStairVariable {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] step = new int[n];
        for(int i=0;i<n;i++){
            step[i] = sc.nextInt();
        }
        System.out.println(climbStairs(step,0,new int[n]));
    }
    
    public static int climbStairs(int step[],int n,int dp[]){
        int target = step.length-1;
        if(n==target){
            return 1;
        }
        if(dp[n] !=0){
            return dp[n];
        }
        int maximumClimb = step[n];
        int totalways = 0;
        for(int i = 1;i<=maximumClimb && n+i <=target;i++){
            totalways += climbStairs(step,n+i,dp);
            
        }
        dp[n] = totalways;
        return totalways;
    }

}