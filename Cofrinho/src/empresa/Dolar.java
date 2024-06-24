package empresa;

public class Dolar extends Moeda{

	public Dolar(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Dolar = " + valor;
	}
	
	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
		
	}

	@Override
	public double converter() {
		
		return this.valor * 5.12;
	}
	
	@Override
	public boolean equals(Object o) {
		//verificando se a classe é igual ao do objeto passado por parametro
		if(this.getClass() != o.getClass()) {
			return false;
		}
		
		//converte o objeto passado para o tipo Dolar
		Dolar objetoDolar = (Dolar) o;
		
		// compara o valor atual com o valor do objeto dolar
		if(this.valor != objetoDolar.valor) {
			return false;
		}
		
		return true;
	}

}
