/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2;



import java.util.Scanner;

public class ex7  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        float n;
        System.out.println("Digite um número");
        n = ler.nextFloat();
        if (n % 2 == 0) {
        	n = n+5;
        } else {
        	n = n+8;
        }
        System.out.println("N = "+n);
	}
}