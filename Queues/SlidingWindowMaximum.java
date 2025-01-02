import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {

        // optimised approach : deque 
        int n = nums.length ;
        int max[] = new int[n-k+1];
        int index = 0 ;
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(!q.isEmpty() && q.peek() == i - k){
                q.poll();
            }
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i >= k-1){
                max[index++] = nums[q.peek()];
            }
        }
        return max ; 
    }
}

// leetcode 239 