import java.util.Arrays;

public class MergeArrayGapAlgo{
    public static void mergeTwoSortedArraysWithoutExtraSpaces(long []a, long []b){
        int n1 = a.length ;
        int n2 = b.length ;
        int left = n1-1; 
        int right = 0 ;
        while(left >= 0 && right < n2){
            if(a[left] > b[right]){
                long temp = a[left];
                a[left] = b[right];
                b[right]= temp;
                left -- ;
                right ++ ;
            }
            else{
                break; 
            }
        }
        Arrays.sort(a);
        Arrays.sort(b); 
    }

    // optimised approach 

    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){

        int n1 = a.length ;
        int n2 = b.length; 
        int len = n1 + n2 ;
        int gap = (len / 2) + (len % 2);

        while(gap > 0){
            int left = 0 ;
            int right = left + gap ;

            while(right < len){
                // left pointer in the a and right pointer in b 
                if(left < n1 && right >= n1){
                    if(a[left] > b[right - n1]){
                        long temp = a[left];
                        a[left] = b[right - n1];
                        b[right- n1] = temp;
                    }
                }
                // both the left and right pointer in the b array 
                // agar left b main hai toh right bhi b main hi hoga 
                else if(left >= n1 ){
                    if(b[left- n1]> b[right- n1]){
                        long temp = b[left- n1];
                        b[left - n1] = b[right- n1];
                        b[right- n1] = temp ;
                    }
                }
                // both the left and right are in the a array 
                else { 
                    if(a[left] >a[right]){
                        long temp = a[left]; 
                        a[left]= a[right];
                        a[right] = temp; 
                    }
                }
                left ++ ;
                right ++ ; 
            }
            if(gap == 1) break ; 
            gap = (gap / 2) + (gap % 2); 
        }
        
    }
}

