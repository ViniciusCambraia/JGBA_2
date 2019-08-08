import java.util.Scanner;

public class EX19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o 'a' de uma raiz de segundo grau: ");	
	int a = entrada.nextInt();
		if(a != 0) {
			System.out.println("Agora o 'b': ");
			int b = entrada.nextInt();
			System.out.println("Agora o 'c': ");
			int c =entrada.nextInt();
			int delta = b*b - 4*a*c;
			 
				if(delta == 0) {
					System.out.println("A equação possui apenas uma raiz real: "+ -b/2*a );				
				}
				else if(delta > 0) {
					System.out.println("A A equação possui duas raizes reais: "+"\nx1:"+ (-b +Math.sqrt(delta))/2*a  );
					System.out.println("x2: "+(-b - Math.sqrt(delta))/2*a );
				}
				else {
					System.out.println("A equação não possui raizes reais!!\n###########\nEncerrando programa\n###########");
				}
		}
		else {
			System.out.println("A equação não é de 2º grau!!\n###########\nEncerrando programa\n###########");
		}
		entrada.close();

	}

}
