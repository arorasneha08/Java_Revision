public class RemoveOccurChar {
    public static String removeChar(String s, char target){
        // base condition 
        if(s.length() == 0){
            return "" ;
        }
        // receursive work 
        String smallAns = removeChar(s.substring(1), target);
        char currChar = s.charAt(0);
        if(currChar != target){
            return currChar + smallAns ; 
        }
        return smallAns; 
    }
    public static String removeOccr(String str ,char target, int index){
        // base case 
        if(index == str.length()){
            return ""  ; 
        }
        // recursive work 
        String smallAns = removeOccr(str, target, index+1); 

        //self work 
        if(str.charAt(index) != target){
            return str.charAt(index) + smallAns ; 
        }
        return smallAns;  
    }
    public static void main(String[] args) {
        String str = "abcabc"; 
        char target = 'c' ; 
        String ans = removeOccr(str, target , 0); 
        System.out.println(ans);

        String res = removeChar(str, target);
        System.out.println(res) ;
    }
}