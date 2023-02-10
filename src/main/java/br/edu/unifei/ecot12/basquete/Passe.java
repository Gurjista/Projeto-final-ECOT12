package br.edu.unifei.ecot12.basquete;

public class Passe implements Comando {
	private Jogador jogador;
	private Jogador j;
	public Passe(Jogador jogador, Jogador j) {this.jogador = jogador; this.j=j;}
	
	public void executar() {
		jogador.passe(j);
	}

}
