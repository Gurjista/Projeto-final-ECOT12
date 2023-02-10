package br.edu.unifei.ecot12.basquete;

import java.util.Random;

public abstract class Jogador {
	private String nome;
	private float altura;
	private int numero;
	private float peso;
	private Estado estado;
	protected Time time;
	private Tenis tenis;
	protected Random chance = new Random();
	
	public void substituir() {
		estado.inverter(this);
	}
	
	public void arremesso() {
		System.out.println("arremesso");
		int acerto = chance.nextInt(100);
		if (acerto>=30) {
			System.out.println("Marcou!");
			this.time.setPlacar(this.time.getPlacar()+2);
		}else {System.out.println("Errou");}
	}
	public void rebote() {
		System.out.println("rebote");
	}
	public void passe(Jogador j) {
		System.out.println(this.getNome() + " passou para " + j.getNome());
	}
	public void bloqueio() {
		System.out.println("bloqueio");
	}
	public void drible() {
		System.out.println("drible");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Tenis getTenis() {
		return tenis;
	}

	public void setTenis(Tenis tenis) {
		this.tenis = tenis;
	}
	
	
	
}
