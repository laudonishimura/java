import java.util.Scanner;
public class Uri1134{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int valor, alcool, gas, diesel;
        alcool=0;
        gas=0;
        diesel=0;
        valor = teclado.nextInt();

        while (valor != 4){
            if (valor == 1){
                alcool++;
            }
            else if (valor == 2){
                gas++;
            }
            else if (valor == 3){
                diesel++;
            }
            valor = teclado.nextInt();
            
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gas);
        System.out.println("Diesel: "+diesel);

    }
}