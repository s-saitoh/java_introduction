
public class JSample1_1 {
	public static void main(String args[]) {
		int sum;
		
		sum = 0;
		for (int i = 1; i <= 100; i ++) {
			sum += i;
		}
		
		System.out.println("sum = " + sum);
		
		sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += 1;
			
			if (sum > 100) {
				break;
			}
		}
		
		System.out.println("sum = " + sum);
	}
}
