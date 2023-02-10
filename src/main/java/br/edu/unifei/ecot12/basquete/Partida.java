package br.edu.unifei.ecot12.basquete;

import java.util.Date;

public class Partida {
	private Date data;
	private Time times[] = new Time[2];
	private Quadra quadra;
	
	public void vencedor() {
		System.out.println(times[0].getNome() + ": " + times[0].getPlacar() + " " + times[1].getNome() + ": " + times[1].getPlacar());
		if(times[0].getPlacar() > times[1].getPlacar()) {
			System.out.println("" + times[0].getNome() + " venceu!");
		}else if(times[0].getPlacar() < times[1].getPlacar()){
			System.out.println(""+ times[1].getNome() + " venceu!");
		}else {
			System.out.println("Empate!");
		}
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Time[] getTimes() {
		return times;
	}

	public void setTimes(Time[] times) {
		this.times = times;
	}

	public Quadra getQuadra() {
		return quadra;
	}

	public void setQuadra(Quadra quadra) {
		this.quadra = quadra;
	}
	
}
