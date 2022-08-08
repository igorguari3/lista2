/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author labinfo
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Escreva o valor de A: ");
        a = scanner.nextInt();
        System.out.println("Escreva o valor de B: ");
        b = scanner.nextInt();
        System.out.println("Escreva o valor de C: ");
        c = scanner.nextInt();
        d = (a+b) ;
        if (d > c){
            System.out.println(a+b);
        } 
    }  
}