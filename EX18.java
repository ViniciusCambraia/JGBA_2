import java.util.Scanner;

public class EX18 {

    public static void main(String[] args) {

        Scanner entrada = new  Scanner(System.in);

        System.out.println("Informe o tamanho dos lados de um triângulo");

        System.out.print("Lado 1: ");
        float l1 = entrada.nextFloat();

        System.out.print("Lado 2: ");
        float l2 = entrada.nextFloat();

        System.out.print("Lado 3: ");
        float l3 = entrada.nextFloat();

        System.out.println();

        if ((l1 < l2 + l3) & (l2 < l1+ l3) & (l3 < l1 + l2)) {
            System.out.println("Estes valores formam um triangulo");
            if((l1 == l2) & (l2 == l3)) {
            System.out.println("Triangulo Equilátero");
        }else if( (l1 == l2) | (l2 == l3) | (l1 == l3)) {
            System.out.println("Triangulo Equilatero");
        }else { 
            System.out.println("Triangulo Escaleno");
        }
        }else {
            System.out.println("Estes valores não formam um triângulo");
        }
        entrada.close();
}
}