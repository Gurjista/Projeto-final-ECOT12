package br.edu.unifei.ecot12.basquete;

public class Drible implements Comando {
	private Jogador jogador;
	public Drible(Jogador jogador) {this.jogador = jogador;}
	
	public void executar() {
		jogador.drible();
	}

}
