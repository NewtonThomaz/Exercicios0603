package exercicios0603;
import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {

		//Variáveis
		double B, H, Area;
		String Unidade;

		//Instanciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados
		System.out.println("Qual unidade de medida vc vai utilizar?");
		Unidade = ler.nextLine();

		System.out.println("Qual o tamanho da base do seu Triângulo?");
		B = ler.nextDouble();

		System.out.println("Qual a altura do seu Triângulo?");
		H = ler.nextDouble();

		//Processamento
		Area = (B * H)/2;

		//Saída de dados
		System.out.println("A área do seu triângulo é " + Area + Unidade +"².");

	}

}