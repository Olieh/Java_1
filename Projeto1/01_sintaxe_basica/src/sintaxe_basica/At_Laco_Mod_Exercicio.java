package sintaxe_basica;

public class At_Laco_Mod_Exercicio {
	public static void main(String[] args) {
//		Utilize um laço do tipo for para imprimir todos os multiplos de 3, entre 1 e 100.
		
		for (int num = 1; num <= 100; num++) {
			if (num % 3 == 0) {
				System.out.println(num);
			}
		}
	}
}
