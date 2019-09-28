package br.com.tt.locadoraveiculos.model;

import br.com.tt.locadoraveiculos.model.enums.Cambio;
import br.com.tt.locadoraveiculos.model.enums.TipoCaminhao;
import br.com.tt.locadoraveiculos.model.enums.TipoCombustivel;

public class Caminhão extends Veiculo {
	
	public Caminhão(String placa, String marca, String modelo, float quilometragem,
			TipoCombustivel tipoCombustivel,TipoCaminhao tipocaminhao,Cambio cambio) 
	{
	super(placa, marca, modelo, quilometragem, tipoCombustivel);
	this.tipocaminhao = tipocaminhao;
	this.cambio = cambio;
	}
	private TipoCaminhao tipocaminhao;
	private Cambio cambio;
	
	@Override
	  public String toString() {
	    return String.format("Veiculo#Caminhao[placa=%s,marca=%s,modelo=%s,"
	    		+ "quilometragem=%.1f,tipoCombustivel=%s,tipo=%s,cambio=%s]", 
	        placa, 
	        marca, 
	        modelo, 
	        quilometragem, 
	        tipoCombustivel, 
	        tipocaminhao, 
	        cambio);
	  }
}
