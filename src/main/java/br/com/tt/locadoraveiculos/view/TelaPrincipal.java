package br.com.tt.locadoraveiculos.view;

public class  TelaPrincipal extends Tela {
		@Override
		public void apresentarTela() {
			do {
				this.imprimirMenu();
				int opcaoUsuario = super.solicitarOpcaoNumerica();
				Tela tela;
				switch (opcaoUsuario) {
				case 1:
					System.out.println("Voce selecionou 'TELA DE VEICULOS' ");
					tela = new TelaVeiculo();
					tela.apresentarTela();
					break;
				
				case 2:
					System.out.println("Voce selecionou 'TELA DE CLIENTES' ");
					//tela = new TelaCliente();
					//tela.apresentarTela();
					break;
				
				case 3:
					System.out.println("Voce selecionou 'TELA DE LOCAÇÕES' ");
					//tela = new TelaLocacoes();
					//tela.apresentarTela();
					break;
				
				case 0:
					System.out.println("Voce selecionou 'ENCERRAR O PROGRAMA' ");
					return;
					
				default:
					System.out.println("Opção Invalida");
					break;
				}
					
				
			}while (true);
			
		}

		private void imprimirMenu() {
			System.out.println("--------------MENU PPRINCIPAL----------------");
			System.out.println("1-) TELA DE VEICULOS");
			System.out.println("2-) TELA DE CLIENTES");
			System.out.println("3-) TELA DE LOCAÇÕES");
			System.out.println("0-) SAIR DO PROGRAMA");
			System.out.println("---------------------------------------------");
		}
}
