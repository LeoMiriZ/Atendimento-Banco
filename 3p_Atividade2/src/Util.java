
import static javax.swing.JOptionPane.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import static java.lang.Integer.parseInt;

public class Util {

	private Queue<Fila> fila = new LinkedList<>();
	int cronometro = 0;
	int[] qtdCod = new int[8];
	int qtdAtendimentos = 0;

	public void menu() {
		int expTempo = 0;
		int numTransacoes = 0;

			expTempo = parseInt(showInputDialog("Qual será o tempo (em segundos) de expediente?"));
			numTransacoes = parseInt(showInputDialog("Quantas transações serão realizadas?"));
			
			gerarFila(numTransacoes);

			expediente(expTempo);

			dadosDiario();

			

	}

	private void dadosDiario() {

		showMessageDialog(getRootFrame(), "Dados de Atendimento: \n "
				+ "Clientes atendidos: " + qtdAtendimentos
				+ "\n Atendimentos por transação: \n" + qtdCod[0] + " -> Saldo \n" + qtdCod[1] + " -> Saque \n"
				+ qtdCod[2] + " -> Aplicação \n" + qtdCod[3] + " -> Extrato Semanal \n "
				+ qtdCod[4] + " -> Extratos Mensal \n" + qtdCod[5] + " -> Pagamento de Conta com Dinheiro \n"
				+ qtdCod[6] + " -> Pagamento de Conta com Cheque \n"
				+ qtdCod[7] + " -> Pagamento de Conta com Saque \n"
				+ "Tempo médio de espera: " + (cronometro / (qtdAtendimentos)) + " segundos \n"
				+ "Clientes não atendidos: " + fila.size());

	}

	private void expediente(int expTempo) {

		int[] caixa = new int[3];

		for (; cronometro <= expTempo && fila.size() > 0; cronometro++) {
			for (int i = 0; i < caixa.length && fila.size() > 0; i++) {
				if (caixa[i] == 0) {

					Fila atendimento = fila.remove();

					caixa[i] = atendimento.getTempo();
					qtdCod[atendimento.getCod()]++;
					System.out.println(qtdCod[0]);
					qtdAtendimentos++;

				} else {
					caixa[i]--;
				}

			}

		}

	}

	private void gerarFila(int n) {

		int cod = 0;

		for (int i = 0; i < n; i++) {
			Random r = new Random();

			cod = r.nextInt(0, 8);
			transacao(cod);


		}

	}

	private void transacao(int cod) {
		int tempo;
		String transacao;

		switch (cod) {
		case 0:
			transacao = "Saldo";
			tempo = 10;
			fila.add(new Fila(transacao, tempo, cod));
			break;
		case 1:
			transacao = "Saque";
			tempo = 20;
			fila.add(new Fila(transacao, tempo, cod));
			break;
		case 2:
			transacao = "Aplicação";
			tempo = 30;
			fila.add(new Fila(transacao, tempo, cod));
			break;
		case 3:
			transacao = "Extrato semanal";
			tempo = 40;
			fila.add(new Fila(transacao, tempo, cod));
			break;
		case 4:
			transacao = "Extrato mensal";
			tempo = 50;
			fila.add(new Fila(transacao, tempo, cod));
			break;
		case 5:
			transacao = "Pagamento de conta com dinheiro";
			tempo = 60;
			fila.add(new Fila(transacao, tempo, cod));
			break;
		case 6:
			transacao = "Pagamento de conta com cheque";
			tempo = 70;
			fila.add(new Fila(transacao, tempo, cod));
			break;
		case 7:
			transacao = "Pagamento de conta com saque";
			tempo = 80;
			fila.add(new Fila(transacao, tempo, cod));
			break;

		}
	}
}
