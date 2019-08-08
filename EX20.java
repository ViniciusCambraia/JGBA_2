import java.util.Scanner;

public class EX20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Informe um ano: ");	
	int ano = scan.nextInt();
	
	if(ano % 4 == 0) {
		System.out.println("Esse ano é bissexto!");
	}
	else {
		System.out.println("Esse ano nao é bissexto!");
	}
	scan.close();
	}

}
