import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um n�mero: ");
		int num = scan.nextInt();
		if (num % 2 == 0) {
			num++;
		}
		System.out.println(num);
		scan.close();
	}
		
	}
