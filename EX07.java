import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float pideal = 0;

		System.out.println("Informe a altura: ");
		float h = scan.nextFloat();

		System.out.println("Informe o peso: ");
		float p = scan.nextFloat();

		System.out.println("Informe o sexo: M ou F ");
		String s = scan.nextLine();

		System.out.println("Seu peso �: " + p);
		System.out.println("Sua altura � : " + h);
		System.out.println("Seu sexo � " + s);

		if (s.equals("m")) {
			pideal = (float) ((72.7 * h) - 58);
		} else if (s.equals("f")) {
			pideal = (float) ((62.1 * h) - 44.7);
		} else if (p > pideal) {
			System.out.println("Voc� esta acima do peso");
		} else if (p < pideal) {
			System.out.println("Voc� est� abaixo do peso");
		}
		System.out.println("Seu peso ideal � : " + pideal);

		scan.close();
	}

}
