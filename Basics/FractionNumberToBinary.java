public class FractionNumberToBinary {
public class Solution {
	public static String toBinaryCalculator(double num) {
		if(num <= 0 || num >= 1){
			return "ERROR"; 
		}
		StringBuilder binary = new StringBuilder("0.");
		while(num > 0){
			num = num * 2 ; 
			if(binary.length()>= 34){
				return "ERROR"; 
			}
			if(num > 1){
				binary.append("1");
				num -= 1 ; 
			}
			else{
				binary.append("0"); 
			}
		}
		return binary.toString();
	}
}
}

// code 360 ninja calculator 