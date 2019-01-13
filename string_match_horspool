import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;
 
public class Solution {
    
    public static String Text;
    public static String Pattern;
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        getText();
        getPattern();
        
        // 이곳에 함수명을 변경하여 사용한다.\ 
        long startTime = System.nanoTime();
        System.out.println(Hospool(Text, Pattern));
        long endTime = System.nanoTime();
        
        System.out.println("Time :"+(endTime - startTime));
    }
    
    // 알고리즘이 작성 되는 부분
    public static int Hospool(String text, String pattern){
        
        HashMap<Character, Integer> hashmap = getShifttable(pattern);
        
        int textLength = text.length();
        int patternLength = pattern.length();
        
        int i, j;
        Integer shift;
        for (i = patternLength - 1; i < textLength; shift =hashmap.get(text.charAt(i)),  i += shift != null? shift: patternLength ) {
            for (j = 0; (j < patternLength) && (text.charAt(i - j) == pattern.charAt(patternLength - 1 - j)); j++) ;
            if (j == patternLength)
                return i - patternLength + 1;
        }
        return -1;
        
    }
    
    private static HashMap<Character, Integer> getShifttable(String pattern) {
        // TODO Auto-generated method stub
        HashMap<Character, Integer> hashmap = new HashMap<>();
        int len = pattern.length();
        for (int i = 0; i < len - 1; i++)
            hashmap.put(pattern.charAt(i), len - 1 - i);
        
        return hashmap;
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
