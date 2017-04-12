package nivel0;

public class Exercicio4 {
	public Exercicio4(){
		int[] valores = {3, 5, 6, 1, 0};
		
		for(int i = 0; i < valores.length - 1; i++){
			valores[valores.length-1] += valores[i];
		}
		
		System.out.println("A soma dos valores do array é: " + valores[valores.length-1]);
	}
}
