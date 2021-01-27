import java.util.Scanner;
public class Uri1048{
     public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);


float salario, reajuste, novosal;
int percentual;
salario = teclado.nextFloat();

reajuste = 0.0f;
percentual = 0;
novosal = 0.0f;

if (salario >= 0.0 && salario <= 400.0) {
    percentual = 15;
    reajuste = salario * 0.15f;
    novosal = salario + reajuste;
}
else if (salario >= 400.01 && salario <= 800.0) {
    percentual = 12;
    reajuste = salario * 0.12f;
    novosal = salario + reajuste;
}
else if (salario >= 800.01 && salario <= 1200.0) {
    percentual = 10;
    reajuste = salario * 0.10f;
    novosal = salario + reajuste;
}
else if (salario >= 1200.01 && salario <= 2000.0) {
    percentual = 7;
    reajuste = salario * 0.07f;
    novosal = salario + reajuste;
}
else if (salario > 2000.0) {
    percentual = 4;
    reajuste = salario * 0.04f;
    novosal = salario + reajuste;
}

System.out.printf("Novo salario: %.2f\n", novosal);
System.out.printf("Reajuste ganho: %.2f\n", reajuste);
System.out.println("Em percentual: " + percentual + " %"); 

}
}
