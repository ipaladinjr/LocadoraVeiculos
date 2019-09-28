package br.com.tt.locadoraveiculos.view;

import java.util.InputMismatchException;
import java.util.List;

import br.com.tt.locadoraveiculos.infra.BancoDados;
import br.com.tt.locadoraveiculos.model.Caminhão;
import br.com.tt.locadoraveiculos.model.Carro;
import br.com.tt.locadoraveiculos.model.Moto;
import br.com.tt.locadoraveiculos.model.Veiculo;
import br.com.tt.locadoraveiculos.model.enums.Cambio;
import br.com.tt.locadoraveiculos.model.enums.Cilindrada;
import br.com.tt.locadoraveiculos.model.enums.NumeroPortas;
import br.com.tt.locadoraveiculos.model.enums.TipoCaminhao;
import br.com.tt.locadoraveiculos.model.enums.TipoCarro;
import br.com.tt.locadoraveiculos.model.enums.TipoCombustivel;
import br.com.tt.locadoraveiculos.model.enums.TipoVeiculo;

public class TelaVeiculo extends Tela {

	@Override
	public void apresentarTela() {
		do {
		this.imprimirMenu();
		int opcaoUsuario = super.solicitarOpcaoNumerica();
		switch (opcaoUsuario) {
		case 1:
			System.out.println("Voce selecionou 'CADASTRAR VEICULO' ");
			this.cadastrarVeiculo();
			break;
		
		case 2:
			System.out.println("Voce selecionou 'LISTAR VEICULOS' ");
			this.listarVeiculos();
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
	
	private void listarVeiculos() {
		BancoDados bancoDados = BancoDados.getUnicaInstancia();
		List<Veiculo> veiculos = bancoDados.listarTodosVeiculos();
		
		for(Veiculo veiculo : veiculos) {
			System.out.println(veiculo);
			
		}
	}

	private void cadastrarVeiculo() {
		TipoVeiculo tipoveiculo = this.solicitarTipoVeiculo();
		String placa = this.solicitarPlaca();
		String marca = this.solicitarMarca();
		String modelo = this.solicitarModelo();
		float quilometragem = this.solicitarQuilometragem();
		TipoCombustivel tipoCombustivel = this.solicitarTipoCombustivel();
		Veiculo veiculo;
			if(tipoveiculo == TipoVeiculo.CARRO){
				TipoCarro tipocarro = this.solicitarTipoCarro();
				Cambio cambio = this.solicitarTipoCambio();
				NumeroPortas numeroportas = this.solicitarNumeroPortas();										
				
				veiculo = new Carro(placa,marca,modelo,quilometragem,tipoCombustivel,tipocarro,cambio,numeroportas);
			}
			else if(tipoveiculo == TipoVeiculo.CAMINHAO) {
				Cambio cambio = this.solicitarTipoCambio();
				TipoCaminhao tipocaminhao = this.solicitarTipoCaminhao();
				veiculo = new Caminhão(placa,marca,modelo,quilometragem,tipoCombustivel,tipocaminhao,cambio);
			}
			
			else {
				Cilindrada cilindrada = this.solicitarCilindrada();
				veiculo = new Moto(placa,marca,modelo,quilometragem,tipoCombustivel,cilindrada);
				}
		BancoDados bancoDados = BancoDados.getUnicaInstancia();
		bancoDados.incluirVeiculo(veiculo);
		System.out.println("Veiculo incluido com sucesso");
	}
	

	

	private Cilindrada solicitarCilindrada() {
		Cilindrada cilindrada;
		do {
		
		System.out.print("Digite o tipo de Combustivel [CC125],[CC250],[CC500] ou [CC1000]: ");
		String valorDigitado = super.solicitarTexto();
		
		try {
		cilindrada = Cilindrada.valueOf(valorDigitado.toUpperCase());
		
		}catch(IllegalArgumentException excecao) {
			cilindrada = null;
			super.solicitarTexto();
			System.out.println("OPCAO INVALIDA");
												 }
		
		}while (cilindrada == null);
		
		return cilindrada;
	}

	private TipoCaminhao solicitarTipoCaminhao() {
		TipoCaminhao tipocaminhao;
		do {
		
		System.out.print("Digite o tipo de Combustivel [URBANO CARGA],[TRES QUARTOS],[SEMIPESADO],[PESADO],[CARRETA] ou [COMBINADO]: ");
		String valorDigitado = super.solicitarTexto();
		
		try {
		tipocaminhao = TipoCaminhao.valueOf(valorDigitado.toUpperCase());
		
		}catch(IllegalArgumentException excecao) {
			tipocaminhao = null;
			super.solicitarTexto();
			System.out.println("OPCAO INVALIDA");
												 }
		
		}while (tipocaminhao == null);
		
		return tipocaminhao;
	}

	private NumeroPortas solicitarNumeroPortas() {
		NumeroPortas numeroportas;
		do {
		
		System.out.print("Digite o tipo de Combustivel [DUAS PORTAS] ou [QUATRO PORTAS]: ");
		String valorDigitado = super.solicitarTexto();
		
		try {
		numeroportas = NumeroPortas.valueOf(valorDigitado.toUpperCase());
		
		}catch(IllegalArgumentException excecao) {
			numeroportas = null;
			super.solicitarTexto();
			System.out.println("OPCAO INVALIDA");
												 }
		
		}while (numeroportas == null);
		
		return numeroportas;
	}

	private Cambio solicitarTipoCambio() {
		Cambio cambio;
		do {
		
		System.out.print("Digite o tipo de Combustivel [MANUAL],[AUTOMATICO] ou [SEMIAUTOMATICO]: ");
		String valorDigitado = super.solicitarTexto();
		
		try {
		cambio = Cambio.valueOf(valorDigitado.toUpperCase());
		
		}catch(IllegalArgumentException excecao) {
			cambio = null;
			super.solicitarTexto();
			System.out.println("OPCAO INVALIDA");
												 }
		
		}while (cambio == null);
		
		return cambio;
	}

	private TipoCarro solicitarTipoCarro() {
		TipoCarro tipoCarro;
		do {
		
		System.out.print("Digite o tipo de Combustivel [HATCH],[SEDAN],[SUV] ou [PICKUP]: ");
		String valorDigitado = super.solicitarTexto();
		
		try {
		tipoCarro = TipoCarro.valueOf(valorDigitado.toUpperCase());
		
		}catch(IllegalArgumentException excecao) {
			tipoCarro = null;
			super.solicitarTexto();
			System.out.println("OPCAO INVALIDA");
												 }
		
		}while (tipoCarro == null);
		
		return tipoCarro;
	
	}

	private TipoCombustivel solicitarTipoCombustivel() {
		TipoCombustivel tipoCombustivel;
		do {
		
		System.out.print("Digite o tipo de Combustivel [ALCOOL],[FLEX],[GASOLINA],[DIESEL] ou [GNV]: ");
		String valorDigitado = super.solicitarTexto();
		
		try {
		tipoCombustivel = TipoCombustivel.valueOf(valorDigitado.toUpperCase());
		
		}catch(IllegalArgumentException excecao) {
			tipoCombustivel = null;
			super.solicitarTexto();
			System.out.println("OPCAO INVALIDA");
												 }
		
		}while (tipoCombustivel == null);
		
		return tipoCombustivel;
	}

	private float solicitarQuilometragem() {
		Float quilometragem;	
		do {
		System.out.println("Digite a quilometragem: ");
		try {
		quilometragem = super.solicitarNumeroFloat();
		}catch(InputMismatchException excecao) {
			quilometragem = null;
			super.solicitarTexto();
			System.out.println(" Quilometragem Invalida ");
			
		}
			}while(quilometragem == null);
		
			return quilometragem;	
		}

	private String solicitarModelo() {
		System.out.println("Digite o modelo: ");
		return super.solicitarTexto();
	}

	private String solicitarMarca() {
		System.out.println("Digite a marca: ");
		return super.solicitarTexto();
	}

	private String solicitarPlaca() {
		System.out.println("Digite a placa: ");
		return super.solicitarTexto();
	}

	private TipoVeiculo solicitarTipoVeiculo() {
		TipoVeiculo tipoVeiculo;
		do {
		
		System.out.print("Digite o tipo de veiculo [CAMINHAO],[CARRO] ou [MOTO]: ");
		String valorDigitado = super.solicitarTexto();
		
		try {
		tipoVeiculo = TipoVeiculo.valueOf(valorDigitado.toUpperCase());
		
		}catch(IllegalArgumentException excecao) {
			tipoVeiculo = null;
			super.solicitarTexto();
			System.out.println("OPCAO INVALIDA");
												 }
		
		}while (tipoVeiculo == null);
		
		return tipoVeiculo;
	}

	private void imprimirMenu() {
		System.out.println("--------------MENU VEICULOS----------------");
		System.out.println("1-) CADASTRAR VEICULO");
		System.out.println("2-) LISTAR VEICULOS");
		System.out.println("0-) VOLTAR AO MENU PRINCIPAL");
		System.out.println("---------------------------------------------");
	}
	

}
