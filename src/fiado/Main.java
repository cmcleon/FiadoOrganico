package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		//consumidor.fiados = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do Cliente: ");
		
		String nome= scanner.nextLine();
		Consumidor consumidor = new Consumidor(nome);
		
		System.out.print("Telefone: ");
		String tel = scanner.nextLine();
		consumidor.setTel(tel);
		
		System.out.print("Informe o valor da compra: ");
		int fiado = Integer.valueOf(scanner.nextLine());
		
		while (fiado!=-1) {
			if (fiado==0) {
				System.out.print("Insira outro valor:");
				}
			
			else {
				consumidor.registrarFiados(fiado);
				System.out.print("Informe o valor da compra: ");
				
			}
			
			fiado = Integer.valueOf(scanner.nextLine());
		}
		System.out.println("-------");
		int total=consumidor.getFiados();
		consumidor.fiadosHund();
		
		System.out.println();
		System.out.println("-------");
		
		System.out.println("Cliente " + consumidor.getNome() + " deve: " + total);
		System.out.println("Contato: " + consumidor.getTel());
		
	}
	
	
}
	

