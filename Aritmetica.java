import java.util.Scanner;

public class Aritmetica {
	public static void main(String[] args){
		int n1; //primeiro número solicitado
		int n2; //segundo número solicitado
		int soma; //soma dos dois números
		int subtracao; //subtração dos dois números
		int divisao; //divisão dos dois números
		int multiplicacao; //multiplicação dos dois números
		
		
		// Pedir para o usuário 2 números
		//Cria um objeto de Scanner que lê da entrada padrão (System.in);
		Scanner entrada = new Scanner(System.in);
		// Carregar esses números como inteiros
		System.out.print("Insira o 1o numero: ");
		n1 = entrada.nextInt();
		System.out.print("Insira o 2o numero: ");
		n2 = entrada.nextInt();
		
		entrada.close();
		
		
		
		//Somar os dois números
		soma = n1 + n2;
				
		//Subtrair os dois números
		subtracao = n1 - n2;
				
		//Dividir os dois números
		divisao = n1 / n2; //dois inteiros -> divisão inteira 
			
		//Multiplicar os dois números
		multiplicacao = n1 * n2;
		
		
		//Imprimir a soma
		System.out.printf("Soma:  %d\n", soma);
		
		//Imprimir a subtração
		System.out.printf("Subtracao:  %d\n", subtracao);
		
		//Imprimir a divisão
		System.out.printf("Divisao:  %d\n", divisao);
		
		//Imprimir a multiplicação
		System.out.printf("Multiplicar:  %d\n", multiplicacao);
		
		
		if (n1==n2){
			System.out.printf("Os numeros sao iguais!");
		
		} else if (n1>n2) {
			System.out.printf("O maior eh: %d\n",n1);
		
		} else {
			System.out.printf("O maior eh: %d\n",n2);
		}
		
		//n1 é multiplo de n2?
		
		if(n1 % n2 == 0){
			System.out.printf("O n1 eh multiplo de n2!");
		} else {
			System.out.printf("O n1 nao eh multiplo de n2");
		}
}
}
