import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

int NUMERO, HORAS;
double VALOR, SALARIO;

NUMERO = teclado.nextInt();
HORAS = teclado.nextInt();
VALOR = teclado.nextDouble();

SALARIO = HORAS * VALOR;

System.out.printf("NUMBER = %d\n", NUMERO);
System.out.printf("SALARY = U$ %.2f\n", SALARIO);

}
}