import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um n�mero: ");
        int num1 = scan.nextInt();

        System.out.print("Digite outro n�mero: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num1);
        } else if (num2 > num1) {
                System.out.println(num2);}   
              else {
                System.out.println("S�o iguais");
            }

    }


}