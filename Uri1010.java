import java.util.Scanner;
public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

int PECA, QTD;
double VALOR, TOTAL;

PECA = teclado.nextInt();
QTD = teclado.nextInt();
VALOR = teclado.nextDouble();

TOTAL = QTD * VALOR;

PECA = teclado.nextInt();
QTD = teclado.nextInt();
VALOR = teclado.nextDouble();

TOTAL = TOTAL + (QTD * VALOR);

System.out.printf("VALOR A PAGAR = R$ %.2f\n", TOTAL);

}
}