package array;

public class JSample2_1 {
	public static void main(String args[]) {
		char[] moji;
		moji = new char[2];
		
		moji[0] = 'A';
		moji[1] = '漢';
		
		for (int i = 0; i < 2; i++) {
			System.out.println(moji[i]);
		}
	}
}
