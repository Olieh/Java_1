package sintaxe_basica;

public class Ah_Condicional_if_teste {

	public static void main(String[] args) {

		double salario = 3300.0;

		System.out.println("Forma errada de usar o if");
		System.out.println("ele apenas pula a linha seguinte");
		System.out.println();
		if (salario < 2600.0)
			System.out.println("A sua aliquota é de 15%");
		System.out.println("Você pode deduzir até R$ 350");
		if (salario < 3750.0)
			System.out.println("A sua aliquota é de 22,5%");
		System.out.println("Você pode deduzir até R$ 636");

		System.out.println("===================================");

		System.out.println("Fazendo da forma correta");
		System.out.println("Com o {} do if definindo o bloco de comando");
		System.out.println("Vamos pular o bloco de comando de forma correta");
		System.out.println();
		if (salario < 2600.0) {
			System.out.println("A sua aliquota é de 15%");
			System.out.println("Você pode deduzir até R$ 350");
		}
		if (salario < 3750.0) {
			System.out.println("A sua aliquota é de 22,5%");
			System.out.println("Você pode deduzir até R$ 636");
		}
	}

}
