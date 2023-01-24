package sintaxe_basica;


public class Ai_Condicional_if_boolean {
	public static void main(String[] args) {
		int idade = 80;
		boolean estaAcompanhado = true;
		System.out.println("valor da variavel estaAcompanhado é "+estaAcompanhado);
		
		if ( idade >= 18 || estaAcompanhado) {
			System.out.println("é maior de idade ou esta acompanhado, Seja Bem-vindo");
		}else {
			System.out.println("Não pode entrar");
		}
		
		boolean ehIdoso = idade >= 65;
		System.out.println(ehIdoso);
	}
}
