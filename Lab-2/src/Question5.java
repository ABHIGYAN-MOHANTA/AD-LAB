
public class Question5 {
	public static int gcd(int a, int b) {
		if(a%b==0) {
			return b;
		}
		if(b>a) {
			return gcd(b-a, a);
		}else {
			return gcd(a-b, b);
		}
	}
	public static void main(String[] args) {
		int a = 170;
		int b = 51;
		System.out.println("GCD of "+ a + " & " + b + " is: " + gcd(a,b));
	}
}
