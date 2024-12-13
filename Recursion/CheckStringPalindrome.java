public class CheckStringPalindrome {
    public static boolean checkPalindrome(String s, int n, int i ){
        if(i >= n/2) return true; 
        if(s.charAt(i) != s.charAt(n-i-1)){
            return false ; 
        }
        return checkPalindrome(s, n , i+1); 
    }

    // method 2 :- 
    public static String reverse(String s , int index){
        if(index == s.length()){
            return "" ; 
        }
        String smallAns  = reverse(s, index+1);
        return smallAns + s.charAt(index); 
    }

    // method 3 
    public static boolean checkPalindrome2(String s , int left , int right){
        if(left >= right) return true ; 
        return (s.charAt(left) == s.charAt(right) && (checkPalindrome(s, left + 1, right - 1))); 
    }

    public static void main(String[] args) {
        String str = "level";
        int n = str.length(); 
        System.out.println(checkPalindrome(str, n, 0 ));

        // method 2 
        String reev = reverse(str, 0); 
        if(reev.equals(str)){
            System.out.println("Palindrome string");
        }
        else{
            System.out.println("Not palindrome ");
        } 

        System.out.println(checkPalindrome2(str, 0, n-1));
    }
}
