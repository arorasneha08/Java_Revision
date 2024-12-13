public class ReverseString {
    public static String reverse2(String str , int index){
        if(index == str.length()){
            return "" ; 
        }
        String smallAns = reverse2(str, index+1);
        return smallAns + str.charAt(index); 
    }

    public static String reverse(String str){
        if(str.length() == 0){ 
            return "" ; 
        }
        String smallAns = reverse(str.substring(1));
        char currChar = str.charAt(0);
        return smallAns + currChar ; 
    }

    public static void main(String[] args) {
        String str = "Sneha"; 
        System.out.println(reverse(str));
        System.out.println(reverse2(str, 0));
    }
}
