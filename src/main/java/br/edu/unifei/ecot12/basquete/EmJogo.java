package br.edu.unifei.ecot12.basquete;

public class EmJogo implements Estado{

	public void inverter(Jogador j) {
		System.out.println(j.getNome() + " foi pro banco");
		j.setEstado(new NoBanco());
	}

}
