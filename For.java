package Familia58;

import java.util.Scanner;
//**Ler 10 números e imprimir quantos são pares e quantos são ímpares.**//
public class For {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int num, contPar=0, contImpar=0;
		
		for(int i=1; i <=10; i++) {
			System.out.println("\nDigite o " + i +"número");
			num = ent.nextInt();
			
			if(num %2 ==0) {
				contPar++;
			}
			if(num % 2 ==1) {
				contImpar++;
			}
		}
		System.out.println("\nForam digitados " + contPar + "números pares");
		System.out.println("\nForam digitados " + contImpar + "números pares");
}
}