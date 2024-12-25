import java.util.Arrays;

public class InsertElemArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        int insert = 4 ;
        int pos = 3; 
        int newArr[] = new int[arr.length+1];
        for(int i = 0; i<pos ; i++){
            newArr[i] = arr[i]; 
        }
        newArr[pos] = insert ; 
        for(int i = pos ; i<arr.length ; i++){
            newArr[i+1] = arr[i]; 
        }
        System.out.println(Arrays.toString(newArr)); 
    }
}
