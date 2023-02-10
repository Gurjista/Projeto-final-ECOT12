package br.edu.unifei.ecot12.basquete;

import java.util.ArrayList;
import java.util.List;

public class JogadaEnsaida {
	private List<Comando> comandos = new ArrayList<Comando>();
	
	public void estrategia() {
		for (Comando c : comandos) {
			c.executar();
		}
	}

	public List<Comando> getComandos() {
		return comandos;
	}

	public void setComandos(List<Comando> comandos) {
		this.comandos = comandos;
	}
	
}
