import java.util.Scanner;
public class Uri1066{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int valor, qtdepar, qtdeimp, qtdepos, qtdeneg;
        qtdepar = 0;
        qtdeimp = 0;
        qtdepos = 0;
        qtdeneg = 0;

        for (int cont=1; cont<=5; cont++){
            valor = teclado.nextInt();
            if (valor % 2 == 0){
                qtdepar++;
            }
            else {
                qtdeimp++;
            }
            if (valor > 0){
                qtdepos++;
            }
            else if (valor < 0) {
                qtdeneg++;
            }
        }
        System.out.println(qtdepar +" valor(es) par(es)");
        System.out.println(qtdeimp +" valor(es) impar(es)");
        System.out.println(qtdepos +" valor(es) positivo(s)");
        System.out.println(qtdeneg +" valor(es) negativo(s)");
    }
}