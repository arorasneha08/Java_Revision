import java.util.ArrayList;

public class LastIndexArr {
    public static int findLast(int arr[] , int index , ArrayList<Integer> ans, int target){
        if(index == arr.length){
            if(ans.isEmpty()){
                return -1; 
            }
            return ans.get(ans.size()-1); 
        }
        if(arr[index] == target){
            ans.add(index); 
        }
        return findLast(arr, index + 1, ans, target);
    }
    public static int findLast2(int arr[] , int index ,  int target){
        if(index < 0){
            return -1;  
        }
        if(arr[index] == target){
            return index ; 
        }
        return findLast2(arr, index + 1, target); 
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1,5,2};
        int target = 2 ;
        ArrayList<Integer> ans = new ArrayList<>();
        int x = findLast(arr , 0, ans, target); 
        System.out.println(x);

        int y = findLast2(arr, arr.length-1, target); 
        System.out.println(y);
    }
}
