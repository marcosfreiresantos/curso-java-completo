import java.util.Scanner;

/*
A Federação Gaúcha de Futebol contratou você para escrever um programa para 
fazer uma estatística do resultado de vários GRENAIS. Escreva um programa para 
ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL. Logo após 
escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma resposta. 
Se a resposta for 1, o algoritmo deve ser executado novamente solicitando 
o número de gols marcados pelos times em uma nova partida, caso contrário 
deve ser encerrado imprimindo:

- Quantos GRENAIS fizeram parte da estatística.
- O número de vitórias do Inter.
- O número de vitórias do Grêmio.
- O número de Empates.
- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS 
(ou "Nao houve vencedor", caso termine empatado).

Entrada
O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols marcados
pelo Inter e pelo Grêmio respectivamente. Em seguida háverá um inteiro (1 ou 2),
correspondente à repetição do programa.

Saída
Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal 
(1-sim 2-nao)". Quando o algoritmo for encerrado devem ser mostradas as 
estatísticas conforme a descrição apresentada acima. Obs: a palavra "Gremio" 
deve ser impressa sem acento, conforme o exemplo abaixo.
 */
public class Uri1131 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int novoGrenal = 1;
		int quantidadeDeGrenais = 0;
		int vitoriasInter = 0;
		int vitoriasGremio = 0;
		int empate = 0;

		
		while (novoGrenal == 1) {
			int golsInter = sc.nextInt();
			int golsGremio = sc.nextInt();

			quantidadeDeGrenais += 1;

			if (golsInter > golsGremio) {
				vitoriasInter += 1;
			} else if (golsInter < golsGremio) {
				vitoriasGremio += 1;
			} else {
				empate += 1;
			}
			
			System.out.println("Novo Grenal (1-sim 2-nao)");
			novoGrenal = sc.nextInt();

		}
		System.out.println(quantidadeDeGrenais + " grenais");
		System.out.println("inter: " + vitoriasInter);
		System.out.println("Gremio: " + vitoriasGremio);
		System.out.println("Empate: " + empate);
		
		if (vitoriasInter > vitoriasGremio) {
			System.out.println("Inter venceu mais");
		} else if (vitoriasInter < vitoriasGremio) {
			System.out.println("Gremio Venceu mais");
		} else {
			System.out.println("Não houve vencedor");
		}
		 
		sc.close();
	}

}
