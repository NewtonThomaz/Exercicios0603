package exercicios0603;
import java.util.Scanner;

public class CalculadoraTemperatura {

	public static void main(String[] args) {

		//variáveis
		double tc, tf;

		//instanciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados
		System.out.println("Quantos Fahrenheit está? ");
		tf = ler.nextDouble();

		//Processamento
		tc = ((tf - 32)* 5)/ 9;

		//Sáida de dados
		System.out.print("Está" + tc + " graus celsius.");

	}

}