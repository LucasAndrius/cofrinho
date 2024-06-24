package empresa;

public class Real extends Moeda{
	
	public Real(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Real = " + valor;
	}

	@Override
	public void info() {
		System.out.println("Real - " + valor);
		
	}

	@Override
	public double converter() {
		return this.valor;
		
	}
	
	@Override
	public boolean equals(Object o) {
		//verificando se a classe é igual ao do objeto passado por parametro
		if(this.getClass() != o.getClass()) {
			return false;
		}
		
		//converte o objeto passado para o tipo Real
		Real objetoReal = (Real) o;
		
		// compara o valor atual com o valor do objeto real
		if(this.valor != objetoReal.valor) {
			return false;
		}
		
		return true;
	}

}
