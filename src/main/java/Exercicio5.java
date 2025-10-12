/**
 * Declare duas variáveis inteiras x e y.
 * a. Se x for maior que y, imprima “x é maior que y”.
 * b. Se x for igual a y, imprima “x é igual a y”.
 * c. Caso contrário, imprima “x é menor que y”.
 */

public class Exercicio5 {
    public static void main(String[] args) {
        int x = 5;
        int y = 9;

        if (x>y){
            System.out.println("X é maior que Y!");
        } else if (x==y){
            System.out.println("X é igual a Y!");
        } else {
            System.out.println("X é menor que Y!");
        }
    }
}
