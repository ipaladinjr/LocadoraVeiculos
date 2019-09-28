package br.com.tt.locadoraveiculos.model;

import br.com.tt.locadoraveiculos.model.enums.Cambio;
import br.com.tt.locadoraveiculos.model.enums.NumeroPortas;
import br.com.tt.locadoraveiculos.model.enums.TipoCarro;
import br.com.tt.locadoraveiculos.model.enums.TipoCombustivel;

public class Carro extends Veiculo {
	public Carro(String placa, String marca, String modelo, float quilometragem,
		TipoCombustivel tipoCombustivel,TipoCarro tipocarro,Cambio cambio,NumeroPortas numeroportas ) {
		super(placa, marca, modelo, quilometragem, tipoCombustivel);
		this.cambio = cambio;
		this.numeroportas = numeroportas;
		this.tipocarro = tipocarro;
	}
	private Cambio cambio;
	private NumeroPortas numeroportas;
	private TipoCarro tipocarro;
	
	@Override
	  public String toString() {
	    return String.format("Veiculo#Carro[placa=%s,marca=%s,modelo=%s,"
	    		+ "quilometragem=%.1f,tipoCombustivel=%s,tipo=%s,cambio=%s,"
	    		+ "numeroPortas=%s]", 
	        placa, 
	        marca, 
	        modelo, 
	        quilometragem, 
	        tipoCombustivel, 
	        tipocarro, 
	        cambio, 
	        numeroportas);
	  }
}
