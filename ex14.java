/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2;



import java.util.Scanner;

public class ex14  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int lado;
        float medida;
        System.out.println("Quantos lados tem o polígono?");
        lado = ler.nextInt();
        if (lado < 3) {
        	System.out.println("Não é um polígono");
        	System.exit(0);
        } else  if (lado > 5){
        	System.out.println("Polígono não identificado");
        	System.exit(0);
        } else if (lado == 5) {
        	System.out.println("Trata-se de um pentágono.");
        	System.exit(0);
        } 
        System.out.println("Qual a medida de seu lado?");
        medida = ler.nextFloat();
        if (lado == 3) {
        	System.out.println("Trata-se de um triângulo.");
        	System.out.println("Área = "+medida+" cm2");
        } else if (lado == 4) {
        	System.out.println("Trata-se de um quadrado");
        	System.out.println("Área = "+medida+" cm2");
        }
	}
	}