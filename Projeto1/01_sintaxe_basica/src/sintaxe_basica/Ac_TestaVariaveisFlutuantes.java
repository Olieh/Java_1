package sintaxe_basica;

public class Ac_TestaVariaveisFlutuantes {

	public static void main(String[] args) {

//		declarando uma variavel com o nome salario do tipo double / valor flutuante
		double salario;
//		definindo o valor 1250.70 para a variavel salario
		salario = 1250.70;
		System.out.println("Imprimindo variavel double " + salario);
		System.out.println("");

		double divisao = 3.14 / 2;
		System.out.println("Imprimindo variavel double que armazenou uma divisão " + divisao);
		System.out.println("");

//		primeiro é feito a divisão de 7 por 2 o que gera um resultado 3,5
//		mas como a variavel é do tipo inteiro
//		so é possivel armazenar o valor 3, ignorando o numero 0,5		
		int divisaoInt = 7 / 2;
		System.out.println("Imprimindo variavel inteira que armazenou uma divisão " + divisaoInt);
		System.out.println("Faz a divisão, ao armazenar em uma variavel inteira ignora a parte quebrada ");
		System.out.println("");
		
		

	}
}