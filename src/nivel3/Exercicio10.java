package nivel3;

import java.util.Scanner;

public class Exercicio10 {
	public Exercicio10(){
		double[] valores = new double[2];
		char[] op = new char[1];
		Scanner s = new Scanner(System.in);
		
		System.out.print("Insira o primeiro numero: ");
		valores[0] = s.nextDouble();
		
		do{
			do{
				System.out.print("Insira a operacao: ");
				op[0] = s.next().charAt(0);
			}while(op[0] != '+' && op[0] != '-' && op[0] != '*' && op[0] != '/' && op[0] != '0');
		
			if(op[0] != '0'){
				System.out.print("Insira o segundo numero: ");
				valores[1] = s.nextDouble();
			}
			
			switch (op[0]){
				case '+':
					valores[0] = valores[0] + valores[1];
					break;
			
				case '-':
					valores[0] = valores[0] - valores[1];
					break;
					
				case '*':
					valores[0] = valores[0] * valores[1];
					break;
					
				case '/':
					valores[0] = valores[0] / valores[1];
					break;
				
				case '0':
					break;
			}
		}while(op[0] != '0');
		
		System.out.print("O resultado foi: " + valores[0]);
	}
}
