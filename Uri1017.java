import java.util.Scanner;
public class Uri1017{
     public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

//int tempo;
double tempo, velocidade, litros, distancia;

tempo = teclado.nextInt();
velocidade = teclado.nextDouble();

distancia = tempo * velocidade;
litros = distancia / 12;

System.out.printf("%.3f\n", litros);

}
}