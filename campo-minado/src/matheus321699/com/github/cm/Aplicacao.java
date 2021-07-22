package matheus321699.com.github.cm;

import matheus321699.com.github.cm.modelo.Tabuleiro;
import matheus321699.com.github.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);		
		new TabuleiroConsole(tabuleiro);
		
		
	}

}
