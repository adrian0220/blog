import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int Answer=0;
        
        for(int i=1; i<=N; i++){
            Answer+=i;
        }
 
        System.out.println(Answer);
        
    }
 
 
}
