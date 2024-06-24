package empresa;

import java.util.Scanner;

public class Menu {
	
	private Scanner teclado;
	private Cofrinho cofrinho;
	
	
	public Menu () {
		teclado = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	public void menuPrincipal() {
		//exibicao das opcoes
		System.out.println("Menu do cofrinho");
		System.out.println("1 - Adicionar moeda");
		System.out.println("2 - Remover moeda");
		System.out.println("3 - Listar moedas");
		System.out.println("4 - Total em Real");
		System.out.println("0 - Encerrar");
		
		//pegando valor do teclado do usuario
		int opcao = teclado.nextInt();
		
		Moeda moeda = null;
		
		switch (opcao) {
		case 1:
			//exibindo menu com opcoes de moedas
			System.out.println("Escolha a moeda:");
			System.out.println("1 - Real");
			System.out.println("2 - Dolar");
			System.out.println("3 - Euro");
			
			//pegando valor do teclado do usuario
			int opcaoMoedaAdicionar = teclado.nextInt();
			
			if(opcaoMoedaAdicionar == 1) {
				System.out.println("Digite o valor:");
				double valorMoeda = teclado.nextDouble();
				
				//instancia a nova moeda e passa o valor fornecido
				moeda = new Real(valorMoeda);
				
			} else if (opcaoMoedaAdicionar == 2) {
				System.out.println("Digite o valor:");
				double valorMoeda = teclado.nextDouble();
				
				//instancia a nova moeda e passa o valor fornecido
				moeda = new Dolar(valorMoeda);
				
			} else if (opcaoMoedaAdicionar == 3) {
				System.out.println("Digite o valor:");
				double valorMoeda = teclado.nextDouble();
				
				//instancia a nova moeda e passa o valor fornecido
				moeda = new Euro(valorMoeda);
				
			} else {
				System.out.println("Nao encontrei sua moeda");
				
				//caso nao encontre a moeda chama o menu fazendo recursao
				menuPrincipal();
			}
			
			//chama cofrinho e adiciona a moeda e o valor
			cofrinho.adiconar(moeda);
			System.out.println("Moeda adicionada: "+moeda);
			
			//chama o menu fazendo recursao
			menuPrincipal();
			break;
			
		case 2:
			//exibindo menu de moedas
			System.out.println("Escolha a moeda:");
			System.out.println("1 - Real");
			System.out.println("2 - Dolar");
			System.out.println("3 - Euro");
			
			//pegando valor do teclado do usuario
			int opcaoMoedaRemover = teclado.nextInt();
			
			
			if(opcaoMoedaRemover == 1) {
				System.out.println("Digite o valor:");
				double valorMoeda = teclado.nextDouble();
				
				// instancia e moeda e passa o valor
				moeda = new Real(valorMoeda);
				
			} else if (opcaoMoedaRemover == 2) {
				System.out.println("Digite o valor:");
				double valorMoeda = teclado.nextDouble();
				
				// instancia e moeda e passa o valor
				moeda = new Dolar(valorMoeda);
				
			} else if (opcaoMoedaRemover == 3) {
				System.out.println("Digite o valor:");
				double valorMoeda = teclado.nextDouble();
				
				// instancia e moeda e passa o valor
				moeda = new Euro(valorMoeda);
				
			} else {
				System.out.println("Nao encontrei sua moeda");
				
				// chama o menu fazendo recursividade
				menuPrincipal();
			}
			
			//chama o cofrinho e remove o item passando a moeda e valor
			cofrinho.remover(moeda);
			System.out.println("Moeda removida: "+moeda);
			
			// chama o menu fazendo recursividade
			menuPrincipal();
			break;
			
			
		case 3:
			cofrinho.listarMoedas();
			
			// chama o menu fazendo recursividade
			menuPrincipal();
			break;
			
		case 4:
			double valorTotalConvertido = cofrinho.totalConvertido();
			System.out.println("Total convertido para Real: R$: "+valorTotalConvertido);
			
			// chama o menu fazendo recursividade
			menuPrincipal();
			break;
			
		case 0:
			break;
			
		default:
			System.out.println("Opcao invalida.");
			
			// chama o menu fazendo recursividade
			menuPrincipal();
			break;
		
		}
	}
}
