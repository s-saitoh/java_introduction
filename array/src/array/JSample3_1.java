package array;

public class JSample3_1 {
	public static void main(String args[]) {
		int n[];
		int m[];
		
		n = new int[2];
		System.out.println(n);
		
		n[0] = 10;
		
		m = n;
		System.out.println(m);
		System.out.println("n[0] = " + n[0]);
		System.out.println("m[0] = " + m[0]);
	}
}
