import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayLista {
    
    private List<Contato> contatos;
    private int tamanho;

    public ArrayLista(int capacidade) {
        this.contatos = new ArrayList<>(capacidade);
        this.tamanho = 0;
    }

    public boolean adiciona(Contato contato) {
        boolean adicionou = contatos.add(contato);
        if (adicionou) {
            tamanho++;
        }
        return adicionou;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public int busca(Contato contato) {
        return contatos.indexOf(contato);
    }

    public Contato busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.contatos.get(posicao);
    }

    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        contatos.remove(posicao);
        tamanho--; 
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.contatos.get(i));
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.contatos.get(tamanho - 1));
        }
        s.append("]");
        return s.toString();
    }


    public boolean adiciona(int posicao, Contato contato) {
        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        contatos.add(posicao, contato);
        tamanho++;
        return true;
    }

    public Contato buscaPorNome(String nome) {
        for (Object contato : this.contatos) {
            Contato c = (Contato) contato;
            if (c.getNome().equals(nome)) {
                return c;
            }
        }
        return null;
    }
    
    public Contato buscaPorEmail(String email) {
        for (Object contato : this.contatos) {
            Contato c = (Contato) contato;
            if (c.getEmail().equals(email)) {
                return c;
            }
        }
        return null;
    }
    
    public Contato buscaPorTelefone(String telefone) {
        for (Object contato : this.contatos) {
            Contato c = (Contato) contato;
            if (c.getTelefone().equals(telefone)) {
                return c;
            }
        }
        return null;
    }

    public void ordenaPorNome() {
        Collections.sort(this.contatos, new Comparator<Contato>() {
            @Override
            public int compare(Contato c1, Contato c2) {
                return c1.getNome().compareTo(c2.getNome());
            }
        });
    }
    public void ordenaPorEmail() {
        Collections.sort(contatos, new Comparator<Contato>() {
            @Override
            public int compare(Contato c1, Contato c2) {
                return c1.getEmail().compareTo(c2.getEmail());
            }
        });
    }

    public void ordenaPorTelefone() {
        Collections.sort(contatos, new Comparator<Contato>() {
            @Override
            public int compare(Contato c1, Contato c2) {
                return c1.getTelefone().compareTo(c2.getTelefone());
            }
        });
    }
}

