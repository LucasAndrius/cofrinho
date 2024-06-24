package empresa;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho() {
		//instancia a listaMoedas na memoria
		this.listaMoedas = new ArrayList<>();
	}
	
	public void adiconar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		this.listaMoedas.remove(moeda);
	}
	
	public void listarMoedas() {
		
		if(listaMoedas.isEmpty()) {
			System.out.println("Cofrinho vazio.");
			return;
		}
		
		//Pegando cada moeda e exibindo suas informacoes
		//Conotacao O(n)
		for (Moeda m : this.listaMoedas) {
			m.info();
		}
	}

	public double totalConvertido() {
		
		if(this.listaMoedas.isEmpty()) {
			return 0;
		}
		
		double acumulador = 0;
		
		//Pegando cada moeda e somando seus valores
		//Conotacao O(n)
		for (Moeda m : this.listaMoedas) {
			
			acumulador += m.converter();
		}
		
		return acumulador;
	}
	
	
}
