package br.com.tt.locadoraveiculos.infra;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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

public class BancoDados {
	
		private static BancoDados unicaInstancia;
		private List<Veiculo> veiculos;
			
		private BancoDados() {
	
			this.veiculos = new LinkedList<>(Arrays.asList(
			        new Carro("AAA1234", "PEUGEOT", "203", 0f, 
			        		TipoCombustivel.FLEX, TipoCarro.HATCH, 
			        		Cambio.MANUAL, NumeroPortas.QUATRO_PORTAS),
			        new Caminhão("AAA1235", "VOLVO", "V1", 0, 
			        		TipoCombustivel.DIESEL, TipoCaminhao.TRES_QUARTOS, 
			        		Cambio.AUTOMATICO),
			        new Moto("AAA1236", "Kawasaki", "Ninja", 0, 
			        		TipoCombustivel.GASOLINA, Cilindrada.CC1000)));
			
			
						}
		
		public static BancoDados getUnicaInstancia() {
			
			if(unicaInstancia == null) {
				
				unicaInstancia = new BancoDados();
									   }
			return unicaInstancia;
			
		}

		public void incluirVeiculo(Veiculo veiculo) {
			veiculos.add(veiculo);
			
		}

		public List<Veiculo> listarTodosVeiculos() {
			
			return veiculos;
		}
}
