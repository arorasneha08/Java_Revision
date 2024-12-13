import java.util.ArrayList;

public class PrintSubsequenceStr {
    public static ArrayList<String> printSub(String str){
        ArrayList<String> ans = new ArrayList<>() ;
        
        if(str.length() == 0){
            ans.add("");
            return ans ;
        }
        ArrayList<String> smallAns = printSub(str.substring(1)); 
        char currChar = str.charAt(0); 
        for(String ss : smallAns){
            ans.add(ss);
            ans.add(currChar + ss) ; 
        }
        return ans ; 
    }

    public static void printSub2(String str, String currAns){
        if(str.length() == 0){
            System.out.println(currAns);
            return ; 
        }
        
        char curr =  str.charAt(0);
        String remString = str.substring(1);

        // current character is  added to the answer string 
        printSub2(remString, currAns + curr);

        // current character is not added to the ans string 
        printSub2(remString, currAns);
    }

    public static void main(String[] args) {
        String str = "abc" ; 
        ArrayList<String> ans = printSub(str); 
        for(int i = 0 ; i<ans.size() ; i++){
            System.out.println(ans.get(i));
        }

        // method 2 :- 
        printSub2(str, "");
    }
}
