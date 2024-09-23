import java.util.Arrays;

public class VetorContato {
    
    private Contato[] contatos;
    private int tamanho;
    
    public VetorContato(int capacidade) {
        this.contatos = new Contato[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(Contato contato) {
        if (this.tamanho < this.contatos.length) {
            this.contatos[this.tamanho] = contato;
            this.tamanho++;
            return true;
        }
        return false;
    }
    
    public void aumentaCapacidade() {
        if (this.tamanho == this.contatos.length) {
            Contato[] contatosNovos = new Contato[this.contatos.length * 2];
            for (int i = 0; i < this.contatos.length; i++) {
                contatosNovos[i] = this.contatos[i];
            }
            this.contatos = contatosNovos;
        }
    }
    
    public int tamanho() {
        return this.tamanho;
    }
    
    public int busca(Contato contato) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.contatos[i].equals(contato)) {
                return i;
            }
        }
        return -1;
    }

    public Contato busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.contatos[posicao];
    }
    
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.contatos[i] = this.contatos[i + 1];
        }
        this.contatos[this.tamanho - 1] = null;
        this.tamanho--;
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho; i++) {
            s.append(this.contatos[i]);
            if (i < this.tamanho - 1) {
                s.append(", ");
            }
        }
        s.append("]");
        return s.toString();
    }
    
    public boolean adiciona(int posicao, Contato contato) {
        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.contatos[i + 1] = this.contatos[i];
        }
        this.contatos[posicao] = contato;
        this.tamanho++;
        return true;
    }

    public void ordena() {
        Arrays.sort(this.contatos, 0, tamanho, (c1, c2) -> c1.getNome().compareTo(c2.getNome()));
    }
}
