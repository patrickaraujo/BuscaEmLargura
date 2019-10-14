package buscaLargura;

import java.util.ArrayList;
import java.util.List;

public class No {
	int chave;
    List<No> adj = new ArrayList<>();
    boolean flag_visitado= false;

    public No(int chave) {
        this.chave = chave;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public List<No> getNos() {
        return adj;
    }

    public void setNos(List<No> adj) {
        this.adj = adj;
    }

}
