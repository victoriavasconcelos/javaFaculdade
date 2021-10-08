import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int mes;
		
		System.out.println("Informe aqui o numero de um mês: ");
		mes = ler.nextInt();
		
		if (mes<=0 || mes>12){
		    System.out.println("Numero mes invalido digite novamente.");
		}
		//Ver se o número do mês está errado (Não pode ser 0 (zero), negativo nem superior a 12).
	}
}
