public class RomanToInteger {
    class Solution {
        public int romanToInt(String s) {
          int ans = 0;
          int[] roman = new int[100];
      
          roman['I'] = 1;
          roman['V'] = 5;
          roman['X'] = 10;
          roman['L'] = 50;
          roman['C'] = 100;
          roman['D'] = 500;
          roman['M'] = 1000;
      
          for (int i = 0; i< s.length()-1; ++i){
            if (roman[s.charAt(i)] < roman[s.charAt(i + 1)])
              ans -= roman[s.charAt(i)];
            else
              ans += roman[s.charAt(i)];
          }
          return ans + roman[s.charAt(s.length() - 1)];
        }
      }
}

// leetcode 13