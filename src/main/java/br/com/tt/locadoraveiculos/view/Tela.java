package br.com.tt.locadoraveiculos.view;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;

public abstract class Tela {
	
	protected Scanner scanner;

	public Tela() {
		this.scanner = new Scanner(System.in);
	}
	
	public abstract void apresentarTela();
	int  numero;
	
	protected int solicitarOpcaoNumerica() {
	try {
		numero = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		} catch (InputMismatchException excecao) {
			numero = -9999;
			scanner.nextLine();
		}
		return numero;
	}
	
	protected float solicitarNumeroFloat() {
		
			float numero = scanner.nextFloat();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");	
			return numero;
		}
		
	
	
	protected double solicitarNumeroDouble() {
		
		return 0;
	}
	
	protected String solicitarTexto() {
		
		return scanner.nextLine();
	}
	
	protected LocalDate solicitarData() {
		
	return null;
		
	}
	
}
