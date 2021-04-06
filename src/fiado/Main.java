package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] fiados=new int[5];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do Cliente: ");
		String nome = scanner.nextLine();
		
		int fiado;
		for (int i =0; i<fiados.length; i++) {
			System.out.print("Informe o valor da compra: ");
			fiado = Integer.valueOf(scanner.nextLine());
			
			if (fiado==-1) {
				break;
			}
			while (fiado==0) {
				System.out.println("Insira outro valor.");
				System.out.print("Novo valor: ");
				fiado = Integer.valueOf(scanner.nextLine());
				
			}
			fiados [i]=fiado;
		}
		
		
		int total=somaWhile(fiados);
				
		System.out.println("Cliente " + nome  + " deve: " + total);
	}
	
	public static int somaWhile(int[] fiados) {
		int i = 0;
		int total = 0;
		while (i<fiados.length) {
			total+=fiados[i]; //atalho para total = total + fiados[i];
			i++; // atalho para i+=1; ou i=i+1;
	}
		return total;
}
}

