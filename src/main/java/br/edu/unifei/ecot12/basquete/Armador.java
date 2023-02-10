package br.edu.unifei.ecot12.basquete;

public class Armador extends Jogador {
	public void passepreciso(Jogador j) {
		System.out.println(this.getNome() + " fez um passe preciso para " + j.getNome());
	}
}
