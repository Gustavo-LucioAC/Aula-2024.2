public class Contato implements Comparable<Contato> {
    
    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email)
    {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int compareTo(Contato o) {
        return this.nome.compareToIgnoreCase(o.getNome());
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }
}
