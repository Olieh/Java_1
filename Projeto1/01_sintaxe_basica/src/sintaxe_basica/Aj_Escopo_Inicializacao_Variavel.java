package sintaxe_basica;

public class Aj_Escopo_Inicializacao_Variavel {
	public static void main(String[] args) {
		int qtdPessoas = 3;
//		declarando a variavel sem inicializar
		boolean acompanhado;
		if (qtdPessoas >= 2) {
//			pode ser inicializado com o valor true nesse momento
			acompanhado = true;
		}else {
//			pode ser inicializado com o valor false nesse momento
			acompanhado = false;
		}
		System.out.println("Valor de acompanhado: "+ acompanhado);
	}
}
