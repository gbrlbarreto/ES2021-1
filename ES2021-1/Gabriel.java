import java.util.Scanner;

public class Gabriel{
    public static void main(String [] args){
        int a1, a2, a3;
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe o primeiro número: ");
        a1 = Integer.parseInt(entrada.nextLine());

        System.out.println("Informe o segundo número: ");
        a2 = Integer.parseInt(entrada.nextLine());

        a3 = a1 + a2;
        System.out.println("Valor = " + a3);
    }
}