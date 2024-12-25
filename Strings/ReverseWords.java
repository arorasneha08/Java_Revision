public class ReverseWords {
    class Solution {
        public static void reverse(char str[] , int left , int right){
            while(left < right){
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp ; 
                left ++ ;
                right -- ; 
            }
        }
        public String reverseWords(String s) {
            int n = s.length();
            char[] ch = s.toCharArray(); 
            reverse(ch, 0, n-1) ; 
            StringBuilder str = new StringBuilder(); 
            StringBuilder ans = new StringBuilder(); 
            int i = 0 ; 
            while(i < ch.length){
                if (ch[i] == ' ') {
                    if (ans.length() > 0 && ans.charAt(ans.length() - 1) != ' ') {
                        ans.append(' ');
                    }
                    i++;
                    continue;
                }
                while(i < ch.length && ch[i] != ' '){
                    str.append(ch[i]); 
                    i++; 
                }
                str.reverse(); 
                ans.append(str); 
                str.setLength(0); 
            }
            return ans.toString().trim(); 
        }
    }
}

// leetocde 151 