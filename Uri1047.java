import java.util.Scanner;
public class Uri1047{
     public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

int h1, m1, h2, m2, toth, totm, total;

h1 = teclado.nextInt();
m1 = teclado.nextInt();
h2 = teclado.nextInt();
m2 = teclado.nextInt();

if (h1 >= h2) {
    toth = 24 + h2 - h1;
    }
else {
    if (h2-h1) > 1 {
    toth = h2 - h1;
    }
    else {
        toth = 0;
    }

if (m1 >= m2) {
    totm = 60 + m2 - m1;
    }
else {
    totm = m2 - m1;
}

//total = toth * 60 + totm;

System.out.printf("O JOGO DUROU " + toth + " HORA(S) E " + totm + " MINUTO(S)");

}
}
