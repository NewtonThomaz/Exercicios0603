package exercicios0603;
import java.util.Scanner;

public class Moeda {

	public static void main(String[] args) {
		//Variáveis
		double R, Om;

		//Instanciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados
		System.out.println("Quantos Reais você gostaria de converter para Dólar?");
		R = ler.nextDouble();
		
		//Processamento
		Om = R / 4.94 ;
		
		//Saída de dados
		System.out.println("Você terá " + Om + "Dólares." );
		

	}

}
