import java.util.Scanner;
public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

int X;
double Y, CONSUMO;

X = teclado.nextInt();
Y = teclado.nextDouble();

CONSUMO = X / Y;

System.out.printf("%.3f\n Km/l", CONSUMO);

}
}