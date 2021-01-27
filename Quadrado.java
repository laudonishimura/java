import java.util.Scanner;
public class Quadrado{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

int a, b;

System.out.println("Digite o valor do lado do quadrado");
a = teclado.nextInt();

b = a * a;

System.out.println("Valor da area eh = " + b);
}
}