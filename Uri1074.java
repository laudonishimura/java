import java.util.Scanner;
public class Uri1074{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int valor, num;
        
        valor = teclado.nextInt(); 

        for (int cont=1; cont<=valor; cont++){
            num = teclado.nextInt();
            if (num == 0){
                System.out.println("NULL");
            }
            else if (num % 2 == 0){
                if (num > 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                }
                           
            }
                else {
                    if (num > 0) {
                        System.out.println("ODD POSITIVE");
                    } else {
                        System.out.println("ODD NEGATIVE");
                    }   
            }
        }
        
    }
}