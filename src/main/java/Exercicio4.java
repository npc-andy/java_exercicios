/**
 * Exercicio 04
 * Peça que façam um programa que receba (ou declare) dois números inteiros x e y e
 * calcule +, –, ×, ÷ (divisão inteira) e resto (módulo). Exiba cada resultado numa linha
 * separada.
 */

public class Exercicio4 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("Adição = " + (x+y));
        System.out.println("Subtração = " + (x-y));
        System.out.println("Multiplicação = " + (x*y));
        System.out.println("Divisão = " + (x/y));
        System.out.println("Módulo = " + (x%y));
    }
}
