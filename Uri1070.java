import java.util.Scanner;
public class Uri1070{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int valor, num;
        valor = teclado.nextInt();

        if (valor % 2 == 0) {
            valor++;
        } 
            
        for (int cont=1; cont<=6; cont++){
            System.out.println(valor);
            valor+=2;
            }
        
    }
}