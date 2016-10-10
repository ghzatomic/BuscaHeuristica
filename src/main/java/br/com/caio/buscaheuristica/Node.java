package br.com.caio.buscaheuristica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Node implements Serializable{
	private static final long serialVersionUID = 1L;

	private String label;

	private List< Node > vertice;
	private int distancia;
	private double score;
	private double coeficiente;
	private Node parente;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}
	
	public Node(String lbl, int distancia) {
		this.label = lbl;
		this.distancia = distancia;
	}
	
	public Node(String lbl) {
		this(lbl,0);
	}
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public List<Node> getVertice() {
		if (vertice == null){
			vertice = new ArrayList<Node>();
		}
		return vertice;
	}
	public void setVertice(List<Node> vertice) {
		this.vertice = vertice;
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public double getCoeficiente() {
		return coeficiente;
	}
	public void setCoeficiente(double coeficiente) {
		this.coeficiente = coeficiente;
	}
	public Node getParente() {
		return parente;
	}
	public void setParente(Node parente) {
		this.parente = parente;
	}

}