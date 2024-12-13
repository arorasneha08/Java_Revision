import java.util.ArrayList;

public class FindAllOccurElem {
    public static void find(int arr[] , int target , int index ){
        if(index == arr.length){
            return ; 
        }
        if(arr[index] == target){
            System.out.print(index + " ");
        }
        find(arr, target, index+1);
    }
    public static ArrayList<Integer> find2(int arr[] , int target , int index, ArrayList<Integer> ans ){
        if(index == arr.length) return new ArrayList<>() ; 
        if(arr[index] == target) {
            ans.add(index); 
        } 
        find2(arr, target, index+1, ans);
        return ans ; 
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,5,1,2,2};
        int target = 2 ;
        // find(arr, target, 0);
        ArrayList<Integer> ans = new ArrayList<>(); 
        ans = find2(arr, target , 0 , ans); 
        for(int num : ans){
            System.out.println(num);
        }
    }
}
 