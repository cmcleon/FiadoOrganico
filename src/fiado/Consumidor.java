package fiado;

public class Consumidor {
	//atributos
	private String nome;
	private int[] fiados;
	private int posicao = 0;
	private String tel;
	
	//construtores
	public Consumidor(String nome) {
		this.nome = nome;
		this.fiados = new int[5]; 
	}
	
	//getter e setter
	public String getNome() {
		return this.nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getTel() {
		return this.tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}

	public void registrarFiados(int valor) {
		if (posicao <fiados.length) {
			this.fiados[posicao] = valor;
			posicao++;
		}
		
	}
	
	public int getFiados() {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}
	
	public void fiadosHund() {
		for (int i =0; i<fiados.length; i++) {
			if (fiados[i] >= 100) {
				System.out.println("Compras onerosas: " + fiados[i]);
			}
		}
	}
	
	//
	
}
