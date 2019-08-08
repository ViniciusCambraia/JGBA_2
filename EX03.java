import java.util.Scanner;

public class EX03 {
	

	public static void main(String[] args) {
		
		System.out.println("Digite m ou f: ");
		String scan = new Scanner(System.in).nextLine();
		
		switch (scan) {
		
		case "m":
			System.out.println("Masculino");
			break;
		
		case "f":
			System.out.println("Feminino");
			break;
		
		}
		
	
	}

}
