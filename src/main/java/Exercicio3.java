/**
 * Exercicio 03
 * Declare uma variável do tipo double com valor 9.78. Converta-a para int (casting) e
 * exiba o valor convertido, por exemplo:
 * Valor original: 9.78
 * Valor convertido para inteiro: 9
 */

public class Exercicio3 {
    public static void main(String[] args) {
        double numero = 9.78d;
        int resultado = (int) numero;

        System.out.println("Valor original: " + numero);
        System.out.println("Valor convertido: " + resultado);
    }
}
