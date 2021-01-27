import java.util.Scanner;
public class Uri1017{
     public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

//int tempo;
int idade, ano, mes, dia;

ano = idade / 365;
mes = (idade % 365) / 30;
dia = (idade % 365) % 30;

System.out.println(ano + "ano(s)");
System.out.println(mes + "mes(es)");
System.out.println(dia + "dia(s)");
}
}
