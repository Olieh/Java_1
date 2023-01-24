package sintaxe_basica;

public class Ag_Condicional_if {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int qtdPessoas = 1;
		if (idade >= 18) {
			System.out.println("Você tem 18 anos ou mais");
		}else if (qtdPessoas > 1) {
			System.out.println("Você é menor de idade, mas como tem acompanhante, então pode entrar");
		}else {
			System.out.println("Você menor de idade e nao tem acompanhante, entao não esta permitido a entrar");
		}
	}
}
