package application;

import java.util.Locale;
import java.util.Scanner;

public class projetopontuacao {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qntcompras, atraso;
		double ticket;
		char formapagamento;
		
		// Cabecalho
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("---------------------------------");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		System.out.println();
		
		// Leitura do volume
		
		System.out.println("Quantas compras o cliente fez no �ltimo ano?");
		qntcompras = sc.nextInt();
		System.out.println("Qual o ticket m�dio?");
		ticket = sc.nextDouble();
		System.out.println();
		
		// Leitura dos outros dados
		
		System.out.println("Quantas vezes o cliente atrasou o pagamento?");
		atraso = sc.nextInt();
		System.out.println("A maioria das compras foi em dinheiro, cart�o, ou boleto (D/C/B)?");
		formapagamento = sc.next().charAt(0);
		
		sc.close();
	}

}
