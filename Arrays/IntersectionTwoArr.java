import java.util.*; 

class IntersectionTwoArr {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] arr = new int[list.size()];
        for (int num : list) {
            arr[k++] = num;
        }
        return arr; 
    }
}

// leetcode 350 

class intersectionTwoArr {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length; 
        int n2 = nums2.length ;
        Arrays.sort(nums1);
        Arrays.sort(nums2); 
        ArrayList<Integer> ans = new ArrayList<>(); 
        int i = 0; 
        int j = 0 ; 
        while(i < n1 && j < n2){
            if(nums1[i] == nums2[j]){
                if(ans.isEmpty() || ans.get(ans.size()-1) != nums1[i]){
                    ans.add(nums1[i]); 
                }
                i++ ;
                j++ ;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else {
                j++;
            }
        } 
        int result[] = new int[ans.size()];
        for(int k = 0; k<ans.size() ; k++){
            result[k] = ans.get(k); 
        }
        return result; 
    }
}

// leetcode 349 