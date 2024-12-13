public class decimalToBinaryConversion {
    public static void main(String[] args) {
        int n = 12;
        long ans = 0; 
        long place = 1; 

        while (n != 0) {
            long r = n % 2;
            ans += r * place; 
            n /= 2;
            place *= 10; 
        }
        System.out.println(ans); 
    }
}
