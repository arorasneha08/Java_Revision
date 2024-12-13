import java.util.ArrayList;

public class RepeatingMissingNum {
    ArrayList<Integer> findTwoElement(int arr[]) {
        
        // brute force approach :-
        
        // int n = arr.length;
        // ArrayList<Integer> ans = new ArrayList<>();
        // int repeating = -1;
        // int missing = -1;
        // int count = 0; 
        // for(int i = 1; i<= n ; i++){
        //     count = 0 ; 
        //     for(int j = 0; j<n ; j++){
        //         if(arr[j] == i)count ++ ;
        //     }
        //     if(count == 2) repeating = i; 
        //     else if(count == 0) missing = i; 
        // }
        // ans.add(repeating);
        // ans.add(missing);
        // return ans ;
        
        // using hashmaps 
        
        // int n = arr.length;
        // ArrayList<Integer> ans = new ArrayList<>();
        // int repeating = -1;
        // int missing = -1; 
        // int count = 0 ; 
        // int mpp[] = new int[n+1];
        // for(int i = 0; i<n ; i++){
        //     mpp[arr[i]]++;
        // }
        // for(int i = 1; i <= n ; i++){
        //     if(mpp[i] == 2) repeating = i ; 
        //     else if(mpp[i] == 0) missing = i ;
        // }
        // ans.add(repeating ); 
        // ans.add(missing); 
        // return ans; 
        
        // using the math problem 
        int naturalSum = 0, arrSum = 0, arrSqSum = 0, squareSum= 0,x,y,val1,val2;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1;i<=arr.length;i++){
            naturalSum += i;
            squareSum += (i*i);
        }
        for(int a:arr){
            arrSum += a;
            arrSqSum += (a*a);
        }
        val1 = arrSum - naturalSum;
        val2 = (arrSqSum - squareSum)/val1;
        x = (val2 + val1)/2;
        y = val2 - x;
        ans.add(x);
        ans.add(y);
        return ans ; 
        
        
    }
    class Solution {
        public int[] findErrorNums(int[] nums) {
            int n = nums.length ;
            int xor = 0 ; 
            for(int i = 0 ; i<n ; i++){
                xor ^= nums[i] ; 
                xor ^= (i+1); 
            }
            int bitNumber = 0 ;
            while(true){
                if((xor & (1 << bitNumber))!=0){
                    break; 
                }
                bitNumber ++; 
            }
            int zero = 0 ;
            int one = 0 ; 
            for(int i = 0 ; i<n ; i++){
                if((nums[i] & (1 << bitNumber)) != 0){
                    one ^= nums[i]; 
                }
                else{
                    zero ^= nums[i]; 
                }
            }
            for(int i = 1; i<= n ; i++){
                if((i & (1 << bitNumber))!=0){
                    one ^= i ; 
                }
                else{
                    zero ^= i ;
                }
            }
            int count = 0 ;
            for(int i = 0 ; i<n ; i++){
                if(nums[i] == zero) count ++ ; 
            }
            if(count == 2) return new int[]{zero , one};
            return new int[]{one , zero}; 
        }
    }
}

// leetcode  645 