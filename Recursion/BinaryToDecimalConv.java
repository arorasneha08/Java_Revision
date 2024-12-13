public class BinaryToDecimalConv {
    public static void main(String[] args) {
        int n = 1100; 
        int ans = 0; 
        int i = 0;   

        while (n != 0) {
            int r = n % 10;  
            ans += r * Math.pow(2, i); 
            n = n / 10;    
            i++;                
        }

        System.out.println(ans);
    }
}
