import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a medida do lado quadrado: ");
        int lado = sc.nextInt();
        sc.close();

        int area = lado * lado;

        int dobro = area * 2;

        System.out.println("O dobro da área do quadrado de lado " + lado + " è igual a " + dobro);
        
    }
}