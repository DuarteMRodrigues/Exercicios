package nivel2;

import java.util.Scanner;

public class Exercicio9 {
	public Exercicio9(){
		int[] valores = new int[3];
		char[] op = new char[1];
		Scanner s = new Scanner(System.in);
		
		System.out.print("Insira o primeiro numero: ");
		valores[0] = s.nextInt();
		
		do{
			System.out.print("Insira a operacao: ");
			op[0] = s.next().charAt(0);
		}while(op[0] != '+' && op[0] != '-' && op[0] != '*' && op[0] != '/' && op[0] != '0');
	
		System.out.print("Insira o segundo numero: ");
		valores[1] = s.nextInt();
		
		switch (op[0]){
			case '+':
				valores[2] = valores[0] + valores[1];
				break;
		
			case '-':
				valores[2] = valores[0] - valores[1];
				break;
				
			case '*':
				valores[2] = valores[0] * valores[1];
				break;
				
			case '/':
				valores[2] = valores[0] / valores[1];
				break;
			
			case '0':
				System.out.print("Cancelado");
				System.exit(0);
				break;
		}
		
		System.out.print("O resultado foi: " + valores[2]);
	}
}
