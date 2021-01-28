import java.util.Scanner;
public class Uri1073{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int valor, fim;
        valor = teclado.nextInt();

        if (valor % 2 != 0) {
            valor++;
        } 
        
        for (int cont=2; cont<=valor; cont+=2){
            System.out.println(cont+"^2 = "+cont*cont);
        }
        
    }
}