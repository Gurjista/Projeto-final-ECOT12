package br.edu.unifei.ecot12.basquete;

public class AlaArmador extends Jogador {
	int acerto = chance.nextInt(100);

	public void arremessode3() {
		System.out.println("Arremesso de 3");
		if (acerto>=20) {
			System.out.println("Marcou!");
			this.time.setPlacar(this.time.getPlacar() +3);	
		}else {System.out.println("Errou");}
	}
	@Override
	public void arremesso(){
		System.out.println("Arremesso");
		if (acerto>=10) {
			System.out.println("Marcou!");
			this.time.setPlacar(this.time.getPlacar() +2);
		}else {System.out.println("Errou");}
	}
}
