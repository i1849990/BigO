package cse12pa4student;

public class Mystery {
	public static void mysteryA(int n) {
		int a = 0;
		int i = 0;
		while (i < n) {
			a = i;
			i++;
		}
	}
	public static void mysteryB(int n) {
		int a = 0;
		for(int i = 0; i < n; i += 3) {
			a = i;
		}
	}
	
	public static void mysteryC(int n) {
		int a = 0;
		int i = 0;
		while (i < n) {
			for (int j = n; n > 0; n = n/10) {
				a = i + j;
			}
			i++;
		}
	}

	public static void mysteryD(int n) {
		int a = 0;
		for(int i = 0; i < n; i += 1) {
			for(int j = i; j < n; j += 1) {
				a = i + j;
			}
		}
	}

	public static void mysteryE(int n) {
		int a = 0;
		for(int i = 0; i < n * n; i += 1) {
			for(int j = 0; j <= n; j += 1) {
				a = i + j;
			}
		}
	}

	public static void mysteryF(int n) {
		int k = 1, a = 0;
		for(int i = 0; i < n; i += 1) {
			for(int j = 0; j <= k * 2; j += 1) {
				a = i + j;
			}
			k = k * 2;
		}
	}
}
