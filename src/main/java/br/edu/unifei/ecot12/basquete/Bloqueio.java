package br.edu.unifei.ecot12.basquete;

public class Bloqueio implements Comando {
	private Jogador jogador;
	public Bloqueio(Jogador jogador) {this.jogador = jogador;}
	
	public void executar() {
		jogador.bloqueio();
	}

}
