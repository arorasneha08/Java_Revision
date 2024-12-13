public class PhoneKeypad {
    public static void combination(String digit , String[] kp , String res){
        if(digit.length() == 0){
            System.out.println(res);
            return ; 
        }
        int currNum = digit.charAt(0) - '0'; 
        String currChoices = kp[currNum] ;
        for(int i = 0 ; i< currChoices.length() ; i++){
            combination(digit.substring(1), kp, res + currChoices.charAt(i));
        }

    }
    public static void main(String[] args) {
        String s = "23" ; 
        String[] kp = {"" , "" , "abc" , "def" , "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
        combination(s, kp, "");
    }
}
