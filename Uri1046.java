import java.util.Scanner;
public class Uri1046{
     public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

int h1, h2, total;

h1 = teclado.nextInt();
h2 = teclado.nextInt();

if (h1 >= h2) {
    total = 24 + h2 - h1;
    }
else {
    total = h2 - h1;
    }

    System.out.println("O JOGO DUROU " + total + "HORA(S)");

}
}
