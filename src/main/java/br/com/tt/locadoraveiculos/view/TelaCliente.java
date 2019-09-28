package br.com.tt.locadoraveiculos.view;

import br.com.tt.locadoraveiculos.model.enums.TipoCliente;
import br.com.tt.locadoraveiculos.model.enums.TipoCombustivel;
import br.com.tt.locadoraveiculos.model.enums.TipoVeiculo;

public class TelaCliente extends Tela {

	@Override
	public void apresentarTela() {
		do {
		this.imprimirMenu();
		int opcaoUsuario = super.solicitarOpcaoNumerica();
		switch (opcaoUsuario) {
		case 1:
			System.out.println("Voce selecionou 'CADASTRAR CLIENTES' ");
			this.cadastrarCliente();
			break;
		
		case 2:
			System.out.println("Voce selecionou 'LISTAR CLIENTES' ");
			
			break;
			
		case 0:
			System.out.println("Voce selecionou 'RETORNAR AO MENU PRINCIPAL' ");
			return;
			
		default:
			System.out.println("Opção Invalida");
			break;
		}
		
		}while (true);
	}

	private void cadastrarCliente() {
		String nome = this.solicitarNome();
		TipoCliente tipocliente = this.solicitarTipoCliente();
		if(tipocliente == TipoCliente.PESSOA_FISICA) {
		
		}
		else {
		
		}
	}

	private String solicitarNome() {
		System.out.println("Digite o nome do cliente: ");
		return super.solicitarTexto();
	}

	private TipoCliente solicitarTipoCliente() {
		TipoCliente tipocliente;
		do {
		
		System.out.print("Digite o tipo de cliente [FISICO] ou [JURIDICO]: ");
		String valorDigitado = super.solicitarTexto();
		
		try {
		tipocliente = TipoCliente.valueOf(valorDigitado.toUpperCase());
		
		}catch(IllegalArgumentException excecao) {
			tipocliente = null;
			super.solicitarTexto();
			System.out.println("OPCAO INVALIDA");
												 }
		
		}while (tipocliente == null);
		
		return tipocliente;
	}
	

	private void imprimirMenu() {
		System.out.println("--------------MENU CLIENTE----------------");
		System.out.println("1-) CADASTRAR CLIENTE(Fisica ou Juridica)");
		System.out.println("2-) LISTAR CLIENTES");
		System.out.println("0-) VOLTAR AO MENU PRINCIPAL");
		System.out.println("---------------------------------------------");
		
}

	
}