package buscaLargura;

public class BuscaLargura_Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Grafo g = new Grafo();
   
        
        No n1 = new No(1);
        No n2 = new No(2);
        No n3 = new No(3);
        No n4 = new No(4);
        No n5 = new No(5);
        No n6 = new No(6);
        No n7 = new No(7);
        No n8 = new No(8);
        No n9 = new No(9);
        No n10 = new No(10);
        No n11 = new No(11);
        No n12 = new No(12);
        No n13 = new No(13);
        No n14 = new No(14);
        No n15 = new No(15);
        
        g.adcAresta(n1, n2);
        g.adcAresta(n2, n5);
        g.adcAresta(n2, n6);
        g.adcAresta(n3, n7);
        g.adcAresta(n7, n9);
        g.adcAresta(n7, n8);
        g.adcAresta(n8, n10);
        g.adcAresta(n8, n11);
        g.adcAresta(n8, n12);
        g.adcAresta(n11, n13);
        g.adcAresta(n4, n14);
        g.adcAresta(n14, n15);
        g.adcAresta(n1, n3);
        g.adcAresta(n1, n4);
   
        g.setRoot(n1);
        
        System.out.println("Busca em Largura\nStatus:\tInicio\n\n");
        g.busca_largura(13);


	}

}
