import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int ano;
		
		System.out.println("informe aqui o ano em que você nasceu: ");
		ano = ler.nextInt();
		
		if (ano<1901 && ano>2000){
		    System.out.println("você não nasceu no seculo 20");
		}else{
		    System.out.println("você nasceu no seculo 20!!");
		}
		//Ver se o ano é do século 20 (de 1901 até 2000)
	}
}
