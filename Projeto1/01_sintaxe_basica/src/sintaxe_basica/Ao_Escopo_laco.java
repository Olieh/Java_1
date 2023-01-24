package sintaxe_basica;

public class Ao_Escopo_laco {
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		
		while (contador <= 10 ) {
			total += contador;
			System.out.println("Contador = "+contador);
			contador++;
			System.out.println("Total = "+total);
		}
	}
}
