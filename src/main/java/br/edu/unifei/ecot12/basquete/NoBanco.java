package br.edu.unifei.ecot12.basquete;

public class NoBanco implements Estado {

	public void inverter(Jogador j) {
		System.out.println(j.getNome() + " entrou no jogo");
		j.setEstado(new EmJogo());
	}

}
