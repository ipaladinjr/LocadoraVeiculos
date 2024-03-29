package br.com.tt.locadoraveiculos.model;

import br.com.tt.locadoraveiculos.model.enums.TipoCombustivel;

public abstract class Veiculo {
	
	protected String placa;
	protected String marca;
	protected String modelo;
	protected float quilometragem;
	protected TipoCombustivel tipoCombustivel;
	
	public Veiculo(String placa, String marca, String modelo, float quilometragem, TipoCombustivel tipoCombustivel) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.quilometragem = quilometragem;
		this.tipoCombustivel = tipoCombustivel;
	}
	
}
