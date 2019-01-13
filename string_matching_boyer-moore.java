import java.util.HashMap;
import java.util.Scanner;
 
public class Solution {
    
    public static String Text;
    public static String Pattern;
 
    private final static int SIZE = 256;
    private static int lastOccurrence[] = new int[SIZE];
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        getText();
        getPattern();
        
        // 이곳에 함수명을 변경하여 사용한다.
        long startTime = System.nanoTime();
        System.out.println(BoyerMoore(Text,Pattern));
        long endTime = System.nanoTime();
        
        System.out.println("Time :"+(endTime - startTime));
    }
    
    private void buildIndex(String pattern) {
        
        int length = pattern.length();
        
        for (int i = 0; i < SIZE; i++)
            lastOccurrence[i] = -1;
        
        for (int i = 0; i < length; i++)
            lastOccurrence[pattern.charAt(i)] = i;
    }
    
    private static int findLast(char aChar) {
        
        return lastOccurrence[aChar];
    }
    
    // 알고리즘이 작성 되는 부분
    public static int BoyerMoore(String text, String pattern){
        
        int start = pattern.length() - 1;
        int end = text.length();
        int position, j;
        
        // search from left to right
        while (start < end) {
            
            position = start;
            
            for (j = pattern.length() - 1; j >= 0; j--) {
                
                // if not match a character
                if (pattern.charAt(j) != text.charAt(position)) {
                    
                    // check the last occurrence index
                    if (findLast(text.charAt(position)) != -1) {
                        
                        if (j - findLast(text.charAt(position)) > 0)
                            // case 1
                            start += j - findLast(text.charAt(position));
                        else
                            // case 2
                            start += 1;
                        
                    } else {
                        
                        // case 3
                        start += j + 1;
                    }
                    
                    break;
                }
                
                if (j == 0) {
                    
                    // found pattern
                    return position;
                }
                
                position--;
            }
        }
        
        // not found
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
