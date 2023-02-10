package br.edu.unifei.ecot12.basquete;

public class AlaDeForca extends Jogador {
	public void enterrada() {
		System.out.println("enterrada");
		this.time.setPlacar(this.time.getPlacar() +2);
	}
}
