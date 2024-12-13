public class GCDNum {
    public static int gcd(int x, int y){
        if(y == 0) return x; 
        return gcd(y, x % y); 
    }
    public static int lcm(int x , int y){
        int lcm = (x*y)/gcd(x, y) ; 
        return lcm ; 
    }
    public static void main(String[] args) {
        int x = 15 ;
        int y = 6 ;
        int hcf = gcd(x,y);  
        System.out.println(hcf);
        int lc = lcm(x, y);
        System.out.println(lc);
    }   
}
