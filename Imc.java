/*
Crie um aplicativo de calculadora IMC que leia o peso do usuário 
em kg e altura em metros e calcule e exiba o índice de massa 
corporal dele. Além disso, exiba as informações sobre IMC:

IMC = peso / (altura * altura)

Valores de IMC:
Abaixo do peso: menor que 18.5
Normal: entre 18.5 e 24.9
Sobrepeso: entre 25 e 29.9
Obeso: 30 ou maior
*/

import java.util.Scanner;

public class Imc {
	public static void main(String[] args){
		double peso;
		double altura;
		double calcimc;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a sua altura: ");
		altura = entrada.nextDouble();
		
		System.out.print("Insira o seu peso: ");
		peso = entrada.nextDouble();
		
		
		entrada.close();
		
		
		calcimc = peso / (altura*altura);
		
		System.out.printf("Seu IMC eh: %2f\n", calcimc);
		
		if (calcimc < 18.5){
			System.out.printf("Abaixo do peso");
			
		} else if((calcimc >= 18.5) && (calcimc <= 24.9)){
			System.out.printf("Peso normal");
		} else if((calcimc >= 25) && (calcimc <=29.9)){
			System.out.printf("Sobrepeso");
		}else{
			System.out.printf("Obeso");
		}
		
		
	}
		
}