import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Informe um ano que possua 4 digitos: ");	
	int ano = scan.nextInt();
	while(ano < 1000 || ano > 9999) {
		System.out.println("Informe um numero v�lido: ");
		ano = scan.nextInt();
	}
	
	if(ano % 4 == 0) {
		System.out.println("Esse ano � bissexto!");
	}
	else {
		System.out.println("Esse ano nao � bissexto!");
	}
		scan.close();
	}

}
