package br.edu.unifei.ecot12.basquete;

public class Arremesso implements Comando {
	private Jogador jogador;
	public Arremesso(Jogador jogador) {this.jogador = jogador;}
	
	public void executar() {
		jogador.arremesso();
	}

}
