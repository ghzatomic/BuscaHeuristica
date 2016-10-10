package br.com.caio.buscaheuristica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class BuscaHeuristicaA {
	
	public List< String > search(String origem, String destino,List<Node> nos) {
		Set< Node > jaExplorado = new HashSet< Node >();
		
		
		// Quando eu adiciono um dado nesse objeto, ele ordena pelo score
		PriorityQueue< Node > queue = new PriorityQueue< Node >(( l, r ) -> 
					Double.compare( l.getScore(), r.getScore() ) 
		);
		
		// Pego o no de Origem
		Node noOrigem = getNodeByNome(origem, nos);
		// Pego o no de Destino
		Node noDestino = getNodeByNome(destino, nos);
		noOrigem.setCoeficiente( 0 ); 
		
		//Adiciono a origem
		queue.add( noOrigem );

		boolean found = false;

		//Enquanto eu nao achar o destino
		while ( ( !queue.isEmpty() ) && ( !found ) ) {
			Node atual = queue.poll();
			jaExplorado.add( atual );
			
			//Se o no atual for o de destino, achei !
			if ( atual.getLabel().equals( noDestino.getLabel() ) ) {
				found = true;
			}
			
			//Olho cada vertice dos nos
			for ( Node e : atual.getVertice() ) {
				//Busco o no pelo nome
				Node filho = getNodeByNome(e.getLabel(), nos);
				//Verifico qual eh o custo 
				double custo = e.getDistancia();
				double temp_g_scores = atual.getCoeficiente() + custo;
				
				//Verifico se ja passei pelo no e se o score do filho e maior que o do pai
				if ( ( jaExplorado.contains( filho ) ) && ( temp_g_scores >= filho.getScore() ) ) {
					continue;
			    //Verifico se a fila nao tem o filho OU se o score eh menor que o do filho
				}else if ( ( !queue.contains( filho ) ) || ( temp_g_scores < filho.getScore() ) ) {
					//Falo quem eh o pai do filho
					filho.setParente( atual );
					//Seto o quanto ja foi gasto total de "distancia"
					filho.setCoeficiente( temp_g_scores );
					
					//Seto o quanto ja foi gasto total de "distancia"
					filho.setScore( temp_g_scores );
					
					//Se ja existe o filho na fila eu removo  
					if ( queue.contains( filho ) ) {
						queue.remove( filho );
					}
					// adiciono ele novamente com os valores atualizados
					queue.add( filho );
				}
				
			}
		}
		
		
		List<String> sequenciaDeSaida = new ArrayList<String>();
		for (Node node : getSequence( noDestino )) {
			sequenciaDeSaida.add(node.getLabel());
		}
		return sequenciaDeSaida;
		//return getSequence( noDestino ).stream().map( n ->n.getLabel() ).collect( Collectors.toList() );
	}
	
	public List< Node > getSequence( Node target ) {
		List< Node > path = new ArrayList< Node >();

		for ( Node node = target; node != null; node = node.getParente() ) {
			path.add( node );
		}

		Collections.reverse( path );

		return path;
	}
	
	public Node getNodeByNome(String nome,List<Node> nos){
		if (nos != null){
			for (Node node : nos) {
				if (node.getLabel().equals(nome)){
					return node;
				}
			}
			return null;
		}else{
			return null;
		}
	}
	
}
