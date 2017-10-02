import java.util.Scanner; 

class Prorgam{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Mult = 1;   int Sum7   = 0;
		int Num = 0;
		int Digit = 0;
		int Sum = 0;
		Num = scanner.nextInt();
		while (Num != -1) {
			
			Digit = Num;
			while (Digit > 0) {
				Sum = (Digit % 10) + Sum;
				Digit = Digit/10;
			}
			if (Sum % 2 == 0) {
					Mult = Mult * Num;
				}
				Sum = 0;
			if (Num % 10 == 7) {
				Sum7 += Num;
			}
			Num = scanner.nextInt();
		}
		System.out.println(Mult + ", " + Sum7);
	}
}