import java.util.Scanner;
public class Uri1142{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int valor, pum;
        valor = teclado.nextInt();
        pum = 1;
        
        for (int cont=1; cont<=valor; cont++){
            System.out.println(pum +" "+ (pum+1) +" "+ (pum+2) +" PUM");
            pum=pum+4;
            }
        
    }
}