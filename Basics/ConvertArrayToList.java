import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1); 
        ans.add(3); 
        ans.add(2); 
        Integer arr[] = new Integer[ans.size()] ; 
        ans.toArray(arr);
        for(int i = 0 ; i<ans.size() ; i++){
            System.out.println(arr[i]);
        }


        // convert array to list 
        int arr2[] = {1,2,3,4,5};
        Arrays.asList(arr2);
        for(int num : arr2){
            System.out.println(num);
        } 
    }
}
