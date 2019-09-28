package br.com.tt.locadoraveiculos.model;

import br.com.tt.locadoraveiculos.model.enums.Cilindrada;
import br.com.tt.locadoraveiculos.model.enums.TipoCombustivel;

public class Moto extends Veiculo {
		
	public Moto(String placa, String marca, String modelo, float quilometragem, TipoCombustivel tipoCombustivel,Cilindrada cilindrada) {
		super(placa, marca, modelo, quilometragem, tipoCombustivel);
		this.cilindrada = cilindrada;
		
	}

	private Cilindrada cilindrada;

	@Override
	public String toString() {
		return String.format(
				"Veiculo#Moto[placa=%s,marca=%s,modelo=%s,quilometragem=%.1f,"
				+ "tipoCombustivel=%s,cilindrada=%s]", 
				placa,
				marca, 
				modelo, 
				quilometragem, 
				tipoCombustivel, 
				cilindrada);
	}

}

