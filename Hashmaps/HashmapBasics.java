// import java.util.HashMap;
// import java.util.Map;

// public class HashmapBasics {

//     public static void main(String[] args) {
//         HashMap<Integer , String> mpp = new HashMap<>();

//         // inserting values in a hashmap : 
//         mpp.put(1, "Sneha");
//         mpp.put(2, "ashay");
//         mpp.put(3 , "ravleen");
//         mpp.put(4, "Ayush");
//         System.out.println(mpp); // {1=Sneha, 2=ashay, 3=ravleen, 4=Ayush}

//         // updating value in a hashmap :- 
//         mpp.put(2 , "Kashish");
//         System.out.println(mpp); // {1=Sneha, 2=Kashish, 3=ravleen, 4=Ayush}

//         // accessing the values 
//         System.out.println(mpp.get(3)); // ravleen

//         // check if the key exists 
//         System.out.println(mpp.containsKey(1)); // true
//         System.out.println(mpp.containsKey(5)); // false

//         // if the value is not present in the array then we can use this method 
//         System.out.println(mpp.getOrDefault(5, "Not present"));

//         // replace the values 
//         mpp.replace(2, "Sneha") ;
//         System.out.println(mpp); // {1=Sneha, 2=Sneha, 3=ravleen, 4=Ayush}

//         // printing the values of the map 
//         for(Map.Entry<Integer, String> entry : mpp.entrySet()){
//             System.out.print(entry.getKey() + " ");
//             System.out.println(entry.getValue());
//         }

//         for(Integer key : mpp.keySet()){
//             System.out.println("Key : " + key);
//             System.out.println("Value : " + mpp.get(key));
//         }



//     }
// }

// Implementing the hashmap class

import java.util.HashMap;
import java.util.Objects;

public class HashmapBasics{
    static class MyCollege{
        private int hashcode ; 
        int regNo ; 
        MyCollege(int regNo){
            this.regNo = regNo; 
            this.hashcode = Objects.hashCode(regNo); 
        }
        @Override
        public int hashCode(){
            return hashcode ;
        }
        @Override
        public boolean equals(Object obj){
            MyCollege college = (MyCollege) obj ; 
            return this.regNo == college.regNo; 
        }
    }
    static class MyRanking{
        int rank ;
        MyRanking(int rank){
            this.rank = rank ; 
        }
        @Override
        public String toString(){
            return "" + this.rank ; 
        }
        @Override
        public boolean equals(Object obj){
            MyRanking r = (MyRanking) obj ;
            return this.rank == r.rank; 
        }
    }
    public static void main(String[] args) {
        HashMap<Integer , Integer> collegeRankingMpp = new HashMap<>(); 
        collegeRankingMpp.put(111, 1);
        collegeRankingMpp.put(312 , 2) ;
        collegeRankingMpp.put(432, 3);
        System.out.println(collegeRankingMpp.get(111));


        HashMap<MyCollege , MyRanking> collegeRankingMpp2 = new HashMap<>(); 
        collegeRankingMpp2.put(new MyCollege(111), new MyRanking(1)); 
        collegeRankingMpp2.put(new MyCollege(312), new MyRanking(2)) ;
        collegeRankingMpp2.put(new MyCollege(567), new MyRanking(3));
        System.out.println(collegeRankingMpp2.get(new MyCollege(111)));
    }
}