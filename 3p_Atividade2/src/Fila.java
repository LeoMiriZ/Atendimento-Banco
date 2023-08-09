
public class Fila {
	
	private String transacao;
	private int cod;
	private int tempo;
	
	
	public Fila(String transacao , int tempo, int cod) {
		this.transacao = transacao;
		this.cod = cod;
		this.tempo = tempo;
		
	}
	
	
	public Fila(String transacao, int tempo) {
		this.transacao = transacao;
		this.tempo = tempo;
	}


	public String getTransacao() {
		return transacao;
	}
	public void setTransacao(String transacao) {
		this.transacao = transacao;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
}
