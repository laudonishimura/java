import java.util.Scanner;
public class Uri1144{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int valor;
        valor = teclado.nextInt();
        //cont = 1;
        
        for (int cont=1; cont<=valor; cont++){
            System.out.println(cont +" "+ cont*cont +" "+ cont*cont*cont);
            System.out.println(cont +" "+ (cont*cont+1) +" "+ (cont*cont*cont+1));
        
            }
        
    }
}