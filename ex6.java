/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2;



import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float n1, n2, n3;
		System.out.println("Digite um numero");
		n1 = ler.nextFloat();
		System.out.println("Digite o segundo numero");
		n2 = ler.nextFloat();
		System.out.println("Digite o terceiro numero");
		n3 = ler.nextFloat();
		if (n1 < n2 && n1 < n3) {
			System.out.print(n1);
			System.out.print(", ");
			if (n2 < n3) {
				System.out.print(n2 + ", " + n3);
			} else {
				System.out.print(n3 + ", " + n2);
			}
		} else if (n2 < n1 && n2 < n3) {
			System.out.print(n2);
			System.out.print(", ");
			if (n1 < n3) {
				System.out.print(n1 + ", " + n3);
			} else {
				System.out.print(n3 + ", " + n1);
			}
		} else if (n3 < n2 && n3 < n1) {
			System.out.print(n3);
			System.out.print(", ");
			if (n1 < n2) {
				System.out.print(n1 + ", " + n2);
			} else {
				System.out.print(n2 + ", " + n1);
			}
		}
	}
}