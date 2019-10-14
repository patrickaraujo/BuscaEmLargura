package buscaLargura;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
	//Número de vértices
    int v;
    List<No> no = new ArrayList<>();
    No root;

    public No getRoot() {
        return root;
    }

    public void setRoot(No root) {
        this.root = root;
    }
    
    public Grafo() {
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public List<No> getNo() {
        return no;
    }

    public void setNo(List<No> no) {
        this.no = no;
    }
    
    void busca_largura(int chave){
        
        
        List<No> fila = new ArrayList<>();
        List<No> fila_marcados = new ArrayList<>();
        System.out.println("Nó percorrido:\t" + root.chave + ";");
        this.root.flag_visitado = true;
        fila_marcados.add(root);
        fila.add(root);
        boolean encontrado = false;
        outer:
        while (fila.size()>0){
            
            for(int i = 0 ; i < fila.get(0).getNos().size();i++){
                fila.add(fila.get(0).getNos().get(i));
                fila.get(0).getNos().get(i).flag_visitado = true;
                fila_marcados.add(fila.get(0).getNos().get(i));
                System.out.println("Nó percorrido:\t" + fila.get(0).getNos().get(i).getChave() + ";");
                
                if(fila.get(0).getNos().get(i).getChave() == chave){
                    encontrado = true;
                    break outer;
                }
            }
            fila.remove(0);
        }

        if(encontrado)
        	System.out.println("\nChave " + chave +" encontrada\nStatus:\tFim");
        else
        	System.out.println("\nChave " + chave +" não encontrada\nStatus:\tFim");
        
        System.out.print("Nós percorridos: ");
        int i = 0, j = 0;
        
        for (No num : fila_marcados) 		      
           i++;
        int array[] = new int[i];
        for (No num : fila_marcados) 
        	array[j++] = num.getChave();
        print2dArray(array);
    }
    
    void print2dArray(int v[]) {
        // Mostra o vetor v na tela
        for (int i = 0; i < v.length; i++) {
            if (i == (v.length) - 2)
                System.out.print(v[i] + " e ");
            else if (!(i == (v.length) - 1))
                System.out.print(v[i] + ", ");
            else
                System.out.print(v[i]);
        }
        System.out.println();
    }   
    
    void adcAresta(No n1, No n2){
        n1.getNos().add(n2);
    }
}
