import java.util.Scanner;

public class EX08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float n1;
        float n2;

        System.out.print("Digite a primeira nota:  ");
        n1 = scan.nextFloat();

        System.out.print("Digite a segunda nota:  ");
        n2 = scan.nextFloat();

        float media = (n1 + n2) / 2;

        if(media >= 7 ) { 
            System.out.println("Aprovado");

        }else { 
                System.out.println("Reprovado");
        }
        scan.close();
    }
}