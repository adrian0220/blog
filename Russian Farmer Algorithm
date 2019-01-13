public class Solution {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        System.out.println(alarusee(N,M));
 
    }
    
    public static int alarusee(int a, int b){
        int result=0;
        int c = b;
        
        while(a!=1){
            if(a%2==1){
                result+=c;
            }
            c+=c;
            a/=2;
        }
        
        result+=c;
        
        return result;
    }
 
}
