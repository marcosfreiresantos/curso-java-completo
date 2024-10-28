package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); //ArrayList classe que implementa a interface(List)

		list.add("Marcos");
		list.add("Esther");
		list.add("Natalia");
		list.add(3, "Caramelo");
		list.add(4, "Fred");
		list.add(2, "Maria");
		list.add("Elaine");
		
		
		//list.remove(2);
		//list.remove("Caramelo");
		
		System.out.println("Tamanho da lista.: " + list.size() + " posições");
		
		
		//para cada String x pertencente à minha lista list
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		//remover todo String x tal que x.charAt(0) seja == 'M'
		list.removeIf(x -> x.charAt(0) == 'M');//predicado
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Index of Caramelo: " + list.indexOf("Caramelo"));
		System.out.println("Index of Marcos: " + list.indexOf("Marcos"));
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'E').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
