import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacterByFrequency {
    class Solution {
    public String frequencySort(String s) {

        HashMap<Character , Integer> mpp = new HashMap<>();
        int n = s.length() ;
        for(int i = 0 ; i<n ; i++){
            mpp.put(s.charAt(i) , mpp.getOrDefault(s.charAt(i) , 0)+1);
        }

        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(mpp.entrySet());
        entryList.sort((a,b) -> b.getValue() - a.getValue());

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : entryList) {
            char character = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                result.append(character);
            }
        } 
        return result.toString(); 
    }
}
}

// leetcode 451