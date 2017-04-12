package nivel1;

public class Exercicio14 {
	public Exercicio14(){
		int[] array = {5, 2, 7};
		int produto = 1;
		
		for(int i = 0; i < 3; i++){
			produto *= array[i];
		}
		
		System.out.println("O valor de produto é: " + produto);
	}
}
