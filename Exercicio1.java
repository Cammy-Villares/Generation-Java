package Familia58;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[]args) {
		/**3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto**/
		int idade;
		
		System.out.println("\nInfome a sua idade:");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade"));
		
		if((idade >= 10)&& (idade<=14)){
			System.out.println("\nIfantil");
		}
		
		if((idade >=15)&& (idade<=17)) {
			System.out.println("\nJuvenil");
		}
		if((idade>=18)&&(idade<=25)) {
			System.out.println("\nAdulto");
		}
		if(idade <=9) {
			System.out.println("\nVocê é muito nenê ainda!!");
		}
		if(idade>=26) {
			System.out.println("\nIhhhh você é muito velho para participar da panelinha");
		}
	}
}
