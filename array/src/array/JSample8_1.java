package array;

public class JSample8_1 {
	public static void main(String args[]) {
		int seiseki[][] = {
			{68, 82, 92},
			{76, 33, 83},
			{92, 45, 38}
		};
		
		String kurasu[] = {"Aクラス", "Bクラス", "Cクラス"};
		
		for (int i = 0; i < 3; i++) {
			System.out.println(kurasu[i] + "の成績");
			
			for (int j = 0; j < 3; j++) {
				System.out.println(seiseki[i][j]);
			}
		}
	}
}
