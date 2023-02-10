package br.edu.unifei.ecot12.basquete;

import java.util.ArrayList;
import java.util.List;

public abstract class Time {
	private String nome;
	private String cidade;
	private Quadra quadra;
	private int placar;
	private List<Jogador> jogadores = new ArrayList<Jogador>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Quadra getQuadra() {
		return quadra;
	}
	public void setQuadra(Quadra quadra) {
		this.quadra = quadra;
	}
	public List<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	public int getPlacar() {
		return placar;
	}
	public void setPlacar(int placar) {
		this.placar = placar;
	}
	
	
}
