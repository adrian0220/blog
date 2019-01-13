import java.util.Scanner;
 
public class Solution {
    
    public static String Text;
    public static String Pattern;
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        getText();
        getPattern();
        
        // 이곳에 함수명을 변경하여 사용한다.
        long startTime = System.nanoTime();
        System.out.println(BruteForce(Text,Pattern));
        long endTime = System.nanoTime();
        
        System.out.println("Time :"+(endTime - startTime));
    }
    
    // 알고리즘이 작성 되는 부분
    public static int BruteForce(String text, String pattern){
        int answer;
        
        // 알고리즘
        for(int i=0;i<(text.length()-pattern.length());i++){
            int j=0;
            while((j<pattern.length())&&text.charAt(i+j)==pattern.charAt(j)){
                j++;
                if(j==pattern.length()){
                    answer=i;
                    return answer;
                }
            }
        }
        return -1;
        
    }
    
    public static void getText(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Text :");
        Text=sc.nextLine();
        System.out.println("Text_length: "+Text.length());    
    }
    
    public static void getPattern(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Pattern :");
        Pattern=sc.nextLine();
        System.out.println("Pattern_length: "+Pattern.length());
    }
 
}
