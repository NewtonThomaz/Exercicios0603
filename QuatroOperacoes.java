package exercicios0603;
import java.util.Scanner;

public class QuatroOperacoes {

	public static void main(String[] args) {
	//Variáveis
	double A, B, som, sub, mut, div;
	
	//Instanciar classe Scanner
	Scanner ler = new Scanner(System.in);
	
	//Entrada de dados
	System.out.println("Digite o primeiro valor:");
	A = ler.nextDouble();
	
	System.out.println("Digite o segundo valor:");
	B = ler.nextDouble();
	
	//Processamento
	som = A + B;
	sub = A - B;
	mut = A * B;
	div = A / B;
	
	//Saída de dados
	System.out.println("A soma de " + A + " e " + B + " é iqual a " + som + ".");
	System.out.println("A subtração de " + A + " por " + B + " é iqual a " + sub + ".");
	System.out.println("A multiplicação de " + A + " por " + B + " é iqual a " + mut + ".");
	System.out.println("A divisão de " + A + " por " + B + " é iqual a " + div + ".");
	
	}

}