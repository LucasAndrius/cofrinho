package empresa;

public class Euro extends Moeda{

	public Euro(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Euro = " + valor;
	}

	@Override
	public void info() {
		System.out.println("Euro - " + valor);
		
	}

	@Override
	public double converter() {
		
		return this.valor * 5.47;
	}

	@Override
	public boolean equals(Object o) {
		//verificando se a classe é igual ao do objeto passado por parametro
		if(this.getClass() != o.getClass()) {
			return false;
		}
		
		//converte o objeto passado para o tipo Euro
		Euro objetoEuro = (Euro) o;
		
		// compara o valor atual com o valor do objeto euro
		if(this.valor != objetoEuro.valor) {
			return false;
		}
		
		return true;
	}
}
