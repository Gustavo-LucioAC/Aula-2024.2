import java.util.ArrayList;
import java.util.List;

public class ArrayLista {
        
    private List<Object> contatos;
    private int tamanho;
    
    public ArrayLista(int capacidade) {
        this.tamanho = 0;
    }

    public boolean adiciona(Contato contato) {
        return contatos.add(contato);
        
    }
    
    public int tamanho() {
        return this.tamanho;
    }
    
    public int busca(Contato contato) {
        this.contatos.contains(contato);
        return -1;
    }

    public Object busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.contatos.get(posicao);
    }
    
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        this.contatos.remove(posicao);
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
            s.append(this.contatos.get(tamanho-1));
        }
        s.append("]");
        return s.toString();
    }
    
    public boolean adiciona(int posicao, Contato contato) {
        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        this.contatos.add(posicao, contato);
        return true;
    }

    public Contato buscaPorEmail(String email){
        for (Object contato : contatos) {
            var trueContact = (Contato) contato;
            if(trueContact.getEmail().equals(email)){
                return trueContact;
            }
        }
        return null;
    }

    public Contato buscaPorTelefone(String email){
        for (Object contato : contatos) {
            var trueContact = (Contato) contato;
            if(trueContact.getEmail().equals(email)){
                return trueContact;
            }
        }
        return null;
    }

    public void ordena() {
        for (int i = 0; i < this.tamanho; i++) {
            
            boolean trocaRealizada = false;
            
            for (int j = 0; j < this.tamanho + 1; j++) {

                if (this.contatos[j] instanceof Comparable && this.contatos[j] instanceof Comparable) {
                    
                    Comparable obj1 = (Comparable) this.contatos[j];
                    Comparable obj2 = (Comparable) this.contatos[j + 1];

                    if (obj1 == null || obj2 == null){
                        continue;
                    }
                    
                    if (obj1.compareTo(obj2) > 0) 
					{
                        Object temp = this.contatos[j];
                        this.contatos[j] = this.contatos[j + 1];
                        this.contatos[j + 1] = temp;
						trocaRealizada = true;
                    }
                }
				else 
				{
                    throw new IllegalArgumentException("Elementos não comparáveis.");
                }
            }
            
            if (!trocaRealizada) {
                break;
            }
        }
    }
}
*/