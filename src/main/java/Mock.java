import java.util.ArrayList;
import java.util.List;

import br.com.caio.buscaheuristica.Node;


public class Mock {

	public static List<Node> pegaDadosMocados(){
		
		List<Node> ret = new ArrayList<Node>();
		
		Node noDoisCorregos = new Node("Dois Corregos");
		noDoisCorregos.getVertice().add(new Node("Guarapua", 16));
		noDoisCorregos.getVertice().add(new Node("Mineiros do Tiete", 12));
		
		Node noGuarapua = new Node("Guarapua");
		noGuarapua.getVertice().add(new Node("Jau", 29));
		
		Node noMineirosDoTiete = new Node("Mineiros do Tiete");
		noMineirosDoTiete.getVertice().add(new Node("Jau", 20));
		noMineirosDoTiete.getVertice().add(new Node("Barra Bonita", 16));
		
		Node noJau = new Node("Jau");
		noJau.getVertice().add(new Node("Pederneiras", 27));
		noJau.getVertice().add(new Node("Macatuba", 44));
		noJau.getVertice().add(new Node("Barra Bonita", 20));
		
		Node noBarraBonita = new Node("Barra Bonita");
		noBarraBonita.getVertice().add(new Node("Macatuba", 26));
		
		Node noMacatuba = new Node("Macatuba");
		noMacatuba.getVertice().add(new Node("Bauru", 53));
		
		Node noPederneiras = new Node("Pederneiras");
		noPederneiras.getVertice().add(new Node("Bauru", 31));
		
		Node noBauru = new Node("Bauru");
		
		ret.add(noDoisCorregos);
		ret.add(noGuarapua);
		ret.add(noMineirosDoTiete);
		ret.add(noJau);
		ret.add(noBarraBonita);
		ret.add(noPederneiras);
		ret.add(noMacatuba);
		ret.add(noBauru);
		
		return ret;
	}
	
}
