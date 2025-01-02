public class KokoEatingBananas {
    class Solution {
        private static int max(int arr[]){
            int max = 0 ;
            for(int i = 0 ; i<arr.length ; i++){
                if(arr[i] > max){
                    max = arr[i]; 
                }
            }
            return max ;
        }
        private static int calculateHrs(int arr[], int mid ){ 
            int totalhrs = 0 ; 
            for(int i = 0 ; i<arr.length ; i++){
                totalhrs += Math.ceil((double)arr[i] / mid); 
            }
            return totalhrs ; 
        }
        public int minEatingSpeed(int[] piles, int h) {
            int start = 1 ;
            int end = max(piles);
            int ans = 0; 
            while(start <= end){
                int mid = start + (end - start)/2;
                int totalHrs = calculateHrs(piles, mid);
                if(totalHrs <= h){
                    ans = mid ; 
                    end = mid - 1 ;
                } 
                else{
                    start = mid + 1 ; 
                }
            }
            return ans ; 
        }
    }
}
