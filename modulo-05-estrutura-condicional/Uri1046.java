import java.util.Scanner;

/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração
 *  do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, 
 *  tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início
e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.
 * 
 */
public class Uri1046 {

	public static void main(String[] args) {
		
		int tempoDeDuracaoDoJogo;
		
		Scanner sc = new Scanner(System.in);
		
		int horaDeInicioDoJogo = sc.nextInt();
		int horaDoFimDoJogo = sc.nextInt();
		
		if (horaDeInicioDoJogo < horaDoFimDoJogo) {
			tempoDeDuracaoDoJogo = horaDoFimDoJogo - horaDeInicioDoJogo;
		} else {
			tempoDeDuracaoDoJogo = 24 - horaDeInicioDoJogo + horaDoFimDoJogo;
		}
		
		System.out.println("O JOGO DUROU " + tempoDeDuracaoDoJogo + "hora(S)" );
		
		sc.close();
	}

}
