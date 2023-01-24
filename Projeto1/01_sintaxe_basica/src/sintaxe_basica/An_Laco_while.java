package sintaxe_basica;

public class An_Laco_while {
	public static void main(String[] args) {
		int contador = 0;
		while (contador <= 10) {
			System.out.println("Vamos enquanto esta dentro do while: "+contador);
			contador++;
		}
		System.out.println("Valor da variavel contador fora do while: "+contador);
	}
}
