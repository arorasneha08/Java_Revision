public class ReverseBits{
    
public class Solution {
	public static long reverseBits(long n) {
		long result = 0 ;
		for(int i = 0 ; i<32 ; i++){
			long bit = n & 1 ; 
			result =( result << 1) | bit ;
			n = n >> 1 ; 
		}
		return result ; 
	}
}

}