package application;

import java.util.Locale;
import java.util.Scanner;

public class projetopontuacao {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qntcompras, atraso, pontosvolume, pontosatraso, pontospag, classificacao;
		double ticket, volumecompras;
		char formapagamento;
		
		// Cabecalho
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("---------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.println();
		
		// Leitura do volume
		
		System.out.println("Quantas compras o cliente fez no último ano?");
		qntcompras = sc.nextInt();
		System.out.println("Qual o ticket médio?");
		ticket = sc.nextDouble();
		System.out.println();
		
		// Leitura dos outros dados
		
		System.out.println("Quantas vezes o cliente atrasou o pagamento?");
		atraso = sc.nextInt();
		System.out.println("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)?");
		formapagamento = sc.next().charAt(0);
		System.out.println();
		
		// Score de volume de compras
		
		volumecompras = ticket * qntcompras;
		
		if (qntcompras == 0) {
			pontosvolume = 0;
		}
		else if (volumecompras <= 3000.0 && qntcompras <= 2) {
			pontosvolume = 20;
		}
		else if (volumecompras <= 3000 && qntcompras > 2) {
			pontosvolume = 40;
		}
		else {
			pontosvolume = 60;
		}
		
		System.out.println("Score de volume de compras = " + pontosvolume + " pontos");
		System.out.println();
		
		// Scores de inadimplencia e pagamento
		
		if (atraso > 1 || qntcompras == 0) {
			pontosatraso = 0;
		}
		else if (atraso > 0 && qntcompras > 0) {
			pontosatraso = 15;
		}
		else {
			pontosatraso = 30;
		}
		
		if (formapagamento == 'D') {
			pontospag = 5;
		}
		else {
			pontospag = 10;
		}
		
		System.out.println("Score de inadimplência = " + pontosatraso + " pontos");
		System.out.println("Score de forma de pagamento = " + pontospag + " pontos");
		System.out.println();
		
		// Classificação final
		
		classificacao = pontosvolume + pontosatraso + pontospag;
		
		System.out.print("Classificação final = ");
		
		if (classificacao > 0 && classificacao <= 25) {
			System.out.println("CLIENTE BRONZE");
		}
		else if (classificacao > 25 && classificacao <= 75) {
			System.out.println("CLIENTE PRATA");
		}
		else {
			System.out.println("CLIENTE OURO");
		}
		
		
		sc.close();
	}

}
