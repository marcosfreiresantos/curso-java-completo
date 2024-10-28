import java.util.Scanner;

/*
 * Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. 
 * A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
 * 
 * 
 */
public class Uri1047 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal = sc.nextInt();
		
		int instanteInicial = horaInicial * 60 + minutoInicial;
		int instanteFinal = horaFinal * 60 + minutoFinal;
		
		int duracao;
		
		if (instanteInicial < instanteFinal) {
			duracao = instanteFinal - instanteInicial;
		}else {
			duracao = (24 * 60 - instanteInicial) + instanteFinal;
		}
		
		int duracaoHoras = duracao / 60;
		int duracaoMinutos = duracao % 60;
		
		System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + "MINUTO(S)" );
	
		sc.close();
	}

}
