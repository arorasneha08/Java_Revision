import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class PhoneKeypadCheckContains {

public class Solution {
    public static void generateSub(String digit, String phoneKeys[], int index, StringBuilder str , ArrayList<String> subseq){
        if(index == digit.length()){
            subseq.add(str.toString()); 
            return ; 
        }
        int dig = digit.charAt(index); 
        int letter = dig - '0';
        String string = phoneKeys[letter]; 
        for(int i = 0; i<string.length() ; i++){
            str.append(string.charAt(i)); 
            generateSub(digit, phoneKeys, index+1, str, subseq);
            str.deleteCharAt(str.length()-1); 
        } 
    }
	public static ArrayList<String> phoneCode(ArrayList<String> Words, String Sequence, int W){
        String phoneKeys[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ArrayList<String> subseq = new ArrayList<>() ; 
        StringBuilder str = new StringBuilder();

        generateSub(Sequence, phoneKeys, 0, str, subseq); 
        ArrayList<String> matchingWords = new ArrayList<>() ; 
        for(String word : Words){
            if(subseq.contains(word)){
                matchingWords.add(word); 
            }
        }
        return matchingWords; 
    }
}
}

// code 360 code phone keypad 