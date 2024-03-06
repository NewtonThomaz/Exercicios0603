package exercicios0603;
import java.util.Scanner;

public class CalculadoraKm {

	public static void main(String[] args) {

		//variáveis
		double Vlg, Dtp, Cm, Vt, Ctg;

		//instanciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados
		System.out.println("Qual o preço do litro da gasolina?");
		Vlg = ler.nextDouble();

		System.out.println("Quantos Km foram percorridos?");
		Dtp = ler.nextDouble();

		System.out.println("Quantos Km seu veiculo faz com 1 litro de combustivel ?");
		Cm = ler.nextDouble();

		//Processamento
		Ctg = Dtp / Cm;
		Vt = Ctg * Vlg;

		//Sáida de dados
		System.out.print("Nesse trjeto você gastou " + Ctg + " litros de gasolina" );
		System.out.print(" e o valor desse combustivél gasto foi  " + Vt +" reais.");

	}

}