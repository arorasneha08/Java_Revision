import java.util.ArrayList;

public class RearrangeMaxMin {
    public static void main(String[] args) {
        int nums[] = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int left = 0 ;
        int right = nums.length-1 ; 
        ArrayList<Integer> ans = new ArrayList<>();
        boolean flag = true ; 
        for(int i = 0; i<nums.length ; i++){
            if(flag){
                ans.add(nums[right]);
                right--; 
            }
            else{
                ans.add(nums[left]);
                left ++ ; 
            }
            flag = !flag ; 
        }
        for(int num : ans){
            System.out.print(num + " ");
        }
    }
}
