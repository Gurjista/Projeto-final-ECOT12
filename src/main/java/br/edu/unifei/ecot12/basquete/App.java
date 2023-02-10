package br.edu.unifei.ecot12.basquete;

public class App {

	public static void main(String[] args) {
		Profissional gs = new Profissional();
		Profissional la = new Profissional();
		Quadra q = new Quadra();
		q.setNome("Chase Center");
		gs.setQuadra(q);
		gs.setNome("Warriors");
		gs.setCidade("Sao Francisco");
		gs.setLiga("Western Pacific");
		la.setNome("Lakers");
		la.setCidade("Los Angeles");
		la.setLiga("Western Pacific");
		
		Armador pg0 = new Armador();
		Ala sf0 = new Ala();
		AlaArmador sg0 = new AlaArmador();
		AlaDeForca pf0 = new AlaDeForca();
		Pivo c0 = new Pivo();
		pg0.setNome("Stephen Curry");
		pg0.setAltura(1.88f);
		pg0.setNumero(30);
		pg0.setPeso(84f);
		pg0.setTime(gs);
		Tenis t = new Tenis();
		t.setMarca("Curry");
		t.setModelo("4s");
		t.setTamanho(13.5f);
		pg0.setTenis(t);
		sf0.setNome("Klay Thompson");
		sf0.setTime(gs);
		sf0.setNumero(11);
		sg0.setNome("Moses Moody");
		sg0.setNumero(4);
		sg0.setTime(gs);
		pf0.setNome("Draymond Green");
		pf0.setNumero(23);
		pf0.setTime(gs);
		c0.setNome("James Wiseman");
		c0.setNumero(33);
		c0.setTime(gs);
		gs.getJogadores().add(c0);
		gs.getJogadores().add(pg0);
		gs.getJogadores().add(sg0);
		gs.getJogadores().add(sf0);
		gs.getJogadores().add(pf0);
		for (Jogador j : gs.getJogadores()) {
			j.setEstado(new EmJogo());
		}
		
		Armador pg1 = new Armador();
		Ala sf1 = new Ala();
		AlaArmador sg1 = new AlaArmador();
		AlaDeForca pf1 = new AlaDeForca();
		AlaDeForca pf2 = new AlaDeForca();
		Pivo c1 = new Pivo();
		sf1.setNome("LeBron James");
		sf1.setNumero(6);
		sf1.setTime(la);
		pg1.setNome("Russel Westbrook");
		pg1.setNumero(0);
		pg1.setTime(la);
		pf1.setNome("Anthony Davis");
		pf1.setNumero(3);
		pf1.setTime(la);
		sg1.setNome("Kendrick Nunn");
		sg1.setNumero(12);
		sg1.setTime(la);
		c1.setNome("Thomas Bryant");
		c1.setNumero(13);
		c1.setTime(la);
		pf2.setNome("Carmelo Anthony");
		pf2.setNumero(7);
		pf2.setTime(la);
		la.getJogadores().add(c1);
		la.getJogadores().add(pg1);
		la.getJogadores().add(sg1);
		la.getJogadores().add(sf1);
		la.getJogadores().add(pf1);
		for (Jogador j : la.getJogadores()) {
			j.setEstado(new EmJogo());
		}
		la.getJogadores().add(pf2);
		pf2.setEstado(new NoBanco());
		
		Partida p = new Partida();
		p.setQuadra(q);
		Profissional times[] = new Profissional[] {gs,la};
		p.setTimes(times);
		
		sf0.drible();
		sf0.passe(pg0);
		pg0.passepreciso(pf0);
		pf0.enterrada();
		c1.passe(sf1);
		sf1.drible();
		sf1.passe(sg1);
		sg1.arremessode3();
		sf0.drive();
		sf0.passe(c0);
		c0.drible();
		c0.passe(pf0);
		c1.defesaAmpla();
		pf0.enterrada();
		pf1.substituir();
		pf2.substituir();
		pf2.drible();
		pf2.passe(sf1);
		sf0.bloqueio();
		sf0.arremesso();
		c1.rebote();
		
		JogadaEnsaida je = new JogadaEnsaida();
		je.getComandos().add(new Passe(pg0,sf0));
		je.getComandos().add(new Drible(sf0));
		je.getComandos().add(new Passe(sf0,pf0));
		je.getComandos().add(new Bloqueio(c0));
		je.getComandos().add(new Bloqueio(pg0));
		je.getComandos().add(new Passe(pf0,sg0));
		je.getComandos().add(new Arremesso(sg0));
		je.estrategia();
		
		p.vencedor();
		
	}

}
