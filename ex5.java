/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2;



import java.util.Scanner;

public class ex5  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
       float n;
       System.out.println("Digite um numero");
       n = ler.nextFloat();
       if (n > 0) {
    	   n = n * 2;
       } else {
    	   n = n * 3;
       }
       System.out.println("O resultado deu "+n);
	}
}