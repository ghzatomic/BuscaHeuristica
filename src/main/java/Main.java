import java.util.List;

import br.com.caio.buscaheuristica.BuscaHeuristicaA;

public class Main {

    public static void main(String[] args) {
    	
    	BuscaHeuristicaA busca = new BuscaHeuristicaA();
    	
    	List<String> lista = busca.search("Dois Corregos", "Bauru", Mock.pegaDadosMocados());
    	
    	for (String string : lista) {
			System.out.println(string);
		}
    	
    }
}
