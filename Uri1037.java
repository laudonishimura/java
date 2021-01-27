import java.util.Scanner;
public class Uri1037{
     public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);


float intervalo;
intervalo = teclado.nextFloat();

if (intervalo >= 0.0 && intervalo <= 25.0) {
    System.out.println("Intervalo [0,25]");
    }
else if (intervalo > 25.0 && intervalo <= 50.0) {
    System.out.println("Intervalo (25,50]");
    }
else if (intervalo > 50.0 && intervalo <= 75.0) {
    System.out.println("Intervalo (50,75]");
    }
else if (intervalo > 75.0 && intervalo <= 100.0) {
    System.out.println("Intervalo (75,100]");
    }
else {
    System.out.println("Fora de intervalo");
    }
}
}
