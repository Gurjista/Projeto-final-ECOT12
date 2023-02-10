package br.edu.unifei.ecot12.basquete;

public class Rebote implements Comando {
	private Jogador jogador;
	public Rebote(Jogador jogador) {this.jogador = jogador;}
	
	public void executar() {
		jogador.rebote();
	}

}
