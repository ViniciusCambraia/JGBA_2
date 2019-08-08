import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		 System.out.println("Digite um numero: ");
		 int num = new Scanner (System.in).nextInt();
		  
		 if (num > 0) {
			 System.out.println("O numero positivo");
		 } 
		 else if (num < 0) {
			 System.out.println("O numero é negativo");
		 }
		 else {
			 System.out.println("O número é 0");
		 }
		 
				 

	}

}
